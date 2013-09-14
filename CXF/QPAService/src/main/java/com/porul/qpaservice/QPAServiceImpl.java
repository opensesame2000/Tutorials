/**
 * @author Rajkumar Vellore
 * @since 14 Sep 2013
 */
package com.porul.qpaservice;

import java.util.HashMap;
import java.util.List;

import javax.jws.WebService;

import com.porul.qpaservice.ProductQueryComplexType.QueryItem;
import com.porul.qpaservice.ProductQueryResult.ResultItem;
import com.porul.inventory.*;

@WebService(endpointInterface = "com.porul.qpaservice.QPAService")
public class QPAServiceImpl implements QPAService {
	@Override
	public ProductQueryResult query(ProductQueryComplexType parameters)
			throws QueryInvalidQty {
		Product _prod;
		Inventory _inv = new Inventory();
		HashMap<String, Product> locInv = _inv.getInventory();

		ProductQueryResult result = new ProductQueryResult();
		List<QueryItem> queryItem = parameters.getQueryItem();

		for (QueryItem item : queryItem) {
			_prod = (Product) locInv.get(item.getProductId());
			if (item.getProductId().length() == 13) {// Check for EAN-13
				ResultItem resultItem = new ResultItem();
				resultItem.setProductId(item.getProductId());
				resultItem.setPrice(_prod.getPrice());
				resultItem.setProductName(_prod.getProductName());
				resultItem.setMaker(_prod.getMaker());
				if (item.getQuantity() <= 0) {// Throw invalid Quantity Exception
					throw new QueryInvalidQty("Invalid Quantity Exception for::"+item.getProductId()+" :Quantity:"+item.getQuantity().intValue());
				}

				if (_prod.getQuantity() < item.getQuantity()) {
					System.out.println("Requested quantity unavailable for: "+_prod.getProductId()+": Name:"+ _prod.getProductName());
				} else {
					result.getResultItem().add(resultItem);
				}
			} else {
				System.out.println("Invalid ID:: " + _prod.getProductId());
			}
		}
		return result;
	}
}
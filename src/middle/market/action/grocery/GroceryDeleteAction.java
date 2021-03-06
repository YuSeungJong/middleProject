package middle.market.action.grocery;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.market.service.GroceryService;
import middle.market.service.GroceryServiceImpl;
import middle.web.IAction;

public class GroceryDeleteAction implements IAction {

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String grocery_cod = request.getParameter("grocery_cod");
		
		GroceryService service = GroceryServiceImpl.getInstance();
		
		service.deleteGrocery(grocery_cod);
		
		return "/grocery/groceryList.do";
	}

}

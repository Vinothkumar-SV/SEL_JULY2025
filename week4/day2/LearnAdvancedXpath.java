package week4.day2;

public class LearnAdvancedXpath {
	
	//parent to child
	//parentXpath/childtagname
	//eg //p[@class='top']/input
	
	//child to parent
	//childXpath/parent::parenttagname
	//eg: //input[@class='inputLogin']/parent::p
	
	//GrandParent to grandChild
	//GrandParentXpath//grandChildtagname
	//eg: //form[@id='login']//input
	
	
	//grandChild to grandParent
	//grandChildXpath/ancestor::grandParenttagname
	//eg: //input[@class='inputLogin']/ancestor::form
	
	//younger to elder Sibling
	//siblingXpath/preceding-sibling::siblingtagname
		//eg://input[@id='username']/preceding-sibling::label

	//Elder to Younger Sibling
	//siblingXpath/following-sibling::siblingtagname
	
	

}

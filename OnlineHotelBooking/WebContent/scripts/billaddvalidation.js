function validateBillForm()
{
	
	var bId=document.getElementById("bid").value;
	var tAmt=document.getElementById("tmt").value;
	var bDate=document.getElementById("billdate").value;
	var bPaymentId=document.getElementById("payid").value;

	if(bId == null || bId=="")
		{
		window.alert("Bill Id can not empty");
		return false;
		}
	if(tAmt == null || tAmt=="")
		{
		window.alert("Total Amount can not empty");
		return false;
		}
	
	if(bDate == null || bDate=="")
		{
		window.alert("Bill Date can not empty");
		return false;
		}
	
	if(bPaymentId == null || bPaymentId=="")
	{
	window.alert("Payment Id can not empty");
	return false;
	}
	
		return true;
}
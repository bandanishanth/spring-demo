function validate(event) 
{

	var validated=true;

	var student_form=document.getElementById('f');

	if(student_form['studentName'].value=="")
	{
		//alert("Area Cannot be Negative");
		student_form['studentName'].style.borderColor="red";
		validated=false;
	}

	if(student_form['section'].value=="")
	{
		//alert("Year Cannot be Negative");
		student_form['section'].style.borderColor="red";
		validated=false;
	}

	return validated;
}

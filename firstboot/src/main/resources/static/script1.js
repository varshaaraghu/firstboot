

$(document).ready(
	function(){
		$('#country').change(
				function(){
					var selectedCountry = $(this).children("option:selected").val(); 
	               
					let country=selectedCountry;
					$.get("http://localhost:8898/api/countries/"+country,function(nations){
						let code="";
						for(let x in nations){
						 code+="<tr>";
						 code+="<td>"+nations[x].code+"</td>";
						 code+="<td>"+nations[x].name+"</td>";
						 code+="<td>"+nations[x].continent+"</td>";
						 code+="<td>"+nations[x].capital+"</td>";
						 code+="<td>"+nations[x].population+"</td>";
						 code+="</tr>"
						}
						$('#tdata1').html(code);
					});
								
				}
		
		)
	}	
);
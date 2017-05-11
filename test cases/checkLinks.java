//Checking all the links, whether they are working or not 

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total links are:" + links.size());
		for(int i = 0;i<links.size();i++){
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			verifyLinkActive(url);
			
		}
		
					
driver.quit();
		
	}

	public static void verifyLinkActive(String linkUrl) {
		 try 
	        {
	           URL url = new URL(linkUrl);
	           
	           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	           
	           httpURLConnect.setConnectTimeout(3000);
	           
	           httpURLConnect.connect();
	           
	           if(httpURLConnect.getResponseCode()==200)
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	            }
	          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " returned "+ HttpURLConnection.HTTP_NOT_FOUND);
	            }
	        } catch (Exception e) {
	           System.out.println(linkName + " generated exception");
	        }
	     
	} 
		

}


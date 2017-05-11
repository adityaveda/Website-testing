driver.get("https://sso.teachable.com/secure/42299/users/sign_up?reset_purchase_session=1");

		driver.findElement(By.id("user_name")).sendKeys(prop.getProperty("uiv"));
		driver.findElement(By.id("user_email")).sendKeys(prop.getProperty("eiv"));
		driver.findElement(By.id("user_password")).sendKeys(prop.getProperty("piv"));
		driver.findElement(By.id("user_password_confirmation")).sendKeys(prop.getProperty("cpiv"));
		driver.findElement(By.id("user_agreed_to_terms")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("commit")).click();
		try {
			Thread.sleep(2000);
			
		} catch (AssertionError e) {
			
			// TODO Auto-generated catch block
			System.out.println("Invalid credentials accepted on page");
			
		}
		
		driver.quit();

}
}

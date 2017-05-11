//checking objects on page
		WebElement link;
		link = driver.findElement(By.id("bmwcheck"));
		link.click();
		Thread.sleep(2000);
		
		
		WebElement alert= driver.findElement(By.id("alertbtn"));
		alert= driver.findElement(By.id("alertbtn"));
		alert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class PQR implements WebDriverEventListener {

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		System.out.println("afterAlertAccept");
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		System.out.println("afterAlertDismiss");
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("afterChangeValueOf");
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("afterClickOn");
		
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("afterFindBy");
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		System.out.println("afterNavigateBack");
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("afterNavigateForward");
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		System.out.println("afterNavigateRefresh");
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("afterNavigateTo");
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		System.out.println("afterScript");
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		System.out.println("beforeAlertAccept");
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		System.out.println("beforeAlertDismiss");
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("beforeChangeValueOf");
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("beforeClickOn");
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("beforeFindBy");
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		System.out.println("beforeNavigateBack");
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		System.out.println("beforeNavigateForward");
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		System.out.println("beforeNavigateRefresh");
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("beforeNavigateTo");
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		System.out.println("beforeScript");
		
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("onException");
		
	}

}

package sh.calaba.instrumentationbackend.actions.actionbar;

import sh.calaba.instrumentationbackend.InstrumentationBackend;
import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.actions.Action;


public class ClickOnActionBarHomeButton implements Action {

	@Override
	public Result execute(String... args) {
		
		InstrumentationBackend.solo.clickOnActionBarHomeButton();
		System.out.println("click initiated (purportedly)");
		
		return Result.successResult();
	}

	@Override
	public String key() {
		
		return "click_on_action_bar_home_button";
	}

}

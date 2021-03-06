package com.fuzhu8.inspector.dexposed;

import com.fuzhu8.inspector.advisor.MethodHookParam;

/**
 * @author zhkl0228
 *
 */
public class DexposedMethodHookParam extends MethodHookParam {
	
	private final com.taobao.android.dexposed.XC_MethodHook.MethodHookParam param;

	public DexposedMethodHookParam(com.taobao.android.dexposed.XC_MethodHook.MethodHookParam param) {
		super(param.method, param.thisObject, param.args);
		this.param = param;
	}

	@Override
	public Object getResult() {
		return param.getResult();
	}

	@Override
	public void setResult(Object result) {
		param.setResult(result);
	}

	@Override
	public Throwable getThrowable() {
		return param.getThrowable();
	}

	@Override
	public boolean hasThrowable() {
		return param.hasThrowable();
	}

	@Override
	public void setThrowable(Throwable throwable) {
		param.setThrowable(throwable);
	}

	@Override
	public Object getResultOrThrowable() throws Throwable {
		return param.getResultOrThrowable();
	}

	@Override
	public Object getObjectExtra(String key) {
		return param.getObjectExtra(key);
	}

	@Override
	public void setObjectExtra(String key, Object o) {
		param.setObjectExtra(key, o);
	}
}

package com.sdm.mylibrary.callbacks;


public interface PostJsonAsynListener<T> {

	public void onPostSuccess(int id, T result);

	public void onPostError(int id, int error);

}

package com.sdm.mylibrary.permission;

/**
 * Created by parmils
 */
public interface PermissionCallback {
    public void permissionGranted(int permissionRequestId);

    public void permissionRefused(int permissionRequestId);
}

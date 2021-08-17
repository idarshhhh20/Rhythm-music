package com.ldt.musicr.permission;


public interface PermissionListener {

void permissionsChanged(String permissionChanged);

    void permissionsGranted(String permissionGranted);

    void permissionsRemoved(String permissionRemoved);
}

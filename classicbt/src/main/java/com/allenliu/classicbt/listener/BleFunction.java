package com.allenliu.classicbt.listener;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.allenliu.classicbt.scan.ScanConfig;

import java.util.Set;

/**
 * @author AllenLiu
 * @version 1.0
 * @date 2019/5/8
 * @copyRight 四川金信石信息技术有限公司
 * @since 1.0
 */
public interface BleFunction {

    void init(Context context);
    void setConnectionUUID(String uuid);

    boolean isSupported();

    void setResultListener(ScanResultListener resultListener);

    Set<BluetoothDevice> getPairedDevices();

    void scan(ScanConfig scanConfig, ScanResultListener scanResultListener);

    void stopSearch();

    void connect(BluetoothDevice device, ConnectResultlistner connectResultlistner);
    void destory();
    void pin(BluetoothDevice device, PinResultListener resultListener);
    void cancelPin(BluetoothDevice device, ResultListener resultListener);
    void setServerConnectResultListener(ConnectResultlistner connectResultListener);
    void registerServerConnection(ConnectResultlistner connectResultListener);




}

package com.example.test_plugin_example;

import android.app.Activity;
import android.content.Context;

import androidx.annotation.NonNull;

import com.example.test_plugin.TestPlugin;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.flutter.view.FlutterView;
import io.flutter.view.TextureRegistry;

public class MainActivity extends FlutterActivity {
    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
//        super.configureFlutterEngine(flutterEngine);
        flutterEngine.getPlugins().add(new TestPlugin(this));
    }
}

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.measurement.h0;
import t0.b;
import v0.e;
import w0.x;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@KeepName
/* loaded from: classes4.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3676b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f3677a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i3, Intent intent) {
        super.onActivityResult(i, i3, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f3677a = 0;
            setResult(i3, intent);
            if (booleanExtra) {
                e d10 = e.d(this);
                if (i3 != -1) {
                    if (i3 == 0) {
                        d10.e(new b(null, null, 13), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    h0 h0Var = d10.v;
                    h0Var.sendMessage(h0Var.obtainMessage(3));
                }
            }
        } else if (i == 2) {
            this.f3677a = 0;
            setResult(i3, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f3677a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3677a = bundle.getInt("resolution");
        }
        if (this.f3677a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent != null) {
                try {
                    googleApiActivity = this;
                    try {
                        googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        googleApiActivity.f3677a = 1;
                    } catch (ActivityNotFoundException e10) {
                        e = e10;
                        if (extras.getBoolean("notify_manager", true)) {
                            e.d(this).e(new b(null, null, 22), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String N = androidx.compose.ui.b.N("Activity not found while launching ", pendingIntent.toString(), ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                N = N.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", N, e);
                        }
                        googleApiActivity.f3677a = 1;
                        finish();
                    } catch (IntentSender.SendIntentException e11) {
                        e = e11;
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                        finish();
                    }
                } catch (ActivityNotFoundException e12) {
                    e = e12;
                    googleApiActivity = this;
                } catch (IntentSender.SendIntentException e13) {
                    e = e13;
                }
            } else {
                x.g(num);
                t0.e.f10511d.c(this, num.intValue(), this);
                this.f3677a = 1;
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f3677a);
        super.onSaveInstanceState(bundle);
    }
}

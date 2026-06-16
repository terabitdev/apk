package io.elevenlabs.data.services;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import h8.u;
import io.elevenlabs.domain.services.VibrationService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/data/services/AndroidVibrationService;", "Lio/elevenlabs/domain/services/VibrationService;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lsn/z;", "vibrateShort", "()V", "Landroid/content/Context;", "Landroid/os/Vibrator;", "vibrator$delegate", "Lsn/h;", "getVibrator", "()Landroid/os/Vibrator;", "vibrator", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AndroidVibrationService implements VibrationService {
    private static final long SHORT_VIBRATION_MS = 50;
    private final Context context;

    /* renamed from: vibrator$delegate, reason: from kotlin metadata */
    private final sn.h vibrator;

    public AndroidVibrationService(Context context) {
        context.getClass();
        this.context = context;
        this.vibrator = new o(new f(this, 1));
    }

    private final Vibrator getVibrator() {
        return (Vibrator) this.vibrator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vibrator vibrator_delegate$lambda$0(AndroidVibrationService androidVibrationService) {
        VibratorManager vibratorManager;
        Vibrator defaultVibrator;
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = androidVibrationService.context.getSystemService("vibrator_manager");
            if (u.y(systemService)) {
                vibratorManager = u.m(systemService);
            } else {
                vibratorManager = null;
            }
            if (vibratorManager != null) {
                defaultVibrator = vibratorManager.getDefaultVibrator();
                return defaultVibrator;
            }
        } else {
            Object systemService2 = androidVibrationService.context.getSystemService("vibrator");
            if (systemService2 instanceof Vibrator) {
                return (Vibrator) systemService2;
            }
        }
        return null;
    }

    @Override // io.elevenlabs.domain.services.VibrationService
    public void vibrateShort() {
        VibrationEffect createOneShot;
        Vibrator vibrator = getVibrator();
        if (vibrator != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                createOneShot = VibrationEffect.createOneShot(50L, -1);
                vibrator.vibrate(createOneShot);
            } else {
                vibrator.vibrate(SHORT_VIBRATION_MS);
            }
        }
    }
}

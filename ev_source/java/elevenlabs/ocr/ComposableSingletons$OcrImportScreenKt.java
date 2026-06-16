package io.elevenlabs.ocr;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.elevenlabs.ui.components.ButtonKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$OcrImportScreenKt {
    public static final ComposableSingletons$OcrImportScreenKt INSTANCE = new ComposableSingletons$OcrImportScreenKt();
    private static ho.p lambda$1760686258 = new c3.j(new Object(), false, 1760686258);

    public static final z lambda_1760686258$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
            String R = kj.c.R(qVar, R.string.ocr_camera_permission_open_app_settings);
            boolean h10 = qVar.h(context);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new a(context, 0);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, null, null, null, null, null, false, false, false, qVar, 0, 1020);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1760686258$lambda$0$0$0(Context context) {
        OcrImportScreenKt.openAppSettings(context);
        return z.f31622a;
    }

    public final ho.p getLambda$1760686258$ocr_release() {
        return lambda$1760686258;
    }
}

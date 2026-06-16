package io.elevenlabs.ui.components;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.extensions.ContextExtensionsKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "active", "isDebugBuild", "isScreenRecordingEnabled", "Lsn/z;", "SecureContent", "(ZZZLu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SecureContentKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SecureContent(final boolean z6, final boolean z10, boolean z11, u2.m mVar, final int i10, final int i11) {
        int i12;
        final boolean z12;
        int i13;
        boolean z13;
        u2.r1 r10;
        boolean z14;
        boolean z15;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1846264711);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            z12 = z11;
            if (qVar.g(z12)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            boolean z16 = false;
            if ((i12 & 147) == 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!qVar.O(i12 & 1, z13)) {
                if (i16 != 0) {
                    z12 = true;
                }
                final Activity findActivity = ContextExtensionsKt.findActivity((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b));
                Boolean valueOf = Boolean.valueOf(z6);
                Boolean valueOf2 = Boolean.valueOf(z12);
                if ((i12 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i12 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z17 = z14 | z15;
                if ((i12 & 896) == 256) {
                    z16 = true;
                }
                boolean h10 = z17 | z16 | qVar.h(findActivity);
                Object L = qVar.L();
                if (h10 || L == u2.l.f33918a) {
                    L = new ho.l() { // from class: io.elevenlabs.ui.components.e2
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            u2.h0 SecureContent$lambda$0$0;
                            SecureContent$lambda$0$0 = SecureContentKt.SecureContent$lambda$0$0(z6, z10, z12, findActivity, (u2.i0) obj);
                            return SecureContent$lambda$0$0;
                        }
                    };
                    qVar.h0(L);
                }
                u2.r.d(valueOf, valueOf2, (ho.l) L, qVar);
            } else {
                qVar.R();
            }
            final boolean z18 = z12;
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.f2
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z SecureContent$lambda$1;
                        int intValue = ((Integer) obj2).intValue();
                        SecureContent$lambda$1 = SecureContentKt.SecureContent$lambda$1(z6, z10, z18, i10, i11, (u2.m) obj, intValue);
                        return SecureContent$lambda$1;
                    }
                };
                return;
            }
            return;
        }
        z12 = z11;
        boolean z162 = false;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z13)) {
        }
        final boolean z182 = z12;
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u2.h0 SecureContent$lambda$0$0(boolean z6, boolean z10, final boolean z11, final Activity activity, u2.i0 i0Var) {
        Window window;
        i0Var.getClass();
        if (z6 && !z10 && !z11 && activity != null && (window = activity.getWindow()) != null) {
            window.setFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        return new u2.h0() { // from class: io.elevenlabs.ui.components.SecureContentKt$SecureContent$lambda$0$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                Activity activity2;
                Window window2;
                if (!z11 && (activity2 = activity) != null && (window2 = activity2.getWindow()) != null) {
                    window2.clearFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sn.z SecureContent$lambda$1(boolean z6, boolean z10, boolean z11, int i10, int i11, u2.m mVar, int i12) {
        SecureContent(z6, z10, z11, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}

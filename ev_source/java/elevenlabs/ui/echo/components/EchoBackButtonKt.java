package io.elevenlabs.ui.echo.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ho.a;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.f;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.EchoIconButtonKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "Lio/elevenlabs/ui/components/EchoButtonVariant;", "variant", "Lio/elevenlabs/ui/components/EchoButtonSize;", "size", "EchoBackButton", "(Lho/a;Li3/t;Lio/elevenlabs/ui/components/EchoButtonVariant;Lio/elevenlabs/ui/components/EchoButtonSize;Lu2/m;II)V", "Preview_EchoBackButton", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoBackButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EchoBackButton(a aVar, t tVar, EchoButtonVariant echoButtonVariant, EchoButtonSize echoButtonSize, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        int ordinal;
        int i15;
        int i16;
        int i17;
        boolean z6;
        EchoButtonSize echoButtonSize2;
        t tVar3;
        EchoButtonVariant echoButtonVariant2;
        r1 r10;
        t tVar4;
        EchoButtonVariant echoButtonVariant3;
        EchoButtonSize echoButtonSize3;
        int i18;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(456007157);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            int i20 = -1;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                if (echoButtonVariant == null) {
                    ordinal = -1;
                } else {
                    ordinal = echoButtonVariant.ordinal();
                }
                if (qVar.d(ordinal)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
            }
            i16 = i11 & 8;
            if (i16 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (echoButtonSize != null) {
                    i20 = echoButtonSize.ordinal();
                }
                if (qVar.d(i20)) {
                    i17 = 2048;
                } else {
                    i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i17;
            }
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i19 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                if (i14 != 0) {
                    echoButtonVariant3 = EchoButtonVariant.Secondary;
                } else {
                    echoButtonVariant3 = echoButtonVariant;
                }
                if (i16 != 0) {
                    echoButtonSize3 = EchoButtonSize.Medium;
                } else {
                    echoButtonSize3 = echoButtonSize;
                }
                int i21 = (i12 << 3) & 1008;
                int i22 = i12 << 6;
                EchoIconButtonKt.EchoIconButton(R.drawable.chevron_left_round, aVar, tVar4, c.R(qVar, R.string.accessibility_go_back), echoButtonVariant3, echoButtonSize3, false, false, false, qVar, i21 | (57344 & i22) | (i22 & 458752), 448);
                tVar3 = tVar4;
                echoButtonVariant2 = echoButtonVariant3;
                echoButtonSize2 = echoButtonSize3;
            } else {
                qVar.R();
                echoButtonSize2 = echoButtonSize;
                tVar3 = tVar2;
                echoButtonVariant2 = echoButtonVariant;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new f(aVar, tVar3, echoButtonVariant2, echoButtonSize2, i10, i11, 15, false);
                return;
            }
            return;
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        int i202 = -1;
        if (i14 == 0) {
        }
        i16 = i11 & 8;
        if (i16 == 0) {
        }
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z EchoBackButton$lambda$0(a aVar, t tVar, EchoButtonVariant echoButtonVariant, EchoButtonSize echoButtonSize, int i10, int i11, m mVar, int i12) {
        EchoBackButton(aVar, tVar, echoButtonVariant, echoButtonSize, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_EchoBackButton(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(2123739435);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoBackButtonKt.INSTANCE.m1963getLambda$8728187$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 3);
        }
    }

    public static final z Preview_EchoBackButton$lambda$0(int i10, m mVar, int i11) {
        Preview_EchoBackButton(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

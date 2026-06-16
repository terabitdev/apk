package io.elevenlabs.readerapp.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "", "orderLabel", "Li3/t;", "modifier", "Lkotlin/Function1;", "Lsn/z;", "onNavigateToReadDetails", "ReadSection", "(Lio/elevenlabs/domain/model/ReadMeta;Ljava/lang/String;Li3/t;Lho/l;Lu2/m;II)V", "Preview_ReadSection", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadSectionKt {
    public static final void Preview_ReadSection(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(249436138);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$ReadSectionKt.INSTANCE.m1080getLambda$272376320$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 6);
        }
    }

    public static final sn.z Preview_ReadSection$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadSection(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadSection(ReadMeta readMeta, String str, i3.t tVar, ho.l lVar, u2.m mVar, int i10, int i11) {
        int i12;
        String str2;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        int i14;
        int i15;
        int i16;
        readMeta.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1186245875);
        if ((i10 & 6) == 0) {
            if (qVar.h(readMeta)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            str2 = str;
            if (qVar.f(str2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        } else {
            str2 = str;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i10 & 3072) == 0) {
                if (qVar.h(lVar)) {
                    i14 = 2048;
                } else {
                    i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i14;
            }
            boolean z10 = false;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i17 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                }
                boolean h10 = qVar.h(readMeta) | z10;
                Object L = qVar.L();
                if (h10 || L == u2.l.f33918a) {
                    L = new t(lVar, readMeta, 1);
                    qVar.h0(L);
                }
                ReadMetaRowKt.PublicReadMetaRow(readMeta, l1.n.p(tVar4, false, null, null, null, (ho.a) L, 15), str2, false, false, qVar, (i12 & 14) | ((i12 << 3) & 896), 24);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.l(readMeta, str, tVar3, lVar, i10, i11, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i10 & 3072) == 0) {
        }
        boolean z102 = false;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ReadSection$lambda$0$0(ho.l lVar, ReadMeta readMeta) {
        lVar.invoke(readMeta.getReadId());
        return sn.z.f31622a;
    }

    public static final sn.z ReadSection$lambda$1(ReadMeta readMeta, String str, i3.t tVar, ho.l lVar, int i10, int i11, u2.m mVar, int i12) {
        ReadSection(readMeta, str, tVar, lVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}

package io.elevenlabs.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li3/t;", "modifier", "Lr1/g;", "horizontalArrangement", "Li3/f;", "verticalAlignment", "Lkotlin/Function1;", "Lr1/l2;", "Lsn/z;", FirebaseAnalytics.Param.CONTENT, "RowWithInvertedMeasurement", "(Li3/t;Lr1/g;Li3/f;Lho/q;Lu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RowWithInvertedMeasurementKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h5.m.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RowWithInvertedMeasurement(i3.t tVar, r1.g gVar, i3.f fVar, ho.q qVar, u2.m mVar, int i10, int i11) {
        i3.t tVar2;
        int i12;
        int i13;
        r1.g gVar2;
        int i14;
        int i15;
        i3.f fVar2;
        int i16;
        boolean z6;
        i3.t tVar3;
        r1.g gVar3;
        i3.f fVar3;
        u2.r1 r10;
        i3.t tVar4;
        r1.g gVar4;
        i3.f fVar4;
        h5.m mVar2;
        int i17;
        qVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-13040516);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            gVar2 = gVar;
            if (qVar2.f(gVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            i15 = i11 & 4;
            if (i15 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                fVar2 = fVar;
                if (qVar2.f(fVar2)) {
                    i16 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i16 = 128;
                }
                i12 |= i16;
                if ((i10 & 3072) == 0) {
                    if (qVar2.h(qVar)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                }
                if ((i12 & 1171) != 1170) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i12 & 1, z6)) {
                    if (i18 != 0) {
                        tVar4 = i3.q.f13017a;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i19 != 0) {
                        gVar4 = r1.j.f29228a;
                    } else {
                        gVar4 = gVar2;
                    }
                    if (i15 != 0) {
                        fVar4 = i3.d.f13004y0;
                    } else {
                        fVar4 = fVar2;
                    }
                    u2.t2 t2Var = i4.j1.f13135n;
                    h5.m mVar3 = (h5.m) qVar2.j(t2Var);
                    int ordinal = mVar3.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            mVar2 = h5.m.f12093a;
                        } else {
                            c6.p();
                            return;
                        }
                    } else {
                        mVar2 = h5.m.f12094b;
                    }
                    i3.t tVar5 = tVar4;
                    u2.r.a(t2Var.a(mVar2), c3.k.d(1977428284, true, new f2.o(tVar5, gVar4, fVar4, mVar3, qVar, 7), qVar2), qVar2, 56);
                    tVar3 = tVar5;
                    gVar3 = gVar4;
                    fVar3 = fVar4;
                } else {
                    qVar2.R();
                    tVar3 = tVar2;
                    gVar3 = gVar2;
                    fVar3 = fVar2;
                }
                r10 = qVar2.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.f(tVar3, gVar3, fVar3, qVar, i10, i11, 7);
                    return;
                }
                return;
            }
            fVar2 = fVar;
            if ((i10 & 3072) == 0) {
            }
            if ((i12 & 1171) != 1170) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar2.r();
            if (r10 != null) {
            }
        }
        gVar2 = gVar;
        i15 = i11 & 4;
        if (i15 == 0) {
        }
        fVar2 = fVar;
        if ((i10 & 3072) == 0) {
        }
        if ((i12 & 1171) != 1170) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 != null) {
        }
    }

    public static final sn.z RowWithInvertedMeasurement$lambda$0(i3.t tVar, r1.g gVar, i3.f fVar, h5.m mVar, ho.q qVar, u2.m mVar2, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar2;
        if (qVar2.O(i10 & 1, z6)) {
            r1.k2 a10 = r1.i2.a(gVar, fVar, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(tVar, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar2);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c5, qVar2);
            u2.r.a(i4.j1.f13135n.a(mVar), c3.k.d(-184026528, true, new d2(qVar, 2), qVar2), qVar2, 56);
            qVar2.p(true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z RowWithInvertedMeasurement$lambda$0$0$0(ho.q qVar, r1.l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i10 & 1, z6)) {
            qVar.invoke(l2Var, qVar2, 0);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z RowWithInvertedMeasurement$lambda$1(i3.t tVar, r1.g gVar, i3.f fVar, ho.q qVar, int i10, int i11, u2.m mVar, int i12) {
        RowWithInvertedMeasurement(tVar, gVar, fVar, qVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}

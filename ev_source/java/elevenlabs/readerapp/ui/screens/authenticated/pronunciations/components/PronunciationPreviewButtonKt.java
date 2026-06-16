package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.components;

import c3.o;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import fm.g;
import h5.f;
import ho.a;
import i3.t;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.j;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import kj.c;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import m3.h;
import p3.x;
import q2.y2;
import q2.y4;
import r1.d;
import r1.p;
import r1.p2;
import sn.k;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aA\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/domain/model/PronunciationPreviewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/components/PronunciationPreviewButtonVariant;", "variant", "Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "", Constants.ENABLE_DISABLE, "PronunciationPreviewButton", "(Lio/elevenlabs/domain/model/PronunciationPreviewState;Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/components/PronunciationPreviewButtonVariant;Lho/a;Li3/t;ZLu2/m;II)V", "PronunciationPreviewButton_PronunciationPreviewButton", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PronunciationPreviewButtonKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PronunciationPreviewButtonVariant.values().length];
            try {
                iArr[PronunciationPreviewButtonVariant.TEXT_FIELD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PronunciationPreviewButtonVariant.ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PronunciationPreviewState.values().length];
            try {
                iArr2[PronunciationPreviewState.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PronunciationPreviewState.Playing.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PronunciationPreviewState.Stopped.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PronunciationPreviewButton(PronunciationPreviewState pronunciationPreviewState, PronunciationPreviewButtonVariant pronunciationPreviewButtonVariant, a aVar, t tVar, boolean z6, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        t tVar3;
        boolean z12;
        r1 r10;
        t tVar4;
        boolean z13;
        k kVar;
        long b10;
        boolean z14;
        boolean z15;
        boolean z16;
        int i16;
        int i17;
        int i18;
        pronunciationPreviewState.getClass();
        pronunciationPreviewButtonVariant.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(1851394114);
        if ((i10 & 6) == 0) {
            if (qVar.d(pronunciationPreviewState.ordinal())) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.d(pronunciationPreviewButtonVariant.ordinal())) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        int i19 = i11 & 8;
        if (i19 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                z10 = z6;
                if (qVar.g(z10)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((i12 & 9363) != 9362) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (qVar.O(i12 & 1, z11)) {
                    i3.q qVar2 = i3.q.f13017a;
                    if (i19 != 0) {
                        tVar4 = qVar2;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    int i20 = WhenMappings.$EnumSwitchMapping$0[pronunciationPreviewButtonVariant.ordinal()];
                    if (i20 != 1) {
                        if (i20 == 2) {
                            kVar = new k(new f(20), new f(8));
                        } else {
                            c6.p();
                            return;
                        }
                    } else {
                        kVar = new k(new f(24), new f(16));
                    }
                    float f10 = ((f) kVar.f31600a).f12083a;
                    float f11 = ((f) kVar.f31601b).f12083a;
                    if (z13) {
                        qVar.X(-1087523058);
                        b10 = ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable).getText().m2185getPrimary0d7_KjU();
                        qVar.p(false);
                    } else {
                        qVar.X(-1087466948);
                        b10 = x.b(0.3f, ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable).getText().m2185getPrimary0d7_KjU());
                        qVar.p(false);
                    }
                    t c5 = h.c(tVar4, z1.h.f39128a);
                    if (pronunciationPreviewState != PronunciationPreviewState.Loading) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i12 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    Object L = qVar.L();
                    if (z15 || L == l.f33918a) {
                        L = new g(24, aVar);
                        qVar.h0(L);
                    }
                    t E = d.E(n.p(c5, z14, null, null, null, (a) L, 14), f11);
                    f1 d10 = p.d(i3.d.f13001e, false);
                    int hashCode = Long.hashCode(qVar.T);
                    o l4 = qVar.l();
                    t c10 = i3.a.c(E, qVar);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    r.J(h4.g.f11907f, d10, qVar);
                    r.J(h4.g.f11906e, l4, qVar);
                    r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                    r.F(h4.g.f11909h, qVar);
                    r.J(h4.g.f11905d, c10, qVar);
                    int i21 = WhenMappings.$EnumSwitchMapping$1[pronunciationPreviewState.ordinal()];
                    if (i21 != 1) {
                        if (i21 != 2) {
                            if (i21 == 3) {
                                qVar.X(1757446440);
                                y2.a(kd.a.M(R.drawable.play_lg, qVar, 0), c.R(qVar, io.elevenlabs.readerapp.R.string.pronunciations_screens_listen_content_description), p2.o(qVar2, f10), b10, qVar, u3.c.$stable, 0);
                                qVar.p(false);
                            } else {
                                throw b.h(1580689403, qVar, false);
                            }
                        } else {
                            qVar.X(1757047687);
                            y2.a(kd.a.M(R.drawable.pause_lg, qVar, 0), c.R(qVar, io.elevenlabs.readerapp.R.string.pronunciations_screens_listen_content_description), p2.o(qVar2, f10), b10, qVar, u3.c.$stable, 0);
                            qVar.p(false);
                        }
                        z16 = true;
                    } else {
                        qVar.X(1756784404);
                        z16 = true;
                        y4.a(p2.o(qVar2, f10), b10, 2, 0L, 0, u.P, qVar, 384, 56);
                        qVar = qVar;
                        qVar.p(false);
                    }
                    qVar.p(z16);
                    tVar3 = tVar4;
                    z12 = z13;
                } else {
                    qVar.R();
                    tVar3 = tVar2;
                    z12 = z10;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new j(pronunciationPreviewState, pronunciationPreviewButtonVariant, aVar, tVar3, z12, i10, i11);
                    return;
                }
                return;
            }
            z10 = z6;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar.O(i12 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        z10 = z6;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z PronunciationPreviewButton$lambda$0$0(a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z PronunciationPreviewButton$lambda$2(PronunciationPreviewState pronunciationPreviewState, PronunciationPreviewButtonVariant pronunciationPreviewButtonVariant, a aVar, t tVar, boolean z6, int i10, int i11, m mVar, int i12) {
        PronunciationPreviewButton(pronunciationPreviewState, pronunciationPreviewButtonVariant, aVar, tVar, z6, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void PronunciationPreviewButton_PronunciationPreviewButton(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1350317921);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PronunciationPreviewButtonKt.INSTANCE.m1630getLambda$1768621833$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 12);
        }
    }

    public static final z PronunciationPreviewButton_PronunciationPreviewButton$lambda$0(int i10, m mVar, int i11) {
        PronunciationPreviewButton_PronunciationPreviewButton(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

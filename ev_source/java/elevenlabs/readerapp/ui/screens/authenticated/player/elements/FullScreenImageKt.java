package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.m0;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.j1;
import io.elevenlabs.ui.components.ZoomableBoxKt;
import io.elevenlabs.ui.components.ZoomableBoxScope;
import io.elevenlabs.ui.extensions.CoilExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a9\u0010\u0006\u001a\u00020\u00022\u001e\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerViewModel;", "Lsn/z;", "action", "", "fullScreenImageSrc", "FullScreenImage", "(Lho/l;Ljava/lang/String;Lu2/m;I)V", "FullScreenImage_data_src", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class FullScreenImageKt {
    public static final void FullScreenImage(final ho.l lVar, final String str, u2.m mVar, final int i10) {
        int i11;
        boolean z6;
        r1 r10;
        ho.p pVar;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1856466345);
        if ((i10 & 6) == 0) {
            if (qVar.h(lVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            int i14 = i11 & 14;
            if (i14 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (z10 || L == eVar) {
                L = new p(lVar, 0);
                qVar.h0(L);
            }
            m0.a((ho.a) L, false, 0, qVar, 1);
            if (str == null) {
                r10 = qVar.r();
                if (r10 != null) {
                    final int i15 = 0;
                    pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.q
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z FullScreenImage$lambda$1;
                            sn.z FullScreenImage$lambda$4;
                            int i16 = i15;
                            u2.m mVar2 = (u2.m) obj;
                            int intValue = ((Integer) obj2).intValue();
                            switch (i16) {
                                case 0:
                                    FullScreenImage$lambda$1 = FullScreenImageKt.FullScreenImage$lambda$1(lVar, str, i10, mVar2, intValue);
                                    return FullScreenImage$lambda$1;
                                default:
                                    FullScreenImage$lambda$4 = FullScreenImageKt.FullScreenImage$lambda$4(lVar, str, i10, mVar2, intValue);
                                    return FullScreenImage$lambda$4;
                            }
                        }
                    };
                    r10.f34012d = pVar;
                }
                return;
            }
            i3.t h10 = l1.n.h(p2.d(i3.q.f13017a, 1.0f), ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            if (i14 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object L2 = qVar.L();
            if (z11 || L2 == eVar) {
                L2 = new p(lVar, 1);
                qVar.h0(L2);
            }
            ZoomableBoxKt.ZoomableBox(l1.n.p(h10, false, null, null, null, (ho.a) L2, 15), c3.k.d(340276411, true, new r(str, 0), qVar), qVar, 48, 0);
        } else {
            qVar.R();
        }
        r10 = qVar.r();
        if (r10 != null) {
            final int i16 = 1;
            pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.q
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z FullScreenImage$lambda$1;
                    sn.z FullScreenImage$lambda$4;
                    int i162 = i16;
                    u2.m mVar2 = (u2.m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i162) {
                        case 0:
                            FullScreenImage$lambda$1 = FullScreenImageKt.FullScreenImage$lambda$1(lVar, str, i10, mVar2, intValue);
                            return FullScreenImage$lambda$1;
                        default:
                            FullScreenImage$lambda$4 = FullScreenImageKt.FullScreenImage$lambda$4(lVar, str, i10, mVar2, intValue);
                            return FullScreenImage$lambda$4;
                    }
                }
            };
            r10.f34012d = pVar;
        }
    }

    public static final sn.z FullScreenImage$lambda$0$0(ho.l lVar) {
        lVar.invoke(new o(16));
        return sn.z.f31622a;
    }

    public static final sn.z FullScreenImage$lambda$0$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.closeImage();
        return sn.z.f31622a;
    }

    public static final sn.z FullScreenImage$lambda$1(ho.l lVar, String str, int i10, u2.m mVar, int i11) {
        FullScreenImage(lVar, str, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final sn.z FullScreenImage$lambda$2$0(ho.l lVar) {
        lVar.invoke(new o(15));
        return sn.z.f31622a;
    }

    public static final sn.z FullScreenImage$lambda$2$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.closeImage();
        return sn.z.f31622a;
    }

    public static final sn.z FullScreenImage$lambda$3(String str, ZoomableBoxScope zoomableBoxScope, u2.m mVar, int i10) {
        zoomableBoxScope.getClass();
        u2.q qVar = (u2.q) mVar;
        ad.h srcOrData = CoilExtensionsKt.srcOrData(new ad.h((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b)), str, qVar, 0);
        srcOrData.b();
        qc.m.b(srcOrData.a(), null, h0.t(p2.d(i3.q.f13017a, 1.0f), zoomableBoxScope.getScale(), zoomableBoxScope.getScale(), t2.u.P, Float.intBitsToFloat((int) (zoomableBoxScope.mo1886getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (zoomableBoxScope.mo1886getOffsetF1C5BW0() & 4294967295L)), zoomableBoxScope.getRotation(), null, 524004), null, f4.q.f8840c, null, qVar, 1572912, 4024);
        return sn.z.f31622a;
    }

    public static final sn.z FullScreenImage$lambda$4(ho.l lVar, String str, int i10, u2.m mVar, int i11) {
        FullScreenImage(lVar, str, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void FullScreenImage_data_src(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-17665381);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(17);
                qVar.h0(L);
            }
            FullScreenImage((ho.l) L, "data:image/png;base64, iVBORw0KGgoAAAANSUhEUgAAAAUA\n    AAAFCAYAAACNbyblAAAAHElEQVQI12P4//8/w38GIAXDIBKE0DHxgljNBAAO\n        9TXL0Y4OHwAAAABJRU5ErkJggg==", qVar, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 20);
        }
    }

    public static final sn.z FullScreenImage_data_src$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z FullScreenImage_data_src$lambda$1(int i10, u2.m mVar, int i11) {
        FullScreenImage_data_src(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

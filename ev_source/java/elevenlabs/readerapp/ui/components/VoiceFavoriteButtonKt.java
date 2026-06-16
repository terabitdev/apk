package io.elevenlabs.readerapp.ui.components;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.VoiceFavoriteButtonState;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.extensions.SafeHapticFeedback;
import io.elevenlabs.ui.extensions.SafeHapticFeedbackKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.y2;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function0;", "Lsn/z;", "onClick", "VoiceFavoriteButton", "(Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState;Lho/a;Lu2/m;I)V", "Preview_VoiceFavoriteButton", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoiceFavoriteButtonKt {
    public static final void Preview_VoiceFavoriteButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1750361034);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(i3.q.f13017a, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            long j4 = p3.x.f26427b;
            VoiceFavoriteButtonState.Favorite favorite = new VoiceFavoriteButtonState.Favorite(j4, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new a(17);
                qVar.h0(L);
            }
            VoiceFavoriteButton(favorite, (ho.a) L, qVar, 48);
            VoiceFavoriteButtonState.NonFavorite nonFavorite = new VoiceFavoriteButtonState.NonFavorite(j4, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(18);
                qVar.h0(L2);
            }
            VoiceFavoriteButton(nonFavorite, (ho.a) L2, qVar, 48);
            VoiceFavoriteButtonState.Loading loading = new VoiceFavoriteButtonState.Loading(j4, null);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(19);
                qVar.h0(L3);
            }
            VoiceFavoriteButton(loading, (ho.a) L3, qVar, 48);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 18);
        }
    }

    public static final sn.z Preview_VoiceFavoriteButton$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceFavoriteButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void VoiceFavoriteButton(VoiceFavoriteButtonState voiceFavoriteButtonState, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        String str;
        int i12;
        long m1107getColor0d7_KjU;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        boolean h10;
        int i14;
        voiceFavoriteButtonState.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1386812836);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = qVar.f(voiceFavoriteButtonState);
            } else {
                h10 = qVar.h(voiceFavoriteButtonState);
            }
            if (h10) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            SafeHapticFeedback safeHapticFeedback = SafeHapticFeedbackKt.safeHapticFeedback(qVar, 0);
            boolean z13 = voiceFavoriteButtonState instanceof VoiceFavoriteButtonState.Favorite;
            String str2 = "";
            if (z13) {
                qVar.X(1287281220);
                str = kj.c.R(qVar, R.string.voice_row_accessibility_remove_favorite);
                qVar.p(false);
            } else if (voiceFavoriteButtonState instanceof VoiceFavoriteButtonState.NonFavorite) {
                qVar.X(1287284929);
                str = kj.c.R(qVar, R.string.voice_row_accessibility_add_favorite);
                qVar.p(false);
            } else if (voiceFavoriteButtonState instanceof VoiceFavoriteButtonState.Loading) {
                qVar.X(1251233434);
                qVar.p(false);
                str = "";
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(1287279436, qVar, false);
            }
            if (z13) {
                qVar.X(1287292030);
                str2 = kj.c.R(qVar, R.string.accessibility_selectable_selected);
                qVar.p(false);
            } else if (voiceFavoriteButtonState instanceof VoiceFavoriteButtonState.NonFavorite) {
                qVar.X(1251454650);
                qVar.p(false);
            } else if (voiceFavoriteButtonState instanceof VoiceFavoriteButtonState.Loading) {
                qVar.X(1251504250);
                qVar.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(1287290187, qVar, false);
            }
            boolean z14 = voiceFavoriteButtonState instanceof VoiceFavoriteButtonState.Loading;
            i3.q qVar2 = i3.q.f13017a;
            if (z14) {
                qVar.X(1251583643);
                LoaderKt.m1840LoadereopBjH0(p2.o(qVar2, 24), ((VoiceFavoriteButtonState.Loading) voiceFavoriteButtonState).m1103getColor0d7_KjU(), 0L, null, qVar, 6, 12);
                qVar = qVar;
                qVar.p(false);
            } else {
                if (!z13 && !(voiceFavoriteButtonState instanceof VoiceFavoriteButtonState.NonFavorite)) {
                    throw com.google.android.gms.internal.play_billing.b.h(1287300035, qVar, false);
                }
                qVar.X(1251888993);
                if (z13) {
                    i12 = io.elevenlabs.ui.R.drawable.heart_filled;
                } else if (voiceFavoriteButtonState instanceof VoiceFavoriteButtonState.NonFavorite) {
                    i12 = io.elevenlabs.ui.R.drawable.heart_2;
                } else if (z14) {
                    c6.x("exhaustive");
                    return;
                } else {
                    c6.p();
                    return;
                }
                u3.c M = kd.a.M(i12, qVar, 0);
                if (z13) {
                    m1107getColor0d7_KjU = ((VoiceFavoriteButtonState.Favorite) voiceFavoriteButtonState).m1099getColor0d7_KjU();
                } else if (voiceFavoriteButtonState instanceof VoiceFavoriteButtonState.NonFavorite) {
                    m1107getColor0d7_KjU = ((VoiceFavoriteButtonState.NonFavorite) voiceFavoriteButtonState).m1107getColor0d7_KjU();
                } else if (z14) {
                    c6.x("exhaustive");
                    return;
                } else {
                    c6.p();
                    return;
                }
                i3.t o6 = p2.o(qVar2, 24);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = j0.c.o(qVar);
                }
                p1.l lVar = (p1.l) L;
                if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !qVar.h(voiceFavoriteButtonState))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean h11 = z10 | qVar.h(safeHapticFeedback);
                int i15 = i11 & 112;
                if (i15 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z15 = h11 | z11;
                Object L2 = qVar.L();
                if (z15 || L2 == eVar) {
                    L2 = new c3.b(voiceFavoriteButtonState, safeHapticFeedback, aVar, 7);
                    qVar.h0(L2);
                }
                i3.t n2 = l1.n.n(o6, lVar, null, false, null, (ho.a) L2, 28);
                boolean f10 = qVar.f(str) | qVar.f(str2);
                if (i15 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z16 = z12 | f10;
                Object L3 = qVar.L();
                if (z16 || L3 == eVar) {
                    L3 = new a2.o0(str, str2, aVar, 11);
                    qVar.h0(L3);
                }
                y2.a(M, null, p4.q.c(n2, true, (ho.l) L3), m1107getColor0d7_KjU, qVar, u3.c.$stable | 48, 0);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(voiceFavoriteButtonState, aVar, i10, 9);
        }
    }

    public static final sn.z VoiceFavoriteButton$lambda$1$0(VoiceFavoriteButtonState voiceFavoriteButtonState, SafeHapticFeedback safeHapticFeedback, ho.a aVar) {
        if (!(voiceFavoriteButtonState instanceof VoiceFavoriteButtonState.Loading)) {
            if (voiceFavoriteButtonState instanceof VoiceFavoriteButtonState.Favorite) {
                safeHapticFeedback.mo1982performHapticFeedbackCdsT49E(22);
            } else if (voiceFavoriteButtonState instanceof VoiceFavoriteButtonState.NonFavorite) {
                safeHapticFeedback.mo1982performHapticFeedbackCdsT49E(21);
            } else {
                c6.p();
                return null;
            }
        }
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z VoiceFavoriteButton$lambda$2$0(String str, String str2, ho.a aVar, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        p4.y.l(str2, b0Var);
        p4.y.e(b0Var, ig.f.H(new p4.f(str, new fm.g(11, aVar))));
        return sn.z.f31622a;
    }

    public static final boolean VoiceFavoriteButton$lambda$2$0$0(ho.a aVar) {
        aVar.invoke();
        return true;
    }

    public static final sn.z VoiceFavoriteButton$lambda$3(VoiceFavoriteButtonState voiceFavoriteButtonState, ho.a aVar, int i10, u2.m mVar, int i11) {
        VoiceFavoriteButton(voiceFavoriteButtonState, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.j1;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonOutlinedKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import j1.a2;
import j1.f0;
import j1.r0;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.i0;
import p3.y0;
import q2.y2;
import r1.l2;
import r1.p2;
import u2.r1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001aE\u0010\u0011\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0013\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClick", "", "isActive", "SoundscapesButton", "(Lho/a;ZLu2/m;I)V", "MusicalNotesAnimation", "(Lu2/m;I)V", "", "progress", "baseOffsetX", "horizontalDrift", "verticalTravel", "Lno/d;", "rotationRange", "tintAlpha", "FloatingMusicalNote", "(FFFFLno/d;FLu2/m;I)V", "leadNoteProgress", "trailNoteProgress", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SoundscapesButtonKt {
    private static final void FloatingMusicalNote(final float f10, final float f11, final float f12, final float f13, final no.d dVar, final float f14, u2.m mVar, final int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1373807242);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.c(f11)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.c(f12)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.c(f13)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.f(dVar)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        }
        if ((196608 & i10) == 0) {
            if (qVar.c(f14)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        if ((74899 & i11) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            float l4 = ae.l.l(f10, t2.u.P, 1.0f);
            float l7 = ae.l.l(ae.l.l((1.0f - l4) / 0.13999999f, t2.u.P, 1.0f) * ae.l.l(l4 / 0.32f, t2.u.P, 1.0f) * f14, t2.u.P, f14);
            float H = kd.a.H(f11, f11 + f12, l4);
            float H2 = kd.a.H(3.5f, f13, l4);
            no.c cVar = (no.c) dVar;
            float H3 = kd.a.H(cVar.f24554a, cVar.f24555b, l4);
            float H4 = kd.a.H(0.88f, 1.1f, l4);
            u3.c M = kd.a.M(R.drawable.musical_note_filled, qVar, 0);
            long b10 = p3.x.b(l7, ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable).getText().m2185getPrimary0d7_KjU());
            i3.t A = r1.d.A(p2.o(i3.q.f13017a, 10), H, H2);
            boolean c5 = qVar.c(H3) | qVar.c(H4);
            Object L = qVar.L();
            if (c5 || L == u2.l.f33918a) {
                L = new w(H3, H4, 0);
                qVar.h0(L);
            }
            y2.a(M, null, h0.r(A, (ho.l) L), b10, qVar, u3.c.$stable | 48, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.x
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z FloatingMusicalNote$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    FloatingMusicalNote$lambda$1 = SoundscapesButtonKt.FloatingMusicalNote$lambda$1(f10, f11, f12, f13, dVar, f14, i10, (u2.m) obj, intValue);
                    return FloatingMusicalNote$lambda$1;
                }
            };
        }
    }

    public static final sn.z FloatingMusicalNote$lambda$0$0(float f10, float f11, i0 i0Var) {
        i0Var.getClass();
        y0 y0Var = (y0) i0Var;
        y0Var.q(f10);
        y0Var.r(f11);
        y0Var.s(f11);
        return sn.z.f31622a;
    }

    public static final sn.z FloatingMusicalNote$lambda$1(float f10, float f11, float f12, float f13, no.d dVar, float f14, int i10, u2.m mVar, int i11) {
        FloatingMusicalNote(f10, f11, f12, f13, dVar, f14, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void MusicalNotesAnimation(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(103609796);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            j1.h0 q = j1.e.q("soundscapeNotes", qVar, 0);
            j1.t tVar = j1.y.f18445b;
            a2 s10 = j1.e.s(2800, 0, tVar, 2);
            r0 r0Var = r0.f18350a;
            f0 g10 = j1.e.g(q, t2.u.P, 1.0f, j1.e.p(s10, r0Var, 0L, 4), "leadNote", qVar, 29112, 0);
            f0 g11 = j1.e.g(q, t2.u.P, 1.0f, new j1.e0(j1.e.s(2800, 0, tVar, 2), r0Var, -620), "trailNote", qVar, 29112, 0);
            FloatingMusicalNote(MusicalNotesAnimation$lambda$0(g10), -3.5f, -8.5f, -34.0f, new no.c(-6.0f, 1.0f), 0.44f, qVar, 196608);
            FloatingMusicalNote(MusicalNotesAnimation$lambda$1(g11), 2.5f, 8.0f, -38.0f, new no.c(6.0f, 14.0f), 0.22f, qVar, 197040);
            qVar = qVar;
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 22);
        }
    }

    private static final float MusicalNotesAnimation$lambda$0(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    private static final float MusicalNotesAnimation$lambda$1(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z MusicalNotesAnimation$lambda$2(int i10, u2.m mVar, int i11) {
        MusicalNotesAnimation(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void SoundscapesButton(ho.a aVar, boolean z6, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        ho.a aVar2;
        int i12;
        int i13;
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1572289907);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            i3.t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            float f10 = 44;
            aVar2 = aVar;
            ButtonOutlinedKt.ButtonOutlined(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_soundscapes_accessibility_add_button), aVar2, p2.a(qVar2, f10, f10), ElevenLabsTheme.INSTANCE.getShapes(qVar, ElevenLabsTheme.$stable).getFull(), c3.k.d(-1367642688, true, new y(z6, 0), qVar), qVar, ((i11 << 3) & 112) | 24960, 0);
            if (z6) {
                qVar.X(655657856);
                MusicalNotesAnimation(qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(655703023);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            aVar2 = aVar;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.m(i10, z6, 2, aVar2);
        }
    }

    public static final sn.z SoundscapesButton$lambda$0$0(boolean z6, l2 l2Var, u2.m mVar, int i10) {
        boolean z10;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t o6 = p2.o(qVar2, 24);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(o6, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            if (z6) {
                qVar.X(1515429668);
                l1.n.c(kd.a.M(R.drawable.musical_note_filled_colorized, qVar, 0), null, p2.o(qVar2, 16), null, null, t2.u.P, null, qVar, u3.c.$stable | 432, 120);
                qVar.p(false);
            } else {
                qVar.X(1515703212);
                y2.a(kd.a.M(R.drawable.musical_note_filled, qVar, 0), null, p2.o(qVar2, 16), defpackage.f.b(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), qVar, u3.c.$stable | 432, 0);
                qVar = qVar;
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z SoundscapesButton$lambda$1(ho.a aVar, boolean z6, int i10, u2.m mVar, int i11) {
        SoundscapesButton(aVar, z6, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

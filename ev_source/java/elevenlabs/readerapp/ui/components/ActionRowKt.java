package io.elevenlabs.readerapp.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a?\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"", ParameterNames.ICON, "", "title", "Lp3/x;", "color", "Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "ActionRow-T042LqI", "(ILjava/lang/String;JLho/a;Li3/t;Lu2/m;II)V", "ActionRow", "Preview_ActionRow", "(Lu2/m;I)V", "Preview_ActionRow_Colored", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ActionRowKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* renamed from: ActionRow-T042LqI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1021ActionRowT042LqI(final int i10, final String str, final long j4, final ho.a aVar, i3.t tVar, u2.m mVar, final int i11, final int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        boolean z6;
        u2.q qVar;
        final i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        int i15;
        int i16;
        int i17;
        int i18;
        str.getClass();
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1831534035);
        if ((i11 & 6) == 0) {
            if (qVar2.d(i10)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i13 = i18 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar2.f(str)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i13 |= i17;
        }
        if ((i11 & 384) == 0) {
            if (qVar2.e(j4)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i11 & 3072) == 0) {
            if (qVar2.h(aVar)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i15;
        }
        int i19 = i12 & 16;
        if (i19 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i14;
            if ((i13 & 9363) == 9362) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i13 & 1, z6)) {
                if (i19 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                qVar = qVar2;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(str, aVar, null, 0L, false, 0, null, false, null, c3.k.d(-1303612817, true, new b(tVar4, i10, j4, str), qVar2), qVar, ((i13 >> 3) & 14) | 805306368 | ((i13 >> 6) & 112), 508);
                tVar3 = tVar4;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.c
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z ActionRow_T042LqI$lambda$1;
                        int intValue = ((Integer) obj2).intValue();
                        ActionRow_T042LqI$lambda$1 = ActionRowKt.ActionRow_T042LqI$lambda$1(i10, str, j4, aVar, tVar3, i11, i12, (u2.m) obj, intValue);
                        return ActionRow_T042LqI$lambda$1;
                    }
                };
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i13 & 9363) == 9362) {
        }
        if (!qVar2.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ActionRow_T042LqI$lambda$0(i3.t tVar, int i10, long j4, String str, r1.s sVar, u2.m mVar, int i11) {
        boolean z6;
        sVar.getClass();
        if ((i11 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.t e10 = p2.e(tVar, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i12 = ElevenLabsTheme.$stable;
            i3.t F = r1.d.F(e10, elevenLabsTheme.getSpacings(qVar, i12).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i12).m2355getX3D9Ej5fM());
            r1.u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, i12).m2356getX4D9Ej5fM()), i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(F, qVar);
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
            l1.n.c(kd.a.M(i10, qVar, 0), null, p2.o(i3.q.f13017a, 24), null, null, t2.u.P, new p3.n(j4, 5), qVar, u3.c.$stable | 432, 56);
            j7.d(str, null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i12).getBodyLarge500(), qVar, 0, 0, 131066);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ActionRow_T042LqI$lambda$1(int i10, String str, long j4, ho.a aVar, i3.t tVar, int i11, int i12, u2.m mVar, int i13) {
        m1021ActionRowT042LqI(i10, str, j4, aVar, tVar, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final void Preview_ActionRow(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1280484810);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.chain_link_4;
            long j4 = p3.x.f26427b;
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(0);
                qVar.h0(L);
            }
            m1021ActionRowT042LqI(i11, "Share Link", j4, (ho.a) L, null, qVar, 3504, 16);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 20);
        }
    }

    public static final sn.z Preview_ActionRow$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ActionRow(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ActionRow_Colored(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1914069011);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.musical_note;
            long e10 = p3.h0.e(4285222118L);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new io.elevenlabs.highlighter.d(29);
                qVar.h0(L);
            }
            m1021ActionRowT042LqI(i11, "Share Audio", e10, (ho.a) L, null, qVar, 3504, 16);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 19);
        }
    }

    public static final sn.z Preview_ActionRow_Colored$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ActionRow_Colored(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

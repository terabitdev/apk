package io.elevenlabs.readerapp.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.VoiceAvatarKt;
import io.elevenlabs.ui.theme.ElevenLabsSpacings;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a«\u0001\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "voiceId", "Lkotlin/Function0;", "Lsn/z;", "onPressContainer", DiagnosticsEntry.NAME_KEY, "subtitle", "useCase", "imageUrl", "", "isVerified", "isSelected", "iconRight", "showPreviewButton", "isPreviewPlaying", "onPreviewClicked", "Lh5/f;", "verticalPadding", "Lp3/x;", "backgroundColor", "VoiceRow-LYuG0Iw", "(Ljava/lang/String;Lho/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLho/p;ZZLho/a;FLp3/x;Lu2/m;III)V", "VoiceRow", "Preview_VoiceRow", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoiceRowKt {
    public static final void Preview_VoiceRow(u2.m mVar, int i10) {
        h4.f fVar;
        h4.f fVar2;
        h4.f fVar3;
        h4.f fVar4;
        h4.f fVar5;
        h4.f fVar6;
        h4.f fVar7;
        char c5;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(15411466);
        if (qVar.O(i10 & 1, i10 != 0)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t s10 = p2.s(qVar2, 500);
            int i11 = p3.x.f26439n;
            i3.t E = r1.d.E(l1.n.y(l1.n.h(s10, p3.x.f26431f, p3.h0.f26395b), l1.n.x(qVar), true, true), 10);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c10 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar8 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar8);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c10, qVar);
            float f10 = 5;
            i3.t I = r1.d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, f10, 7);
            i3.l lVar = i3.d.f12997a;
            f4.f1 d10 = r1.p.d(lVar, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c11 = i3.a.c(I, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar8);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            Object L = qVar.L();
            u2.e eVar5 = u2.l.f33918a;
            if (L == eVar5) {
                L = new e1(2);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar5) {
                L2 = new e1(3);
                qVar.h0(L2);
            }
            m1108VoiceRowLYuG0Iw("BCViXMYTxySmoNv4v5LL", aVar, "VoiceCard def", "A default voice desc", "Use Case", null, false, true, null, false, false, (ho.a) L2, t2.u.P, null, qVar, 819686838, 54, 12544);
            qVar.p(true);
            i3.t I2 = r1.d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, f10, 7);
            f4.f1 d11 = r1.p.d(lVar, false);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c12 = i3.a.c(I2, qVar);
            qVar.b0();
            if (qVar.S) {
                fVar = fVar8;
                qVar.k(fVar);
            } else {
                fVar = fVar8;
                qVar.k0();
            }
            u2.r.J(eVar, d11, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c12, qVar);
            Object L3 = qVar.L();
            if (L3 == eVar5) {
                L3 = new e1(4);
                qVar.h0(L3);
            }
            ho.a aVar2 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar5) {
                L4 = new e1(5);
                qVar.h0(L4);
            }
            h4.f fVar9 = fVar;
            m1108VoiceRowLYuG0Iw("BCViXMYTxySmoNv4v5LL", aVar2, "VoiceCard def", "Voice row playing without preview button", "Use Case", null, false, true, null, false, true, (ho.a) L4, t2.u.P, null, qVar, 819686838, 54, 12544);
            qVar.p(true);
            i3.t I3 = r1.d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, f10, 7);
            f4.f1 d12 = r1.p.d(lVar, false);
            int hashCode4 = Long.hashCode(qVar.T);
            c3.o l11 = qVar.l();
            i3.t c13 = i3.a.c(I3, qVar);
            qVar.b0();
            if (qVar.S) {
                fVar2 = fVar9;
                qVar.k(fVar2);
            } else {
                fVar2 = fVar9;
                qVar.k0();
            }
            u2.r.J(eVar, d12, qVar);
            u2.r.J(eVar2, l11, qVar);
            defpackage.f.u(hashCode4, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c13, qVar);
            Object L5 = qVar.L();
            if (L5 == eVar5) {
                L5 = new e1(6);
                qVar.h0(L5);
            }
            ho.a aVar3 = (ho.a) L5;
            Object L6 = qVar.L();
            if (L6 == eVar5) {
                L6 = new e1(7);
                qVar.h0(L6);
            }
            h4.f fVar10 = fVar2;
            m1108VoiceRowLYuG0Iw("BCViXMYTxySmoNv4v5LL", aVar3, "VoiceCard def", "A default voice desc", "Use Case", null, false, true, null, false, false, (ho.a) L6, t2.u.P, null, qVar, 14380470, 54, 13056);
            qVar.p(true);
            i3.t I4 = r1.d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, f10, 7);
            f4.f1 d13 = r1.p.d(lVar, false);
            int hashCode5 = Long.hashCode(qVar.T);
            c3.o l12 = qVar.l();
            i3.t c14 = i3.a.c(I4, qVar);
            qVar.b0();
            if (qVar.S) {
                fVar3 = fVar10;
                qVar.k(fVar3);
            } else {
                fVar3 = fVar10;
                qVar.k0();
            }
            u2.r.J(eVar, d13, qVar);
            u2.r.J(eVar2, l12, qVar);
            defpackage.f.u(hashCode5, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c14, qVar);
            Object L7 = qVar.L();
            if (L7 == eVar5) {
                L7 = new e1(8);
                qVar.h0(L7);
            }
            ho.a aVar4 = (ho.a) L7;
            Object L8 = qVar.L();
            if (L8 == eVar5) {
                L8 = new e1(9);
                qVar.h0(L8);
            }
            h4.f fVar11 = fVar3;
            m1108VoiceRowLYuG0Iw("BCViXMYTxySmoNv4v5LL", aVar4, "VoiceCard def with very long name that won't fit single line", "A default voice desc", "Use Case", null, false, true, null, false, false, (ho.a) L8, t2.u.P, null, qVar, 14380470, 54, 13056);
            qVar.p(true);
            i3.t I5 = r1.d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, f10, 7);
            f4.f1 d14 = r1.p.d(lVar, false);
            int hashCode6 = Long.hashCode(qVar.T);
            c3.o l13 = qVar.l();
            i3.t c15 = i3.a.c(I5, qVar);
            qVar.b0();
            if (qVar.S) {
                fVar4 = fVar11;
                qVar.k(fVar4);
            } else {
                fVar4 = fVar11;
                qVar.k0();
            }
            u2.r.J(eVar, d14, qVar);
            u2.r.J(eVar2, l13, qVar);
            defpackage.f.u(hashCode6, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c15, qVar);
            Object L9 = qVar.L();
            if (L9 == eVar5) {
                L9 = new e1(10);
                qVar.h0(L9);
            }
            ho.a aVar5 = (ho.a) L9;
            Object L10 = qVar.L();
            if (L10 == eVar5) {
                L10 = new e1(11);
                qVar.h0(L10);
            }
            h4.f fVar12 = fVar4;
            m1108VoiceRowLYuG0Iw("BCViXMYTxySmoNv4v5LL", aVar5, "VoiceCard", "A voice desc", "Use Case", null, false, false, null, false, false, (ho.a) L10, t2.u.P, null, qVar, 1797558, 54, 13184);
            qVar.p(true);
            i3.t I6 = r1.d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, f10, 7);
            f4.f1 d15 = r1.p.d(lVar, false);
            int hashCode7 = Long.hashCode(qVar.T);
            c3.o l14 = qVar.l();
            i3.t c16 = i3.a.c(I6, qVar);
            qVar.b0();
            if (qVar.S) {
                fVar5 = fVar12;
                qVar.k(fVar5);
            } else {
                fVar5 = fVar12;
                qVar.k0();
            }
            u2.r.J(eVar, d15, qVar);
            u2.r.J(eVar2, l14, qVar);
            defpackage.f.u(hashCode7, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c16, qVar);
            Object L11 = qVar.L();
            if (L11 == eVar5) {
                L11 = new e1(12);
                qVar.h0(L11);
            }
            ho.a aVar6 = (ho.a) L11;
            Object L12 = qVar.L();
            if (L12 == eVar5) {
                L12 = new e1(14);
                qVar.h0(L12);
            }
            h4.f fVar13 = fVar5;
            m1108VoiceRowLYuG0Iw("BCViXMYTxySmoNv4v5LL", aVar6, "VoiceCard playing", "A voice desc", "Use Case", null, false, false, null, false, true, (ho.a) L12, t2.u.P, null, qVar, 1797558, 54, 13184);
            qVar.p(true);
            i3.t I7 = r1.d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, f10, 7);
            f4.f1 d16 = r1.p.d(lVar, false);
            int hashCode8 = Long.hashCode(qVar.T);
            c3.o l15 = qVar.l();
            i3.t c17 = i3.a.c(I7, qVar);
            qVar.b0();
            if (qVar.S) {
                fVar6 = fVar13;
                qVar.k(fVar6);
            } else {
                fVar6 = fVar13;
                qVar.k0();
            }
            u2.r.J(eVar, d16, qVar);
            u2.r.J(eVar2, l15, qVar);
            defpackage.f.u(hashCode8, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c17, qVar);
            Object L13 = qVar.L();
            if (L13 == eVar5) {
                L13 = new e1(15);
                qVar.h0(L13);
            }
            ho.a aVar7 = (ho.a) L13;
            Object L14 = qVar.L();
            if (L14 == eVar5) {
                L14 = new e1(16);
                qVar.h0(L14);
            }
            h4.f fVar14 = fVar6;
            m1108VoiceRowLYuG0Iw("BCViXMYTxySmoNv4v5LL", aVar7, "VoiceCard playing", "A voice desc very long description that takes", "Use Case", null, false, false, null, false, true, (ho.a) L14, t2.u.P, null, qVar, 1797558, 54, 13184);
            qVar.p(true);
            i3.t I8 = r1.d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, f10, 7);
            f4.f1 d17 = r1.p.d(lVar, false);
            int hashCode9 = Long.hashCode(qVar.T);
            c3.o l16 = qVar.l();
            i3.t c18 = i3.a.c(I8, qVar);
            qVar.b0();
            if (qVar.S) {
                fVar7 = fVar14;
                qVar.k(fVar7);
            } else {
                fVar7 = fVar14;
                qVar.k0();
            }
            u2.r.J(eVar, d17, qVar);
            u2.r.J(eVar2, l16, qVar);
            defpackage.f.u(hashCode9, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c18, qVar);
            Object L15 = qVar.L();
            if (L15 == eVar5) {
                L15 = new e1(17);
                qVar.h0(L15);
            }
            ho.a aVar8 = (ho.a) L15;
            Object L16 = qVar.L();
            if (L16 == eVar5) {
                L16 = new e1(18);
                qVar.h0(L16);
            }
            h4.f fVar15 = fVar7;
            m1108VoiceRowLYuG0Iw("BCViXMYTxySmoNv4v5LL", aVar8, "VoiceCard playing", "A voice desc very long description that takes", "Use Case", null, false, false, null, false, true, (ho.a) L16, t2.u.P, null, qVar, 1797558, 54, 13184);
            qVar.p(true);
            i3.t I9 = r1.d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, f10, 7);
            f4.f1 d18 = r1.p.d(lVar, false);
            int hashCode10 = Long.hashCode(qVar.T);
            c3.o l17 = qVar.l();
            i3.t c19 = i3.a.c(I9, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar15);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d18, qVar);
            u2.r.J(eVar2, l17, qVar);
            defpackage.f.u(hashCode10, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c19, qVar);
            Object L17 = qVar.L();
            if (L17 == eVar5) {
                L17 = new e1(19);
                qVar.h0(L17);
            }
            ho.a aVar9 = (ho.a) L17;
            Object L18 = qVar.L();
            if (L18 == eVar5) {
                c5 = 20;
                L18 = new e1(20);
                qVar.h0(L18);
            } else {
                c5 = 20;
            }
            m1108VoiceRowLYuG0Iw("BCViXMYTxySmoNv4v5LL", aVar9, "Verified Voice", "A voice desc very long description that takes", "Use Case", null, true, false, null, false, true, (ho.a) L18, t2.u.P, null, qVar, 1797558, 54, 13184);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 20);
        }
    }

    public static final sn.z Preview_VoiceRow$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceRow(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a0  */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.util.List, java.lang.Object] */
    /* renamed from: VoiceRow-LYuG0Iw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1108VoiceRowLYuG0Iw(final String str, ho.a aVar, final String str2, final String str3, final String str4, final String str5, final boolean z6, boolean z10, ho.p pVar, boolean z11, boolean z12, ho.a aVar2, float f10, p3.x xVar, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        ho.a aVar3;
        int i14;
        String str6;
        int i15;
        boolean z13;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        final boolean z14;
        final ho.a aVar4;
        final float f11;
        final boolean z15;
        u2.q qVar;
        final ho.a aVar5;
        final ho.p pVar2;
        final boolean z16;
        final p3.x xVar2;
        r1 r10;
        boolean z17;
        boolean z18;
        ho.a aVar6;
        float f12;
        ho.a aVar7;
        p3.x xVar3;
        int i25;
        ho.a aVar8;
        ho.p pVar3;
        i3.q qVar2;
        boolean z19;
        i3.t tVar;
        p3.x xVar4;
        boolean z20;
        boolean z21;
        ho.a aVar9;
        int i26;
        String str7;
        i3.q qVar3;
        ElevenLabsTheme elevenLabsTheme;
        int i27;
        ?? r13;
        u2.q qVar4;
        ho.a aVar10;
        i3.q qVar5;
        ElevenLabsTheme elevenLabsTheme2;
        int i28;
        ib.i.s(str, str2, str4);
        u2.q qVar6 = (u2.q) mVar;
        qVar6.Z(1317180148);
        if ((i10 & 6) == 0) {
            i13 = (qVar6.f(str) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i29 = i12 & 2;
        if (i29 != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            aVar3 = aVar;
            i13 |= qVar6.h(aVar3) ? 32 : 16;
            int i30 = 128;
            if ((i10 & 384) == 0) {
                i13 |= qVar6.f(str2) ? RpcError.MAX_MESSAGE_BYTES : 128;
            }
            i14 = i10 & 3072;
            int i31 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i14 == 0) {
                i13 |= qVar6.f(str3) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                i13 |= qVar6.f(str4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if ((196608 & i10) != 0) {
                str6 = str5;
                i13 |= qVar6.f(str6) ? 131072 : 65536;
            } else {
                str6 = str5;
            }
            if ((i10 & 1572864) == 0) {
                i13 |= qVar6.g(z6) ? 1048576 : 524288;
            }
            i15 = i12 & 128;
            if (i15 == 0) {
                i13 |= 12582912;
                z13 = z10;
            } else {
                z13 = z10;
                if ((i10 & 12582912) == 0) {
                    i13 |= qVar6.g(z13) ? 8388608 : 4194304;
                }
            }
            i16 = i12 & RpcError.MAX_MESSAGE_BYTES;
            if (i16 == 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                i13 |= qVar6.h(pVar) ? 67108864 : 33554432;
            }
            i17 = i12 & 512;
            if (i17 == 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                i18 = i17;
                i13 |= qVar6.g(z11) ? 536870912 : 268435456;
                i19 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i19 != 0) {
                    i21 = i11 | 6;
                    i20 = i19;
                } else if ((i11 & 6) == 0) {
                    i20 = i19;
                    i21 = i11 | (qVar6.g(z12) ? 4 : 2);
                } else {
                    i20 = i19;
                    i21 = i11;
                }
                i22 = i12 & 2048;
                if (i22 != 0) {
                    i21 |= 48;
                } else if ((i11 & 48) == 0) {
                    i23 = i22;
                    i21 |= qVar6.h(aVar2) ? 32 : 16;
                    if ((i11 & 384) == 0) {
                        if ((i12 & 4096) == 0 && qVar6.c(f10)) {
                            i30 = RpcError.MAX_MESSAGE_BYTES;
                        }
                        i21 |= i30;
                    }
                    if ((i11 & 3072) == 0) {
                        if ((i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0 && qVar6.f(xVar)) {
                            i31 = 2048;
                        }
                        i21 |= i31;
                    }
                    i24 = i21;
                    if (!qVar6.O(i13 & 1, (i13 & 306783379) == 306783378 || (i24 & 1171) != 1170)) {
                        qVar6.T();
                        int i32 = i10 & 1;
                        Object obj = u2.l.f33918a;
                        if (i32 == 0 || qVar6.y()) {
                            if (i29 != 0) {
                                aVar3 = null;
                            }
                            if (i15 != 0) {
                                z13 = false;
                            }
                            ho.p pVar4 = i16 == 0 ? pVar : null;
                            z17 = i18 != 0 ? true : z11;
                            z18 = i20 != 0 ? false : z12;
                            if (i23 != 0) {
                                Object L = qVar6.L();
                                if (L == obj) {
                                    L = new e1(13);
                                    qVar6.h0(L);
                                }
                                aVar6 = (ho.a) L;
                            } else {
                                aVar6 = aVar2;
                            }
                            if ((i12 & 4096) != 0) {
                                f12 = ElevenLabsTheme.INSTANCE.getSpacings(qVar6, ElevenLabsTheme.$stable).m2356getX4D9Ej5fM();
                                i24 &= -897;
                            } else {
                                f12 = f10;
                            }
                            if ((i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                ho.a aVar11 = aVar6;
                                f12 = f12;
                                i25 = i24 & (-7169);
                                xVar3 = new p3.x(ib.i.d(ElevenLabsTheme.INSTANCE, qVar6, ElevenLabsTheme.$stable));
                                aVar8 = aVar3;
                                pVar3 = pVar4;
                                aVar7 = aVar11;
                            } else {
                                ho.p pVar5 = pVar4;
                                aVar7 = aVar6;
                                xVar3 = xVar;
                                i25 = i24;
                                aVar8 = aVar3;
                                pVar3 = pVar5;
                            }
                        } else {
                            qVar6.R();
                            if ((i12 & 4096) != 0) {
                                i24 &= -897;
                            }
                            if ((i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                i24 &= -7169;
                            }
                            z17 = z11;
                            z18 = z12;
                            aVar7 = aVar2;
                            f12 = f10;
                            xVar3 = xVar;
                            i25 = i24;
                            aVar8 = aVar3;
                            pVar3 = pVar;
                        }
                        qVar6.q();
                        ElevenLabsTheme elevenLabsTheme3 = ElevenLabsTheme.INSTANCE;
                        int i33 = ElevenLabsTheme.$stable;
                        ElevenLabsSpacings spacings = elevenLabsTheme3.getSpacings(qVar6, i33);
                        ho.p pVar6 = pVar3;
                        String R = kj.c.R(qVar6, z18 ? R.string.accessibility_voice_preview_pause : R.string.accessibility_voice_preview_play);
                        ho.a aVar12 = aVar7;
                        String R2 = kj.c.R(qVar6, R.string.accessibility_selectable_selected);
                        i3.q qVar7 = i3.q.f13017a;
                        if (aVar8 != null) {
                            qVar2 = qVar7;
                            z19 = z17;
                            tVar = l1.n.p(qVar7, false, null, null, null, aVar8, 15);
                        } else {
                            qVar2 = qVar7;
                            z19 = z17;
                            tVar = qVar2;
                        }
                        if (xVar3 != null) {
                            z20 = z18;
                            xVar4 = xVar3;
                            tVar = l1.n.h(tVar, xVar3.f26440a, p3.h0.f26395b);
                        } else {
                            xVar4 = xVar3;
                            z20 = z18;
                        }
                        i3.t F = r1.d.F(tVar, spacings.m2357getX5D9Ej5fM(), f12);
                        int i34 = i25 & 112;
                        boolean f13 = ((i13 & 896) == 256) | ((57344 & i13) == 16384) | ((29360128 & i13) == 8388608) | qVar6.f(R2) | qVar6.f(R) | (i34 == 32);
                        Object L2 = qVar6.L();
                        if (f13 || L2 == obj) {
                            boolean z22 = z13;
                            L2 = new c1(str2, str4, z22, R2, R, aVar12, 1);
                            z21 = z22;
                            aVar9 = aVar12;
                            i26 = i13;
                            str7 = R;
                            qVar6.h0(L2);
                        } else {
                            int i35 = i13;
                            str7 = R;
                            i26 = i35;
                            aVar9 = aVar12;
                            z21 = z13;
                        }
                        i3.t c5 = p4.q.c(F, true, (ho.l) L2);
                        i3.k kVar = i3.d.f13005z0;
                        r1.u0 u0Var = r1.j.f29228a;
                        k2 a10 = i2.a(u0Var, kVar, qVar6, 48);
                        int hashCode = Long.hashCode(qVar6.T);
                        c3.o l4 = qVar6.l();
                        i3.t c10 = i3.a.c(c5, qVar6);
                        h4.h.f11920i.getClass();
                        ho.a aVar13 = h4.g.f11903b;
                        qVar6.b0();
                        int i36 = i26;
                        if (qVar6.S) {
                            qVar6.k(aVar13);
                        } else {
                            qVar6.k0();
                        }
                        h4.e eVar = h4.g.f11907f;
                        u2.r.J(eVar, a10, qVar6);
                        h4.e eVar2 = h4.g.f11906e;
                        u2.r.J(eVar2, l4, qVar6);
                        Integer valueOf = Integer.valueOf(hashCode);
                        h4.e eVar3 = h4.g.f11908g;
                        u2.r.y(qVar6, valueOf, eVar3);
                        h4.d dVar = h4.g.f11909h;
                        u2.r.F(dVar, qVar6);
                        h4.e eVar4 = h4.g.f11905d;
                        u2.r.J(eVar4, c10, qVar6);
                        ho.a aVar14 = aVar9;
                        if (1.0f <= 0.0d) {
                            s1.a.a("invalid weight; must be greater than zero");
                        }
                        i3.t t10 = r1.d.t(new m1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), r1.i1.f29224a);
                        k2 a11 = i2.a(u0Var, i3.d.f13004y0, qVar6, 0);
                        float f14 = f12;
                        int hashCode2 = Long.hashCode(qVar6.T);
                        c3.o l7 = qVar6.l();
                        i3.t c11 = i3.a.c(t10, qVar6);
                        qVar6.b0();
                        if (qVar6.S) {
                            qVar6.k(aVar13);
                        } else {
                            qVar6.k0();
                        }
                        u2.r.J(eVar, a11, qVar6);
                        u2.r.J(eVar2, l7, qVar6);
                        defpackage.f.u(hashCode2, qVar6, eVar3, qVar6, dVar);
                        u2.r.J(eVar4, c11, qVar6);
                        final String str8 = str6;
                        final boolean z23 = z19;
                        final boolean z24 = z20;
                        ButtonContainerKt.m1780ButtonContainer83mGB3Q(str7, aVar14, null, 0L, false, 0, null, false, null, c3.k.d(1481576904, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.components.f1
                            @Override // ho.q
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                sn.z VoiceRow_LYuG0Iw$lambda$4$0$0;
                                int intValue = ((Integer) obj4).intValue();
                                VoiceRow_LYuG0Iw$lambda$4$0$0 = VoiceRowKt.VoiceRow_LYuG0Iw$lambda$4$0$0(z24, z23, str, str8, z6, (r1.s) obj2, (u2.m) obj3, intValue);
                                return VoiceRow_LYuG0Iw$lambda$4$0$0;
                            }
                        }, qVar6), qVar6, i34 | 817889280, 380);
                        r1.d.g(p2.s(qVar2, elevenLabsTheme3.getSpacings(qVar6, i33).m2355getX3D9Ej5fM()), qVar6);
                        if (1.0f <= 0.0d) {
                            s1.a.a("invalid weight; must be greater than zero");
                        }
                        i3.t c12 = p2.c(new m1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
                        r1.x a12 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar6, 0);
                        int hashCode3 = Long.hashCode(qVar6.T);
                        c3.o l10 = qVar6.l();
                        i3.t c13 = i3.a.c(c12, qVar6);
                        qVar6.b0();
                        if (qVar6.S) {
                            qVar6.k(aVar13);
                        } else {
                            qVar6.k0();
                        }
                        u2.r.J(eVar, a12, qVar6);
                        u2.r.J(eVar2, l10, qVar6);
                        defpackage.f.u(hashCode3, qVar6, eVar3, qVar6, dVar);
                        u2.r.J(eVar4, c13, qVar6);
                        if (1.0f <= 0.0d) {
                            s1.a.a("invalid weight; must be greater than zero");
                        }
                        r1.d.g(new m1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), qVar6);
                        s4.y0 bodyMedium600 = elevenLabsTheme3.getTypo(qVar6, i33).getBodyMedium600();
                        i3.t e10 = p2.e(qVar2, 1.0f);
                        Object L3 = qVar6.L();
                        if (L3 == obj) {
                            L3 = new r0(6);
                            qVar6.h0(L3);
                        }
                        i3.q qVar8 = qVar2;
                        j7.d(str2, p4.q.b(e10, (ho.l) L3), 0L, 0L, null, 0L, null, 0L, 2, true, 2, 0, null, bodyMedium600, qVar6, (i36 >> 6) & 14, 28032, 102396);
                        u2.q qVar9 = qVar6;
                        r1.d.g(p2.f(qVar8, spacings.m2350getX1D9Ej5fM()), qVar9);
                        if (str3 != null && !wq.n.m0(str3)) {
                            qVar9.X(1888905886);
                            String c14 = s4.t.c(str3, (a5.b) a5.d.f1318a.B().f1316a.get(0));
                            s4.y0 bodySmall500 = elevenLabsTheme3.getTypo(qVar9, i33).getBodySmall500();
                            long w6 = ib.i.w(elevenLabsTheme3, qVar9, i33);
                            i3.t e11 = p2.e(qVar8, 1.0f);
                            Object L4 = qVar9.L();
                            if (L4 == obj) {
                                L4 = new r0(7);
                                qVar9.h0(L4);
                            }
                            i27 = i33;
                            elevenLabsTheme = elevenLabsTheme3;
                            qVar3 = qVar8;
                            j7.d(c14, p4.q.b(e11, (ho.l) L4), w6, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, bodySmall500, qVar9, 0, 24960, 110584);
                            u2.q qVar10 = qVar9;
                            r13 = 0;
                            qVar10.p(false);
                            qVar4 = qVar10;
                        } else {
                            qVar3 = qVar8;
                            elevenLabsTheme = elevenLabsTheme3;
                            i27 = i33;
                            r13 = 0;
                            qVar9.X(1889398476);
                            qVar9.p(false);
                            qVar4 = qVar9;
                        }
                        if (z23) {
                            qVar4.X(1889454648);
                            qVar5 = qVar3;
                            r1.d.g(p2.f(qVar5, spacings.m2355getX3D9Ej5fM()), qVar4);
                            aVar10 = aVar14;
                            ButtonKt.Button(kj.c.R(qVar4, io.elevenlabs.readerapp.R.string.voice_row_play_preview), aVar10, null, ButtonSize.Small, ButtonVariant.Secondary, Integer.valueOf(z24 ? R.drawable.pause : R.drawable.headphones), null, false, false, false, qVar4, i34 | 27648, 964);
                            qVar4.p(r13);
                        } else {
                            aVar10 = aVar14;
                            qVar5 = qVar3;
                            qVar4.X(1889935148);
                            qVar4.p(r13);
                        }
                        if (1.0f <= 0.0d) {
                            s1.a.a("invalid weight; must be greater than zero");
                        }
                        r1.d.g(new m1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), qVar4);
                        qVar4.p(true);
                        qVar4.p(true);
                        if (z21) {
                            qVar4.X(-1811647344);
                            ElevenLabsTheme elevenLabsTheme4 = elevenLabsTheme;
                            i28 = i27;
                            r1.d.g(p2.s(qVar5, elevenLabsTheme4.getSpacings(qVar4, i28).m2353getX2D9Ej5fM()), qVar4);
                            y2.a(kd.a.M(R.drawable.check_1, qVar4, r13), null, p2.o(qVar5, 20), defpackage.f.b(elevenLabsTheme4, qVar4, i28), qVar4, u3.c.$stable | 432, 0);
                            qVar4.p(r13);
                            elevenLabsTheme2 = elevenLabsTheme4;
                        } else {
                            elevenLabsTheme2 = elevenLabsTheme;
                            i28 = i27;
                            qVar4.X(-1811337902);
                            qVar4.p(r13);
                        }
                        if (pVar6 != null) {
                            qVar4.X(-1811302097);
                            r1.d.g(p2.s(qVar5, elevenLabsTheme2.getSpacings(qVar4, i28).m2356getX4D9Ej5fM()), qVar4);
                            j0.c.q((i36 >> 24) & 14, pVar6, qVar4, r13);
                        } else {
                            qVar4.X(-1811206958);
                            qVar4.p(r13);
                        }
                        qVar4.p(true);
                        pVar2 = pVar6;
                        aVar4 = aVar10;
                        qVar = qVar4;
                        z15 = z21;
                        xVar2 = xVar4;
                        f11 = f14;
                        aVar5 = aVar8;
                        z14 = z24;
                        z16 = z23;
                    } else {
                        qVar6.R();
                        z14 = z12;
                        aVar4 = aVar2;
                        f11 = f10;
                        z15 = z13;
                        qVar = qVar6;
                        aVar5 = aVar3;
                        pVar2 = pVar;
                        z16 = z11;
                        xVar2 = xVar;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.g1
                            @Override // ho.p
                            public final Object invoke(Object obj2, Object obj3) {
                                sn.z VoiceRow_LYuG0Iw$lambda$5;
                                int intValue = ((Integer) obj3).intValue();
                                VoiceRow_LYuG0Iw$lambda$5 = VoiceRowKt.VoiceRow_LYuG0Iw$lambda$5(str, aVar5, str2, str3, str4, str5, z6, z15, pVar2, z16, z14, aVar4, f11, xVar2, i10, i11, i12, (u2.m) obj2, intValue);
                                return VoiceRow_LYuG0Iw$lambda$5;
                            }
                        };
                        return;
                    }
                    return;
                }
                i23 = i22;
                if ((i11 & 384) == 0) {
                }
                if ((i11 & 3072) == 0) {
                }
                i24 = i21;
                if (!qVar6.O(i13 & 1, (i13 & 306783379) == 306783378 || (i24 & 1171) != 1170)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            i18 = i17;
            i19 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i19 != 0) {
            }
            i22 = i12 & 2048;
            if (i22 != 0) {
            }
            i23 = i22;
            if ((i11 & 384) == 0) {
            }
            if ((i11 & 3072) == 0) {
            }
            i24 = i21;
            if (!qVar6.O(i13 & 1, (i13 & 306783379) == 306783378 || (i24 & 1171) != 1170)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        aVar3 = aVar;
        int i302 = 128;
        if ((i10 & 384) == 0) {
        }
        i14 = i10 & 3072;
        int i312 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i14 == 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        if ((196608 & i10) != 0) {
        }
        if ((i10 & 1572864) == 0) {
        }
        i15 = i12 & 128;
        if (i15 == 0) {
        }
        i16 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i16 == 0) {
        }
        i17 = i12 & 512;
        if (i17 == 0) {
        }
        i18 = i17;
        i19 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i19 != 0) {
        }
        i22 = i12 & 2048;
        if (i22 != 0) {
        }
        i23 = i22;
        if ((i11 & 384) == 0) {
        }
        if ((i11 & 3072) == 0) {
        }
        i24 = i21;
        if (!qVar6.O(i13 & 1, (i13 & 306783379) == 306783378 || (i24 & 1171) != 1170)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z VoiceRow_LYuG0Iw$lambda$3$0(String str, String str2, boolean z6, String str3, String str4, ho.a aVar, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str + " - " + str2, b0Var);
        if (!z6) {
            str3 = "";
        }
        p4.y.l(str3, b0Var);
        p4.y.e(b0Var, ig.f.H(new p4.f(str4, new fm.g(13, aVar))));
        return sn.z.f31622a;
    }

    public static final boolean VoiceRow_LYuG0Iw$lambda$3$0$0(ho.a aVar) {
        aVar.invoke();
        return true;
    }

    public static final sn.z VoiceRow_LYuG0Iw$lambda$4$0$0(boolean z6, boolean z10, String str, String str2, boolean z11, r1.s sVar, u2.m mVar, int i10) {
        boolean z12;
        boolean z13;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z12 = true;
        } else {
            z12 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z12)) {
            i3.t o6 = p2.o(i3.q.f13017a, 56);
            if (z6 && !z10) {
                z13 = true;
            } else {
                z13 = false;
            }
            VoiceAvatarKt.VoiceAvatar(str, str2, o6, z11, z13, qVar, 384, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z VoiceRow_LYuG0Iw$lambda$4$0$1$0$0(p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.b(b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z VoiceRow_LYuG0Iw$lambda$4$0$1$1$0(p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.b(b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z VoiceRow_LYuG0Iw$lambda$5(String str, ho.a aVar, String str2, String str3, String str4, String str5, boolean z6, boolean z10, ho.p pVar, boolean z11, boolean z12, ho.a aVar2, float f10, p3.x xVar, int i10, int i11, int i12, u2.m mVar, int i13) {
        m1108VoiceRowLYuG0Iw(str, aVar, str2, str3, str4, str5, z6, z10, pVar, z11, z12, aVar2, f10, xVar, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return sn.z.f31622a;
    }
}

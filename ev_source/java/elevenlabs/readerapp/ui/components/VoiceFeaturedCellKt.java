package io.elevenlabs.readerapp.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.elevenlabs.readerapp.ui.components.VoiceFavoriteButtonState;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.VoiceAvatarKt;
import io.elevenlabs.ui.components.VoiceBlurBackgroundKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0085\u0001\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "voiceId", DiagnosticsEntry.NAME_KEY, "subtitle", "imageUrl", "", "isVerified", "isSelected", "Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState;", "favoriteState", "Lkotlin/Function0;", "Lsn/z;", "onClickPreview", "onClickContainer", "onClickFavoriteButton", "useCase", "isPreviewPlaying", "VoiceFeaturedCell", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState;Lho/a;Lho/a;Lho/a;Ljava/lang/String;ZLu2/m;II)V", "Preview_VoiceFeaturedCell", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoiceFeaturedCellKt {
    public static final void Preview_VoiceFeaturedCell(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1571241354);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(i3.q.f13017a, 12);
            r1.x a10 = r1.w.a(r1.j.g(16), i3.d.B0, qVar, 6);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
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
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            VoiceFavoriteButtonState.Favorite favorite = new VoiceFavoriteButtonState.Favorite(elevenLabsTheme.getColor(qVar, i11).getVoiceCellFeatured().m2206getFavoriteButtonActive0d7_KjU(), null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new a(27);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new e1(0);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new e1(1);
                qVar.h0(L3);
            }
            VoiceFeaturedCell("voiceId", "Matilda", null, null, false, true, favorite, aVar, aVar2, (ho.a) L3, "Narrative", false, qVar, 918777270, 54);
            VoiceFavoriteButtonState.NonFavorite nonFavorite = new VoiceFavoriteButtonState.NonFavorite(elevenLabsTheme.getColor(qVar, i11).getVoiceCellFeatured().m2207getFavoriteButtonInactive0d7_KjU(), null);
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new a(20);
                qVar.h0(L4);
            }
            ho.a aVar3 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new a(21);
                qVar.h0(L5);
            }
            ho.a aVar4 = (ho.a) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new a(22);
                qVar.h0(L6);
            }
            VoiceFeaturedCell("voiceId", "Matilda", "English", null, false, true, nonFavorite, aVar3, aVar4, (ho.a) L6, "Narrative", false, qVar, 918777270, 54);
            VoiceFavoriteButtonState.Favorite favorite2 = new VoiceFavoriteButtonState.Favorite(elevenLabsTheme.getColor(qVar, i11).getVoiceCellFeatured().m2206getFavoriteButtonActive0d7_KjU(), null);
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new a(23);
                qVar.h0(L7);
            }
            ho.a aVar5 = (ho.a) L7;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new a(24);
                qVar.h0(L8);
            }
            ho.a aVar6 = (ho.a) L8;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new a(25);
                qVar.h0(L9);
            }
            VoiceFeaturedCell("voiceId", "Matilda", "English, Narrative", null, false, true, favorite2, aVar5, aVar6, (ho.a) L9, "Narrative", false, qVar, 918777270, 54);
            VoiceFavoriteButtonState.Favorite favorite3 = new VoiceFavoriteButtonState.Favorite(elevenLabsTheme.getColor(qVar, i11).getVoiceCellFeatured().m2206getFavoriteButtonActive0d7_KjU(), null);
            Object L10 = qVar.L();
            if (L10 == eVar) {
                L10 = new a(26);
                qVar.h0(L10);
            }
            ho.a aVar7 = (ho.a) L10;
            Object L11 = qVar.L();
            if (L11 == eVar) {
                L11 = new a(28);
                qVar.h0(L11);
            }
            ho.a aVar8 = (ho.a) L11;
            Object L12 = qVar.L();
            if (L12 == eVar) {
                L12 = new a(29);
                qVar.h0(L12);
            }
            VoiceFeaturedCell("voiceId", "Matilda", "English, Narrative", null, true, true, favorite3, aVar7, aVar8, (ho.a) L12, "Narrative", true, qVar, 918777270, 54);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 19);
        }
    }

    public static final sn.z Preview_VoiceFeaturedCell$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceFeaturedCell(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List, java.lang.Object] */
    public static final void VoiceFeaturedCell(final String str, final String str2, String str3, final String str4, final boolean z6, final boolean z10, VoiceFavoriteButtonState voiceFavoriteButtonState, final ho.a aVar, final ho.a aVar2, ho.a aVar3, final String str5, final boolean z11, u2.m mVar, final int i10, final int i11) {
        int i12;
        int i13;
        VoiceFavoriteButtonState voiceFavoriteButtonState2;
        final ho.a aVar4;
        u2.q qVar;
        int i14;
        String str6;
        u2.q qVar2;
        i3.t tVar;
        h4.e eVar;
        h4.d dVar;
        h4.e eVar2;
        h4.e eVar3;
        int i15;
        h4.e eVar4;
        ElevenLabsTheme elevenLabsTheme;
        i3.j jVar;
        int i16;
        u2.q qVar3;
        h4.f fVar;
        final String str7 = str3;
        str.getClass();
        str2.getClass();
        voiceFavoriteButtonState.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        str5.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(-229413651);
        if ((i10 & 6) == 0) {
            i12 = (qVar4.f(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= qVar4.f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= qVar4.f(str7) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= qVar4.f(str4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i10 & 24576) == 0) {
            i12 |= qVar4.g(z6) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i10) == 0) {
            i12 |= qVar4.g(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= (2097152 & i10) == 0 ? qVar4.f(voiceFavoriteButtonState) : qVar4.h(voiceFavoriteButtonState) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= qVar4.h(aVar) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= qVar4.h(aVar2) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= qVar4.h(aVar3) ? 536870912 : 268435456;
        }
        int i17 = i12;
        if ((i11 & 6) == 0) {
            i13 = i11 | (qVar4.f(str5) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= qVar4.g(z11) ? 32 : 16;
        }
        int i18 = i13;
        if (qVar4.O(i17 & 1, ((i17 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true)) {
            String R = kj.c.R(qVar4, R.string.accessibility_selectable_selected);
            if (z11) {
                i14 = R.string.accessibility_voice_preview_pause;
            } else {
                i14 = R.string.accessibility_voice_preview_play;
            }
            String R2 = kj.c.R(qVar4, i14);
            ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
            int i19 = ElevenLabsTheme.$stable;
            p3.b1 lg2 = elevenLabsTheme2.getShapes(qVar4, i19).getLg();
            i3.q qVar5 = i3.q.f13017a;
            i3.t p10 = l1.n.p(p2.o(l1.n.h(m3.h.c(qVar5, lg2), p3.x.f26427b, p3.h0.f26395b), 160), false, null, null, null, aVar2, 15);
            boolean f10 = ((i17 & 112) == 32) | ((i18 & 14) == 4) | ((i17 & 458752) == 131072) | qVar4.f(R) | qVar4.f(R2) | ((i17 & 234881024) == 67108864);
            Object L = qVar4.L();
            if (f10 || L == u2.l.f33918a) {
                str6 = R2;
                qVar2 = qVar4;
                tVar = p10;
                c1 c1Var = new c1(str2, str5, z10, R, str6, aVar2, 0);
                qVar2.h0(c1Var);
                L = c1Var;
            } else {
                tVar = p10;
                qVar2 = qVar4;
                str6 = R2;
            }
            i3.t c5 = p4.q.c(tVar, true, (ho.l) L);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c10 = i3.a.c(c5, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar2);
            } else {
                qVar2.k0();
            }
            h4.e eVar5 = h4.g.f11907f;
            u2.r.J(eVar5, d10, qVar2);
            h4.e eVar6 = h4.g.f11906e;
            u2.r.J(eVar6, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar7 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf, eVar7);
            h4.d dVar2 = h4.g.f11909h;
            u2.r.F(dVar2, qVar2);
            h4.e eVar8 = h4.g.f11905d;
            u2.r.J(eVar8, c10, qVar2);
            String str8 = str6;
            VoiceBlurBackgroundKt.VoiceBlurBackground(str, str4, p2.d(m3.h.c(qVar5, elevenLabsTheme2.getShapes(qVar2, i19).getLg()), 1.0f), qVar2, (i17 & 14) | ((i17 >> 6) & 112));
            i3.t E = r1.d.E(p2.c(qVar5, 1.0f), elevenLabsTheme2.getSpacings(qVar2, i19).m2355getX3D9Ej5fM());
            i3.j jVar2 = i3.d.B0;
            r1.f fVar3 = r1.j.f29234g;
            r1.x a10 = r1.w.a(fVar3, jVar2, qVar2, 54);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c11 = i3.a.c(E, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar2);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar5, a10, qVar2);
            u2.r.J(eVar6, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar7, qVar2, dVar2);
            u2.r.J(eVar8, c11, qVar2);
            i3.t e10 = p2.e(qVar5, 1.0f);
            k2 a11 = i2.a(fVar3, i3.d.f13004y0, qVar2, 54);
            int hashCode3 = Long.hashCode(qVar2.T);
            c3.o l10 = qVar2.l();
            i3.t c12 = i3.a.c(e10, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar2);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar5, a11, qVar2);
            u2.r.J(eVar6, l10, qVar2);
            defpackage.f.u(hashCode3, qVar2, eVar7, qVar2, dVar2);
            u2.r.J(eVar8, c12, qVar2);
            int i20 = i17 >> 18;
            ButtonContainerKt.m1780ButtonContainer83mGB3Q(str8, aVar, null, 0L, false, 0, null, false, null, c3.k.d(-224850647, true, new j(str, str4, z6, z11), qVar2), qVar2, (i20 & 112) | 817889280, 380);
            k2 a12 = i2.a(ib.i.n(elevenLabsTheme2, qVar2, i19), i3.d.f13005z0, qVar2, 48);
            int hashCode4 = Long.hashCode(qVar2.T);
            c3.o l11 = qVar2.l();
            i3.t c13 = i3.a.c(qVar5, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar2);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar5, a12, qVar2);
            u2.r.J(eVar6, l11, qVar2);
            defpackage.f.u(hashCode4, qVar2, eVar7, qVar2, dVar2);
            u2.r.J(eVar8, c13, qVar2);
            if (z10) {
                qVar2.X(2007631536);
                u3.c M = kd.a.M(R.drawable.check_1, qVar2, 0);
                long m2205getCheckbox0d7_KjU = elevenLabsTheme2.getColor(qVar2, i19).getVoiceCellFeatured().m2205getCheckbox0d7_KjU();
                eVar2 = eVar7;
                i15 = i19;
                elevenLabsTheme = elevenLabsTheme2;
                dVar = dVar2;
                jVar = jVar2;
                qVar3 = qVar2;
                fVar = fVar2;
                eVar4 = eVar8;
                eVar = eVar6;
                eVar3 = eVar5;
                y2.a(M, null, p2.o(qVar5, 20), m2205getCheckbox0d7_KjU, qVar3, u3.c.$stable | 432, 0);
                i16 = 0;
                qVar3.p(false);
            } else {
                eVar = eVar6;
                dVar = dVar2;
                eVar2 = eVar7;
                eVar3 = eVar5;
                i15 = i19;
                eVar4 = eVar8;
                elevenLabsTheme = elevenLabsTheme2;
                jVar = jVar2;
                i16 = 0;
                qVar3 = qVar2;
                fVar = fVar2;
                qVar3.X(2007938777);
                qVar3.p(false);
            }
            voiceFavoriteButtonState2 = voiceFavoriteButtonState;
            aVar4 = aVar3;
            VoiceFavoriteButtonKt.VoiceFavoriteButton(voiceFavoriteButtonState2, aVar4, qVar3, (i20 & 14) | ((i17 >> 24) & 112));
            qVar3.p(true);
            qVar3.p(true);
            r1.x a13 = r1.w.a(r1.j.f29230c, jVar, qVar3, i16);
            int hashCode5 = Long.hashCode(qVar3.T);
            c3.o l12 = qVar3.l();
            i3.t c14 = i3.a.c(qVar5, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            u2.r.J(eVar3, a13, qVar3);
            u2.r.J(eVar, l12, qVar3);
            defpackage.f.u(hashCode5, qVar3, eVar2, qVar3, dVar);
            u2.r.J(eVar4, c14, qVar3);
            int i21 = i15;
            ElevenLabsTheme elevenLabsTheme3 = elevenLabsTheme;
            u2.q qVar6 = qVar3;
            j7.d(str2, null, 0L, 0L, null, 0L, null, 0L, 2, true, 2, 0, null, s4.y0.a(elevenLabsTheme3.getTypo(qVar3, i21).getBodyMedium700(), elevenLabsTheme3.getColor(qVar3, i21).getVoiceCellFeatured().m2209getTitle0d7_KjU(), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar6, (i17 >> 3) & 14, 28032, 102398);
            qVar = qVar6;
            if (!(str3 == null || wq.n.m0(str3))) {
                qVar.X(-802697018);
                str7 = str3;
                j7.d(s4.t.c(str7, (a5.b) a5.d.f1318a.B().f1316a.get(0)), null, 0L, 0L, null, 0L, null, 0L, 2, true, 2, 0, null, s4.y0.a(elevenLabsTheme3.getTypo(qVar, i21).getBodySmall500(), elevenLabsTheme3.getColor(qVar, i21).getVoiceCellFeatured().m2208getSubtitle0d7_KjU(), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar, 0, 28032, 102398);
                qVar.p(false);
            } else {
                str7 = str3;
                qVar.X(-802278425);
                qVar.p(false);
            }
            p.n.t(qVar, true, true, true);
        } else {
            voiceFavoriteButtonState2 = voiceFavoriteButtonState;
            aVar4 = aVar3;
            qVar = qVar4;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            final VoiceFavoriteButtonState voiceFavoriteButtonState3 = voiceFavoriteButtonState2;
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.d1
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z VoiceFeaturedCell$lambda$2;
                    int intValue = ((Integer) obj2).intValue();
                    VoiceFeaturedCell$lambda$2 = VoiceFeaturedCellKt.VoiceFeaturedCell$lambda$2(str, str2, str7, str4, z6, z10, voiceFavoriteButtonState3, aVar, aVar2, aVar4, str5, z11, i10, i11, (u2.m) obj, intValue);
                    return VoiceFeaturedCell$lambda$2;
                }
            };
        }
    }

    public static final sn.z VoiceFeaturedCell$lambda$0$0(String str, String str2, boolean z6, String str3, String str4, ho.a aVar, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str + " - " + str2, b0Var);
        if (!z6) {
            str3 = "";
        }
        p4.y.l(str3, b0Var);
        p4.y.e(b0Var, ig.f.H(new p4.f(str4, new fm.g(12, aVar))));
        return sn.z.f31622a;
    }

    public static final boolean VoiceFeaturedCell$lambda$0$0$0(ho.a aVar) {
        aVar.invoke();
        return true;
    }

    public static final sn.z VoiceFeaturedCell$lambda$1$0$0$0(String str, String str2, boolean z6, boolean z10, r1.s sVar, u2.m mVar, int i10) {
        boolean z11;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z11 = true;
        } else {
            z11 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z11)) {
            VoiceAvatarKt.VoiceAvatar(str, str2, p2.o(i3.q.f13017a, 56), z6, z10, qVar, 384, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z VoiceFeaturedCell$lambda$2(String str, String str2, String str3, String str4, boolean z6, boolean z10, VoiceFavoriteButtonState voiceFavoriteButtonState, ho.a aVar, ho.a aVar2, ho.a aVar3, String str5, boolean z11, int i10, int i11, u2.m mVar, int i12) {
        VoiceFeaturedCell(str, str2, str3, str4, z6, z10, voiceFavoriteButtonState, aVar, aVar2, aVar3, str5, z11, mVar, u2.r.M(i10 | 1), u2.r.M(i11));
        return sn.z.f31622a;
    }
}

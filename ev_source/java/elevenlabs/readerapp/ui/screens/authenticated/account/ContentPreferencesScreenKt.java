package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.ActionRowItemKt;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ShadowKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.c7;
import q2.d5;
import q2.j7;
import q2.k5;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.z1;
import rd.c1;
import sn.z;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aQ\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001ae\u0010\u000e\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0011\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "onNavigateToManageContentInterests", "onNavigateToExploreLanguageSetting", "onNavigateToPronunciations", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ContentPreferencesViewModel;", "vm", "ContentPreferencesScreen", "(Lho/a;Lho/a;Lho/a;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ContentPreferencesViewModel;Lu2/m;II)V", "", "isAssistantEnabled", "Lkotlin/Function1;", "onToggleAssistant", "ContentPreferencesScreenUI", "(Ljava/lang/Boolean;Lho/l;Lho/a;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "onToggle", "AssistantRow", "(Ljava/lang/Boolean;Lho/l;Lu2/m;I)V", "Preview_ContentPreferencesScreen", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ContentPreferencesScreenKt {
    private static final void AssistantRow(Boolean bool, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2144099404);
        if ((i10 & 6) == 0) {
            if (qVar.f(bool)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
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
            if (bool == null) {
                qVar.X(-111535644);
                qVar.p(false);
            } else {
                qVar.X(-111535643);
                final boolean booleanValue = bool.booleanValue();
                String R = kj.c.R(qVar, R.string.account_settings_voice_chat);
                if ((i11 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean g10 = z10 | qVar.g(booleanValue);
                Object L = qVar.L();
                if (g10 || L == u2.l.f33918a) {
                    L = new n(lVar, 0, booleanValue);
                    qVar.h0(L);
                }
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(R, (ho.a) L, null, 0L, false, 0, null, false, null, c3.k.d(1355057307, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.o
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        z AssistantRow$lambda$0$1;
                        int intValue = ((Integer) obj3).intValue();
                        AssistantRow$lambda$0$1 = ContentPreferencesScreenKt.AssistantRow$lambda$0$1(booleanValue, (r1.s) obj, (u2.m) obj2, intValue);
                        return AssistantRow$lambda$0$1;
                    }
                }, qVar), qVar, 805306368, 508);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(bool, lVar, i10, 11);
        }
    }

    public static final z AssistantRow$lambda$0$0$0(ho.l lVar, boolean z6) {
        lVar.invoke(Boolean.valueOf(!z6));
        return z.f31622a;
    }

    public static final z AssistantRow$lambda$0$1(boolean z6, r1.s sVar, u2.m mVar, int i10) {
        boolean z10;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            i3.t G = r1.d.G(e10, echoTheme.getSpacings(qVar, i11).getX5(), t2.u.P, 2);
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
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
            u2.r.J(eVar4, c5, qVar);
            i3.t o6 = p2.o(qVar2, 48);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(o6, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.bubble_stars_outline, qVar, 0), null, p2.o(qVar2, 20), echoTheme.getColors(qVar, i11).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
            qVar.p(true);
            r1.d.g(p2.s(qVar2, echoTheme.getSpacings(qVar, i11).getX3()), qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            j7.d(kj.c.R(qVar, R.string.account_settings_voice_chat), new m1(1.0f, true), echoTheme.getColors(qVar, i11).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar, i11).getBaseRegular500(qVar, EchoThemeTypography.$stable), qVar, 0, 24960, 110584);
            r1.d.g(p2.s(qVar2, echoTheme.getSpacings(qVar, i11).getX3()), qVar);
            EchoThemeColors.Component component = echoTheme.getColors(qVar, i11).getComponent();
            int i12 = EchoThemeColors.Component.$stable;
            long toggleBackgroundActive = component.getToggleBackgroundActive(qVar, i12);
            long toggleForegroundActive = echoTheme.getColors(qVar, i11).getComponent().getToggleForegroundActive(qVar, i12);
            EchoThemeColors.Border border = echoTheme.getColors(qVar, i11).getBorder();
            int i13 = EchoThemeColors.Border.$stable;
            c7.a(z6, null, false, d5.n(toggleForegroundActive, toggleBackgroundActive, border.getSeptenaryAlpha(qVar, i13), echoTheme.getColors(qVar, i11).getComponent().getToggleForegroundInactive(qVar, i12), echoTheme.getColors(qVar, i11).getComponent().getToggleBackgroundInactive(qVar, i12), echoTheme.getColors(qVar, i11).getBorder().getSeptenaryAlpha(qVar, i13), 0L, 0L, 0L, 0L, 0L, 0L, qVar, 65416), qVar, 48, 92);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AssistantRow$lambda$1(Boolean bool, ho.l lVar, int i10, u2.m mVar, int i11) {
        AssistantRow(bool, lVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void ContentPreferencesScreen(ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ContentPreferencesViewModel contentPreferencesViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ContentPreferencesViewModel contentPreferencesViewModel2;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(588992357);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar3)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar4)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                contentPreferencesViewModel2 = contentPreferencesViewModel;
                if (qVar.h(contentPreferencesViewModel2)) {
                    i13 = 16384;
                    i12 |= i13;
                }
            } else {
                contentPreferencesViewModel2 = contentPreferencesViewModel;
            }
            i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i12 |= i13;
        } else {
            contentPreferencesViewModel2 = contentPreferencesViewModel;
        }
        int i18 = i12;
        if ((i18 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i18 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 16) != 0) {
                    i18 &= -57345;
                }
            } else if ((i11 & 16) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    i18 &= -57345;
                    contentPreferencesViewModel2 = (ContentPreferencesViewModel) gg.b.j0(e0.f20562a.b(ContentPreferencesViewModel.class), a10, null, o6, cVar, qVar);
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            qVar.q();
            Boolean isAssistantEnabled = ((ContentPreferencesState) c1.m(contentPreferencesViewModel2.getStateFlow(), qVar, 0).getValue()).isAssistantEnabled();
            boolean h10 = qVar.h(contentPreferencesViewModel2);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new h(contentPreferencesViewModel2, 4);
                qVar.h0(L);
            }
            ContentPreferencesScreenUI(isAssistantEnabled, (ho.l) L, aVar, aVar2, aVar3, aVar4, qVar, (i18 << 6) & 524160);
        } else {
            qVar.R();
        }
        ContentPreferencesViewModel contentPreferencesViewModel3 = contentPreferencesViewModel2;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(aVar, aVar2, aVar3, aVar4, contentPreferencesViewModel3, i10, i11);
        }
    }

    public static final z ContentPreferencesScreen$lambda$0$0(ContentPreferencesViewModel contentPreferencesViewModel, boolean z6) {
        contentPreferencesViewModel.toggleAssistant(z6);
        return z.f31622a;
    }

    public static final z ContentPreferencesScreen$lambda$1(ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ContentPreferencesViewModel contentPreferencesViewModel, int i10, int i11, u2.m mVar, int i12) {
        ContentPreferencesScreen(aVar, aVar2, aVar3, aVar4, contentPreferencesViewModel, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void ContentPreferencesScreenUI(Boolean bool, ho.l lVar, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(904780833);
        if ((i10 & 6) == 0) {
            if (qVar2.f(bool)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(aVar3)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        }
        if ((196608 & i10) == 0) {
            if (qVar2.h(aVar4)) {
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
        if (qVar2.O(i11 & 1, z6)) {
            qVar = qVar2;
            k5.a(null, null, null, null, null, 0, 0L, 0L, null, c3.k.d(-893735184, true, new q(aVar, aVar2, aVar3, aVar4, bool, lVar), qVar2), qVar, 805306368, 511);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.e(bool, lVar, aVar, aVar2, aVar3, aVar4, i10, 5);
        }
    }

    public static final z ContentPreferencesScreenUI$lambda$0(ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, Boolean bool, ho.l lVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t o6 = r1.d.o(r1.d.D(l1.n.h(p2.d(qVar2, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b), z1Var), z1Var);
            f1 d10 = r1.p.d(i3.d.f12998b, false);
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
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            i3.t d11 = p2.d(qVar2, 1.0f);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(d11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            HeaderActionsKt.EchoThemeHeaderActions(null, kj.c.R(qVar, R.string.account_content_preferences), c3.k.d(146156977, true, new p(0, aVar), qVar), null, qVar, 384, 9);
            ShadowKt.m1876BottomShadowOverlayPZHvWI(p2.d(qVar2, 1.0f), ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), 0L, c3.k.d(-17847020, true, new io.elevenlabs.readerapp.ui.screens.authenticated.a(aVar2, aVar3, aVar4, bool, lVar), qVar), qVar, 3078, 4);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ContentPreferencesScreenUI$lambda$0$0$0$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonKt.EchoThemeBackButton(aVar, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ContentPreferencesScreenUI$lambda$0$0$0$1(ho.a aVar, ho.a aVar2, ho.a aVar3, Boolean bool, ho.l lVar, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t y10 = l1.n.y(p2.d(qVar2, 1.0f), l1.n.x(qVar), true, true);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            i3.t G = r1.d.G(y10, t2.u.P, echoTheme.getSpacings(qVar, i11).getX2(), 1);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
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
            ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
            ActionRowItemKt.ActionRowItem(kj.c.R(qVar, R.string.account_settings_manage_content_interests), null, Integer.valueOf(io.elevenlabs.ui.R.drawable.content_filled), null, aVar, qVar, 0, 10);
            ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
            ActionRowItemKt.ActionRowItem(kj.c.R(qVar, R.string.account_settings_set_explore_language), null, Integer.valueOf(io.elevenlabs.ui.R.drawable.language), null, aVar2, qVar, 0, 10);
            ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
            ActionRowItemKt.ActionRowItem(kj.c.R(qVar, R.string.account_settings_pronunciations), null, Integer.valueOf(io.elevenlabs.ui.R.drawable.book_outline), null, aVar3, qVar, 0, 10);
            ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
            AssistantRow(bool, lVar, qVar, 0);
            ib.i.C(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable, qVar2, qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ContentPreferencesScreenUI$lambda$1(Boolean bool, ho.l lVar, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, int i10, u2.m mVar, int i11) {
        ContentPreferencesScreenUI(bool, lVar, aVar, aVar2, aVar3, aVar4, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ContentPreferencesScreen(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2033327123);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ContentPreferencesScreenKt.INSTANCE.getLambda$1802214765$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 10);
        }
    }

    public static final z Preview_ContentPreferencesScreen$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ContentPreferencesScreen(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final /* synthetic */ void access$ContentPreferencesScreenUI(Boolean bool, ho.l lVar, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, u2.m mVar, int i10) {
        ContentPreferencesScreenUI(bool, lVar, aVar, aVar2, aVar3, aVar4, mVar, i10);
    }
}

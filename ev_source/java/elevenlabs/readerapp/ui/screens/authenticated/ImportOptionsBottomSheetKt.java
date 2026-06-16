package io.elevenlabs.readerapp.ui.screens.authenticated;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.echo.components.ButtonIconContainerSize;
import io.elevenlabs.ui.echo.components.ButtonIconKt;
import io.elevenlabs.ui.echo.components.TileKt;
import io.elevenlabs.ui.echo.components.UpsellTitleKt;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.c3;
import r1.d2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.o1;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001ak\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ak\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"", "canUpgrade", "Lkotlin/Function0;", "Lsn/z;", "close", "onNavigateToWrite", "onNavigateToLinkImport", "onNavigateToFileImport", "onNavigateToOcr", "onNavigateToPaywall", "ImportOptionsBottomSheet", "(ZLho/a;Lho/a;Lho/a;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "onClose", "ImportOptionsBottomSheetUI", "Header", "(Lho/a;Lu2/m;I)V", "Preview_ImportOptionsBottomSheet", "(Lu2/m;I)V", "Preview_ImportOptionsBottomSheet_Ultra", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ImportOptionsBottomSheetKt {
    private static final void Header(ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(125902159);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.t e10 = p2.e(i3.q.f13017a, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            i3.t I = r1.d.I(e10, echoTheme.getSpacings(qVar, i13).getX5(), t2.u.P, echoTheme.getSpacings(qVar, i13).getX1_5(), echoTheme.getSpacings(qVar, i13).getX4(), 2);
            r1.u0 u0Var = r1.j.f29228a;
            i3.k kVar = i3.d.f13005z0;
            k2 a10 = i2.a(u0Var, kVar, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(I, qVar);
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
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            r1.x a11 = r1.w.a(r1.j.i(echoTheme.getSpacings(qVar, i13).getX0_5(), kVar), i3.d.B0, qVar, 0);
            int i14 = i11;
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            String R = kj.c.R(qVar, R.string.import_sheet_title);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i13);
            int i15 = EchoThemeTypography.$stable;
            j7.d(R, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, typography.getBaseRegular500(qVar, i15), qVar, 0, 24960, 110590);
            j7.d(kj.c.R(qVar, R.string.import_sheet_description), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, s4.y0.a(echoTheme.getTypography(qVar, i13).getSmRegular400(qVar, i15), echoTheme.getColors(qVar, i13).getText().getSecondary(qVar, EchoThemeColors.Text.$stable), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar, 0, 24960, 110590);
            qVar.p(true);
            float x3_5 = echoTheme.getSpacings(qVar, i13).getX3_5();
            ButtonIconKt.m1961ButtonIconFhKo8ac(io.elevenlabs.ui.R.drawable.ic_cross_large, kj.c.R(qVar, R.string.bottom_sheet_dialog_close), aVar, null, 20, 0L, new ButtonIconContainerSize.WrapIcon(new d2(x3_5, x3_5, x3_5, x3_5)), null, false, qVar, ((i14 << 6) & 896) | 24576 | (ButtonIconContainerSize.WrapIcon.$stable << 18), 424);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar, i10, 2);
        }
    }

    public static final sn.z Header$lambda$1(ho.a aVar, int i10, u2.m mVar, int i11) {
        Header(aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void ImportOptionsBottomSheet(final boolean z6, final ho.a aVar, final ho.a aVar2, final ho.a aVar3, final ho.a aVar4, final ho.a aVar5, final ho.a aVar6, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(987135049);
        if ((i10 & 6) == 0) {
            if (qVar2.g(z6)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i11 = i18 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i11 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar2)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i11 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar3)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(aVar4)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i14;
        }
        if ((196608 & i10) == 0) {
            if (qVar2.h(aVar5)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i11 |= i13;
        }
        if ((i10 & 1572864) == 0) {
            if (qVar2.h(aVar6)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i11 |= i12;
        }
        if ((599187 & i11) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar2.O(i11 & 1, z10)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i19 = EchoTheme.$stable;
            qVar = qVar2;
            BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, echoTheme.getColors(qVar2, i19).getBackground().getPrimary(qVar2, EchoThemeColors.Background.$stable), echoTheme.getRadii(qVar2, i19).getThreeXl(), aVar, false, (ho.r) c3.k.d(-1070939397, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.o0
                @Override // ho.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    sn.z ImportOptionsBottomSheet$lambda$0;
                    int intValue = ((Integer) obj4).intValue();
                    ImportOptionsBottomSheet$lambda$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0(z6, aVar2, aVar, aVar3, aVar4, aVar5, aVar6, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, intValue);
                    return ImportOptionsBottomSheet$lambda$0;
                }
            }, qVar2), (u2.m) qVar, ((i11 << 9) & 57344) | 1572864, 35);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new p0(z6, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, i10, 0);
        }
    }

    public static final sn.z ImportOptionsBottomSheet$lambda$0(boolean z6, final ho.a aVar, final ho.a aVar2, final ho.a aVar3, final ho.a aVar4, final ho.a aVar5, final ho.a aVar6, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(aVar) | qVar.f(aVar2);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (f10 || L == eVar) {
            final int i11 = 0;
            L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.q0
                @Override // ho.a
                public final Object invoke() {
                    sn.z ImportOptionsBottomSheet$lambda$0$0$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$1$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$2$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$3$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$4$0;
                    switch (i11) {
                        case 0:
                            ImportOptionsBottomSheet$lambda$0$0$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$0$0(aVar, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$0$0;
                        case 1:
                            ImportOptionsBottomSheet$lambda$0$1$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$1$0(aVar, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$1$0;
                        case 2:
                            ImportOptionsBottomSheet$lambda$0$2$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$2$0(aVar, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$2$0;
                        case 3:
                            ImportOptionsBottomSheet$lambda$0$3$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$3$0(aVar, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$3$0;
                        default:
                            ImportOptionsBottomSheet$lambda$0$4$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$4$0(aVar, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$4$0;
                    }
                }
            };
            qVar.h0(L);
        }
        ho.a aVar7 = (ho.a) L;
        boolean f11 = qVar.f(aVar3) | qVar.f(aVar2);
        Object L2 = qVar.L();
        if (f11 || L2 == eVar) {
            final int i12 = 1;
            L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.q0
                @Override // ho.a
                public final Object invoke() {
                    sn.z ImportOptionsBottomSheet$lambda$0$0$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$1$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$2$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$3$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$4$0;
                    switch (i12) {
                        case 0:
                            ImportOptionsBottomSheet$lambda$0$0$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$0$0(aVar3, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$0$0;
                        case 1:
                            ImportOptionsBottomSheet$lambda$0$1$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$1$0(aVar3, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$1$0;
                        case 2:
                            ImportOptionsBottomSheet$lambda$0$2$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$2$0(aVar3, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$2$0;
                        case 3:
                            ImportOptionsBottomSheet$lambda$0$3$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$3$0(aVar3, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$3$0;
                        default:
                            ImportOptionsBottomSheet$lambda$0$4$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$4$0(aVar3, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$4$0;
                    }
                }
            };
            qVar.h0(L2);
        }
        ho.a aVar8 = (ho.a) L2;
        boolean f12 = qVar.f(aVar4) | qVar.f(aVar2);
        Object L3 = qVar.L();
        if (f12 || L3 == eVar) {
            final int i13 = 2;
            L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.q0
                @Override // ho.a
                public final Object invoke() {
                    sn.z ImportOptionsBottomSheet$lambda$0$0$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$1$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$2$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$3$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$4$0;
                    switch (i13) {
                        case 0:
                            ImportOptionsBottomSheet$lambda$0$0$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$0$0(aVar4, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$0$0;
                        case 1:
                            ImportOptionsBottomSheet$lambda$0$1$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$1$0(aVar4, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$1$0;
                        case 2:
                            ImportOptionsBottomSheet$lambda$0$2$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$2$0(aVar4, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$2$0;
                        case 3:
                            ImportOptionsBottomSheet$lambda$0$3$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$3$0(aVar4, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$3$0;
                        default:
                            ImportOptionsBottomSheet$lambda$0$4$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$4$0(aVar4, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$4$0;
                    }
                }
            };
            qVar.h0(L3);
        }
        ho.a aVar9 = (ho.a) L3;
        boolean f13 = qVar.f(aVar5) | qVar.f(aVar2);
        Object L4 = qVar.L();
        if (f13 || L4 == eVar) {
            final int i14 = 3;
            L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.q0
                @Override // ho.a
                public final Object invoke() {
                    sn.z ImportOptionsBottomSheet$lambda$0$0$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$1$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$2$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$3$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$4$0;
                    switch (i14) {
                        case 0:
                            ImportOptionsBottomSheet$lambda$0$0$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$0$0(aVar5, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$0$0;
                        case 1:
                            ImportOptionsBottomSheet$lambda$0$1$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$1$0(aVar5, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$1$0;
                        case 2:
                            ImportOptionsBottomSheet$lambda$0$2$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$2$0(aVar5, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$2$0;
                        case 3:
                            ImportOptionsBottomSheet$lambda$0$3$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$3$0(aVar5, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$3$0;
                        default:
                            ImportOptionsBottomSheet$lambda$0$4$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$4$0(aVar5, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$4$0;
                    }
                }
            };
            qVar.h0(L4);
        }
        ho.a aVar10 = (ho.a) L4;
        boolean f14 = qVar.f(aVar6) | qVar.f(aVar2);
        Object L5 = qVar.L();
        if (f14 || L5 == eVar) {
            final int i15 = 4;
            L5 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.q0
                @Override // ho.a
                public final Object invoke() {
                    sn.z ImportOptionsBottomSheet$lambda$0$0$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$1$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$2$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$3$0;
                    sn.z ImportOptionsBottomSheet$lambda$0$4$0;
                    switch (i15) {
                        case 0:
                            ImportOptionsBottomSheet$lambda$0$0$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$0$0(aVar6, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$0$0;
                        case 1:
                            ImportOptionsBottomSheet$lambda$0$1$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$1$0(aVar6, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$1$0;
                        case 2:
                            ImportOptionsBottomSheet$lambda$0$2$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$2$0(aVar6, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$2$0;
                        case 3:
                            ImportOptionsBottomSheet$lambda$0$3$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$3$0(aVar6, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$3$0;
                        default:
                            ImportOptionsBottomSheet$lambda$0$4$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$0$4$0(aVar6, aVar2);
                            return ImportOptionsBottomSheet$lambda$0$4$0;
                    }
                }
            };
            qVar.h0(L5);
        }
        ImportOptionsBottomSheetUI(z6, aVar7, aVar8, aVar9, aVar10, (ho.a) L5, aVar2, qVar, 0);
        return sn.z.f31622a;
    }

    public static final sn.z ImportOptionsBottomSheet$lambda$0$0$0(ho.a aVar, ho.a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ImportOptionsBottomSheet$lambda$0$1$0(ho.a aVar, ho.a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ImportOptionsBottomSheet$lambda$0$2$0(ho.a aVar, ho.a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ImportOptionsBottomSheet$lambda$0$3$0(ho.a aVar, ho.a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ImportOptionsBottomSheet$lambda$0$4$0(ho.a aVar, ho.a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ImportOptionsBottomSheet$lambda$1(boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, ho.a aVar6, int i10, u2.m mVar, int i11) {
        ImportOptionsBottomSheet(z6, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void ImportOptionsBottomSheetUI(boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, ho.a aVar6, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        ho.a aVar7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1321397621);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i11 = i18 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i11 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar2)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i11 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar3)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(aVar4)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i14;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(aVar5)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i11 |= i13;
        }
        if ((1572864 & i10) == 0) {
            if (qVar.h(aVar6)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i11 |= i12;
        }
        if ((599187 & i11) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            WeakHashMap weakHashMap = c3.f29142x;
            i3.t p10 = r1.d.p(r1.d.D(e10, r1.d.i(new o1(r1.u0.e(qVar).f29149g, 32), qVar)), new o1(r1.u0.e(qVar).f29149g, 32));
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i19 = EchoTheme.$stable;
            int i20 = i11;
            i3.t G = r1.d.G(p10, t2.u.P, echoTheme.getSpacings(qVar, i19).getX5(), 1);
            r1.e eVar = r1.j.f29230c;
            r1.x a10 = r1.w.a(eVar, i3.d.B0, qVar, 0);
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
            h4.e eVar2 = h4.g.f11907f;
            u2.r.J(eVar2, a10, qVar);
            h4.e eVar3 = h4.g.f11906e;
            u2.r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar5 = h4.g.f11905d;
            u2.r.J(eVar5, c5, qVar);
            Header(aVar6, qVar, (i20 >> 18) & 14);
            i3.t I = r1.d.I(r1.d.I(p2.e(qVar2, 1.0f), echoTheme.getSpacings(qVar, i19).getX5(), t2.u.P, echoTheme.getSpacings(qVar, i19).getX5(), t2.u.P, 10), t2.u.P, echoTheme.getSpacings(qVar, i19).getX5(), t2.u.P, t2.u.P, 13);
            r1.x a11 = r1.w.a(eVar, i3.d.C0, qVar, 48);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(I, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, a11, qVar);
            u2.r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c10, qVar);
            qVar.X(-535290059);
            un.b o6 = ig.f.o();
            o6.add(new ImportOption(io.elevenlabs.ui.R.drawable.globus__map__earth__globe, kj.c.R(qVar, R.string.import_sheet_link), aVar2));
            o6.add(new ImportOption(io.elevenlabs.ui.R.drawable.notebook, kj.c.R(qVar, R.string.import_sheet_file), aVar3));
            o6.add(new ImportOption(io.elevenlabs.ui.R.drawable.prompt__scan_text, kj.c.R(qVar, R.string.import_sheet_ocr), aVar4));
            aVar7 = aVar;
            o6.add(new ImportOption(io.elevenlabs.ui.R.drawable.text_indicator, kj.c.R(qVar, R.string.import_sheet_text), aVar7));
            un.b i21 = ig.f.i(o6);
            qVar.p(false);
            u1.c cVar = new u1.c(2);
            r1.h g10 = r1.j.g(echoTheme.getSpacings(qVar, i19).getX5());
            r1.h g11 = r1.j.g(echoTheme.getSpacings(qVar, i19).getX5());
            i3.t e11 = p2.e(qVar2, 1.0f);
            boolean h10 = qVar.h(i21);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new x(i21, 3);
                qVar.h0(L);
            }
            tb.a.e(cVar, e11, null, null, g11, g10, null, false, null, (ho.l) L, qVar, 48, 0, 924);
            qVar = qVar;
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i19).getX5()), qVar);
            DividerKt.m1827DivideriJQMabo(null, echoTheme.getColors(qVar, i19).getBorder().getSeptenaryAlpha(qVar, EchoThemeColors.Border.$stable), qVar, 0, 1);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i19).getX5()), qVar);
            if (z6) {
                qVar.X(587970787);
                UpsellTitleKt.UpsellBanner(kj.c.R(qVar, R.string.import_sheet_upsell_title), kj.c.R(qVar, R.string.import_sheet_upsell_description), aVar5, qVar, (i20 >> 9) & 896);
                qVar.p(false);
            } else {
                qVar.X(588245633);
                qVar.p(false);
            }
            qVar.p(true);
            qVar.p(true);
        } else {
            aVar7 = aVar;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new p0(z6, aVar7, aVar2, aVar3, aVar4, aVar5, aVar6, i10, 1);
        }
    }

    public static final sn.z ImportOptionsBottomSheetUI$lambda$0$0$1$0(final List list, u1.w wVar) {
        wVar.getClass();
        final ImportOptionsBottomSheetKt$ImportOptionsBottomSheetUI$lambda$0$0$1$0$$inlined$items$default$1 importOptionsBottomSheetKt$ImportOptionsBottomSheetUI$lambda$0$0$1$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.ImportOptionsBottomSheetKt$ImportOptionsBottomSheetUI$lambda$0$0$1$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ImportOption) obj);
            }

            @Override // ho.l
            public final Void invoke(ImportOption importOption) {
                return null;
            }
        };
        ((u1.j) wVar).t(list.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.ImportOptionsBottomSheetKt$ImportOptionsBottomSheetUI$lambda$0$0$1$0$$inlined$items$default$4
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.ImportOptionsBottomSheetKt$ImportOptionsBottomSheetUI$lambda$0$0$1$0$$inlined$items$default$5
            public final void invoke(u1.m mVar, int i10, u2.m mVar2, int i11) {
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((u2.q) mVar2).f(mVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((u2.q) mVar2).d(i10)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                u2.q qVar = (u2.q) mVar2;
                if (qVar.O(i12 & 1, z6)) {
                    ImportOption importOption = (ImportOption) list.get(i10);
                    qVar.X(-1151003417);
                    TileKt.Tile(importOption.getTitle(), importOption.getIcon(), importOption.getOnClick(), null, null, false, qVar, 0, 56);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((u1.m) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return sn.z.f31622a;
            }
        }, true, -1117249557));
        return sn.z.f31622a;
    }

    public static final sn.z ImportOptionsBottomSheetUI$lambda$1(boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, ho.a aVar6, int i10, u2.m mVar, int i11) {
        ImportOptionsBottomSheetUI(z6, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ImportOptionsBottomSheet(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1375908750);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ImportOptionsBottomSheetKt.INSTANCE.getLambda$1137887180$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 19);
        }
    }

    public static final sn.z Preview_ImportOptionsBottomSheet$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ImportOptionsBottomSheet(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ImportOptionsBottomSheet_Ultra(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-139820673);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ImportOptionsBottomSheetKt.INSTANCE.getLambda$1361613145$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 20);
        }
    }

    public static final sn.z Preview_ImportOptionsBottomSheet_Ultra$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ImportOptionsBottomSheet_Ultra(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

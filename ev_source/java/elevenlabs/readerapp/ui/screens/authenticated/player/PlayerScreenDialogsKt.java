package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.FlowExtensionsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.PlayerContentsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BookmarksSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ExportSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.FullScreenImageKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.RenameDialogKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SpeedPickerSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.RateTitleSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareOptionsSheetKt;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.components.EchoToastAction;
import io.elevenlabs.ui.echo.components.EchoToastKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.c3;
import r1.p2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0007\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lir/z1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerViewModel;", "Lsn/z;", "action", "PlayerScreenDialogs", "(Lir/z1;Lho/l;Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerScreenDialogsKt {
    public static final void PlayerScreenDialogs(ir.z1 z1Var, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.l lVar2;
        ho.l lVar3;
        boolean z10;
        boolean z11;
        u2.e eVar;
        int i12;
        float f10;
        u2.q qVar;
        int i13;
        int i14;
        float f11;
        int i15;
        boolean z12;
        u2.e eVar2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        float f12;
        int i16;
        int i17;
        z1Var.getClass();
        lVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1825535158);
        if ((i10 & 6) == 0) {
            if (qVar2.h(z1Var)) {
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
        int i18 = i11;
        if ((i18 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i18 & 1, z6)) {
            Object L = qVar2.L();
            u2.e eVar3 = u2.l.f33918a;
            if (L == eVar3) {
                L = new m(14);
                qVar2.h0(L);
            }
            int i19 = (i18 & 14) | 48;
            if (((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L, qVar2, i19).getValue()).booleanValue()) {
                qVar2.X(1642177423);
                Object L2 = qVar2.L();
                if (L2 == eVar3) {
                    L2 = new m(22);
                    qVar2.h0(L2);
                }
                ReadMeta readMeta = (ReadMeta) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L2, qVar2, i19).getValue();
                Object L3 = qVar2.L();
                if (L3 == eVar3) {
                    L3 = new m(28);
                    qVar2.h0(L3);
                }
                ir.z1 mapState = FlowExtensionsKt.mapState(z1Var, (ho.l) L3);
                Object L4 = qVar2.L();
                if (L4 == eVar3) {
                    L4 = new j0(4);
                    qVar2.h0(L4);
                }
                boolean booleanValue = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L4, qVar2, i19).getValue()).booleanValue();
                Object L5 = qVar2.L();
                if (L5 == eVar3) {
                    L5 = new j0(5);
                    qVar2.h0(L5);
                }
                PlayerContentsScreenKt.PlayerContentsScreen(readMeta, lVar, mapState, booleanValue, (String) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L5, qVar2, i19).getValue(), qVar2, i18 & 112);
                lVar3 = lVar;
                qVar2 = qVar2;
                qVar2.p(false);
            } else {
                lVar3 = lVar;
                qVar2.X(1642605068);
                qVar2.p(false);
            }
            Object L6 = qVar2.L();
            if (L6 == eVar3) {
                L6 = new j0(6);
                qVar2.h0(L6);
            }
            if (((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L6, qVar2, i19).getValue()).booleanValue()) {
                qVar2.X(1642675500);
                Object L7 = qVar2.L();
                if (L7 == eVar3) {
                    L7 = new j0(7);
                    qVar2.h0(L7);
                }
                Float f13 = (Float) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L7, qVar2, i19).getValue();
                if (f13 != null) {
                    f12 = f13.floatValue();
                } else {
                    f12 = 1.0f;
                }
                SpeedPickerSheetKt.SpeedPickerSheet(lVar3, f12, qVar2, (i18 >> 3) & 14);
                qVar2.p(false);
            } else {
                qVar2.X(1642829260);
                qVar2.p(false);
            }
            Object L8 = qVar2.L();
            if (L8 == eVar3) {
                L8 = new j0(8);
                qVar2.h0(L8);
            }
            if (((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L8, qVar2, i19).getValue()).booleanValue()) {
                qVar2.X(1642901521);
                Object L9 = qVar2.L();
                if (L9 == eVar3) {
                    L9 = new j0(10);
                    qVar2.h0(L9);
                }
                String str = (String) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L9, qVar2, i19).getValue();
                if (str != null) {
                    qVar2.X(1643001930);
                    if ((i18 & 112) == 32) {
                        z30 = true;
                    } else {
                        z30 = false;
                    }
                    Object L10 = qVar2.L();
                    if (z30 || L10 == eVar3) {
                        L10 = new l(lVar3, 19);
                        qVar2.h0(L10);
                    }
                    SleepTimerSheetKt.SleepTimerSheet((ho.a) L10, str, null, qVar2, 0, 4);
                    qVar2.p(false);
                } else {
                    qVar2.X(1643136780);
                    qVar2.p(false);
                }
                qVar2.p(false);
            } else {
                qVar2.X(1643142732);
                qVar2.p(false);
            }
            Object L11 = qVar2.L();
            if (L11 == eVar3) {
                L11 = new m(15);
                qVar2.h0(L11);
            }
            if (((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L11, qVar2, i19).getValue()).booleanValue()) {
                qVar2.X(1643205817);
                int i20 = i18 & 112;
                if (i20 == 32) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                Object L12 = qVar2.L();
                if (z29 || L12 == eVar3) {
                    L12 = new l(lVar3, 10);
                    qVar2.h0(L12);
                }
                ExportSheetKt.ExportSheet((ho.a) L12, lVar3, qVar2, i20);
                qVar2.p(false);
            } else {
                qVar2.X(1643285580);
                qVar2.p(false);
            }
            Object L13 = qVar2.L();
            if (L13 == eVar3) {
                L13 = new m(16);
                qVar2.h0(L13);
            }
            String str2 = "";
            if (((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L13, qVar2, i19).getValue()).booleanValue()) {
                qVar2.X(1643353904);
                Object L14 = qVar2.L();
                if (L14 == eVar3) {
                    L14 = new m(17);
                    qVar2.h0(L14);
                }
                String str3 = (String) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L14, qVar2, i19).getValue();
                if (str3 == null) {
                    str3 = "";
                }
                int i21 = i18 & 112;
                if (i21 == 32) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                Object L15 = qVar2.L();
                if (z27 || L15 == eVar3) {
                    L15 = new l(lVar3, 11);
                    qVar2.h0(L15);
                }
                ho.a aVar = (ho.a) L15;
                if (i21 == 32) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                Object L16 = qVar2.L();
                if (z28 || L16 == eVar3) {
                    L16 = new t(lVar3, 1);
                    qVar2.h0(L16);
                }
                RenameDialogKt.RenameDialog(str3, aVar, (ho.l) L16, qVar2, 0);
                qVar2.p(false);
            } else {
                qVar2.X(1643596076);
                qVar2.p(false);
            }
            Object L17 = qVar2.L();
            if (L17 == eVar3) {
                L17 = new m(18);
                qVar2.h0(L17);
            }
            if (((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L17, qVar2, i19).getValue()).booleanValue()) {
                qVar2.X(1643665888);
                Object L18 = qVar2.L();
                if (L18 == eVar3) {
                    L18 = new m(19);
                    qVar2.h0(L18);
                }
                String str4 = (String) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L18, qVar2, i19).getValue();
                if ((i18 & 112) == 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                Object L19 = qVar2.L();
                if (z26 || L19 == eVar3) {
                    L19 = new t(lVar3, 2);
                    qVar2.h0(L19);
                }
                RateTitleSheetKt.RateTitleSheet(str4, (ho.l) L19, null, qVar2, 0, 4);
                qVar2.p(false);
            } else {
                qVar2.X(1643954188);
                qVar2.p(false);
            }
            Object L20 = qVar2.L();
            if (L20 == eVar3) {
                L20 = new m(21);
                qVar2.h0(L20);
            }
            if (((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L20, qVar2, i19).getValue()).booleanValue()) {
                qVar2.X(1644054566);
                Object L21 = qVar2.L();
                if (L21 == eVar3) {
                    L21 = new m(23);
                    qVar2.h0(L21);
                }
                ReadMeta readMeta2 = (ReadMeta) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L21, qVar2, i19).getValue();
                if (readMeta2 != null) {
                    qVar2.X(1644153363);
                    String readId = readMeta2.getReadId();
                    int i22 = i18 & 112;
                    if (i22 == 32) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    Object L22 = qVar2.L();
                    if (z23 || L22 == eVar3) {
                        L22 = new l(lVar3, 12);
                        qVar2.h0(L22);
                    }
                    ho.a aVar2 = (ho.a) L22;
                    if (i22 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    Object L23 = qVar2.L();
                    if (z24 || L23 == eVar3) {
                        L23 = new l(lVar3, 13);
                        qVar2.h0(L23);
                    }
                    ho.a aVar3 = (ho.a) L23;
                    if (i22 == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    Object L24 = qVar2.L();
                    if (z25 || L24 == eVar3) {
                        L24 = new l(lVar3, 14);
                        qVar2.h0(L24);
                    }
                    ho.a aVar4 = (ho.a) L24;
                    z10 = true;
                    z11 = false;
                    eVar = eVar3;
                    f10 = 1.0f;
                    i12 = i19;
                    qVar = qVar2;
                    i13 = 32;
                    ReadShareOptionsSheetKt.ReadShareOptionsSheet(readId, aVar2, aVar3, aVar4, null, qVar, 0, 16);
                    qVar.p(false);
                } else {
                    z10 = true;
                    z11 = false;
                    eVar = eVar3;
                    i12 = i19;
                    f10 = 1.0f;
                    qVar = qVar2;
                    i13 = 32;
                    qVar.X(1644454156);
                    qVar.p(false);
                }
                qVar.p(z11);
            } else {
                z10 = true;
                z11 = false;
                eVar = eVar3;
                i12 = i19;
                f10 = 1.0f;
                qVar = qVar2;
                i13 = 32;
                qVar.X(1644460108);
                qVar.p(false);
            }
            Object L25 = qVar.L();
            if (L25 == eVar) {
                L25 = new m(24);
                qVar.h0(L25);
            }
            if (((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L25, qVar, i12).getValue()).booleanValue()) {
                qVar.X(1644531346);
                Object L26 = qVar.L();
                if (L26 == eVar) {
                    L26 = new m(25);
                    qVar.h0(L26);
                }
                String str5 = (String) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L26, qVar, i12).getValue();
                if (str5 != null) {
                    str2 = str5;
                }
                int i23 = i18 & 112;
                if (i23 == i13) {
                    z21 = z10;
                } else {
                    z21 = z11;
                }
                Object L27 = qVar.L();
                if (z21 || L27 == eVar) {
                    L27 = new l(lVar3, 15);
                    qVar.h0(L27);
                }
                ho.a aVar5 = (ho.a) L27;
                if (i23 == i13) {
                    z22 = z10;
                } else {
                    z22 = z11;
                }
                Object L28 = qVar.L();
                if (z22 || L28 == eVar) {
                    L28 = new t(lVar3, 3);
                    qVar.h0(L28);
                }
                ho.l lVar4 = (ho.l) L28;
                z12 = z11;
                i15 = i13;
                u2.q qVar3 = qVar;
                z13 = z10;
                eVar2 = eVar;
                i14 = i12;
                f11 = f10;
                lVar2 = lVar;
                BookmarksSheetKt.BookmarksSheet(str2, aVar5, lVar4, null, qVar3, 0, 8);
                qVar2 = qVar3;
                qVar2.p(z12);
            } else {
                i14 = i12;
                f11 = f10;
                i15 = i13;
                z12 = z11;
                eVar2 = eVar;
                lVar2 = lVar3;
                qVar2 = qVar;
                z13 = z10;
                qVar2.X(1644771596);
                qVar2.p(z12);
            }
            Object L29 = qVar2.L();
            if (L29 == eVar2) {
                L29 = new m(27);
                qVar2.h0(L29);
            }
            String str6 = (String) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L29, qVar2, i14).getValue();
            if (str6 != null) {
                qVar2.X(1644896123);
                int i24 = i18 & 112;
                if (i24 == i15) {
                    z19 = z13;
                } else {
                    z19 = z12;
                }
                Object L30 = qVar2.L();
                if (z19 || L30 == eVar2) {
                    L30 = new l(lVar2, 16);
                    qVar2.h0(L30);
                }
                ho.a aVar6 = (ho.a) L30;
                if (i24 == i15) {
                    z20 = z13;
                } else {
                    z20 = z12;
                }
                Object L31 = qVar2.L();
                if (z20 || L31 == eVar2) {
                    L31 = new t(lVar2, 4);
                    qVar2.h0(L31);
                }
                u2.q qVar4 = qVar2;
                BookmarkSheetKt.BookmarkSheet(str6, aVar6, (ho.l) L31, null, qVar4, 0, 8);
                qVar2 = qVar4;
                qVar2.p(z12);
            } else {
                qVar2.X(1645189228);
                qVar2.p(z12);
            }
            Object L32 = qVar2.L();
            if (L32 == eVar2) {
                L32 = new m(29);
                qVar2.h0(L32);
            }
            String str7 = (String) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L32, qVar2, i14).getValue();
            i3.t d10 = p2.d(i3.q.f13017a, f11);
            f4.f1 d11 = r1.p.d(i3.d.Z, z12);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(d10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, d11, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c5, qVar2);
            if (str7 != null) {
                z14 = z13;
            } else {
                z14 = z12;
            }
            AnimatedVisibilityContainersKt.AnimatedSlideBottomVisibility(z14, c3.k.d(-269681583, z13, new n(lVar2, 2), qVar2), qVar2, 48);
            qVar2.p(z13);
            Object L33 = qVar2.L();
            if (L33 == eVar2) {
                L33 = new j0(0);
                qVar2.h0(L33);
            }
            String str8 = (String) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L33, qVar2, i14).getValue();
            if (str8 != null) {
                qVar2.X(1646311769);
                if ((i18 & 112) == i15) {
                    z18 = z13;
                } else {
                    z18 = z12;
                }
                Object L34 = qVar2.L();
                if (z18 || L34 == eVar2) {
                    L34 = new l(lVar2, 17);
                    qVar2.h0(L34);
                }
                EditBookmarkSheetKt.EditBookmarkSheet(str8, (ho.a) L34, null, qVar2, 0, 4);
                qVar2.p(z12);
            } else {
                qVar2.X(1646453036);
                qVar2.p(z12);
            }
            Object L35 = qVar2.L();
            if (L35 == eVar2) {
                L35 = new j0(1);
                qVar2.h0(L35);
            }
            String str9 = (String) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L35, qVar2, i14).getValue();
            if (str9 != null) {
                qVar2.X(1646572913);
                FullScreenImageKt.FullScreenImage(lVar2, str9, qVar2, (i18 >> 3) & 14);
                qVar2.p(z12);
            } else {
                qVar2.X(1646629612);
                qVar2.p(z12);
            }
            Object L36 = qVar2.L();
            if (L36 == eVar2) {
                L36 = new j0(2);
                qVar2.h0(L36);
            }
            Pronunciation pronunciation = (Pronunciation) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L36, qVar2, i14).getValue();
            Object L37 = qVar2.L();
            if (L37 == eVar2) {
                L37 = new j0(3);
                qVar2.h0(L37);
            }
            PronunciationPreviewState pronunciationPreviewState = (PronunciationPreviewState) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L37, qVar2, i14).getValue();
            if (pronunciation != null) {
                qVar2.X(1646917292);
                int i25 = i18 & 112;
                if (i25 == i15) {
                    z15 = z13;
                } else {
                    z15 = z12;
                }
                Object L38 = qVar2.L();
                if (z15 || L38 == eVar2) {
                    L38 = new l(lVar2, 18);
                    qVar2.h0(L38);
                }
                ho.a aVar7 = (ho.a) L38;
                if (i25 == i15) {
                    z16 = z13;
                } else {
                    z16 = z12;
                }
                boolean h10 = qVar2.h(pronunciation) | z16;
                Object L39 = qVar2.L();
                if (h10 || L39 == eVar2) {
                    L39 = new d2(lVar2, pronunciation, 7);
                    qVar2.h0(L39);
                }
                ho.l lVar5 = (ho.l) L39;
                if (i25 == i15) {
                    z17 = z13;
                } else {
                    z17 = z12;
                }
                boolean h11 = qVar2.h(pronunciation) | z17;
                Object L40 = qVar2.L();
                if (h11 || L40 == eVar2) {
                    L40 = new s(lVar2, pronunciation, 1);
                    qVar2.h0(L40);
                }
                u2.q qVar5 = qVar2;
                PlayerPronunciationsKt.PronunciationExistsDialog(pronunciation, pronunciationPreviewState, aVar7, lVar5, (ho.a) L40, qVar5, 0);
                qVar2 = qVar5;
                qVar2.p(z12);
            } else {
                qVar2.X(1647747596);
                qVar2.p(z12);
            }
        } else {
            lVar2 = lVar;
            qVar2.R();
        }
        u2.r1 r10 = qVar2.r();
        if (r10 != null) {
            r10.f34012d = new k0(z1Var, lVar2, i10, 0);
        }
    }

    public static final boolean PlayerScreenDialogs$lambda$0$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowContentsDialog();
    }

    public static final ReadMeta PlayerScreenDialogs$lambda$1$0(PlayerState playerState) {
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null) {
            return contentState.getReadMeta();
        }
        return null;
    }

    public static final boolean PlayerScreenDialogs$lambda$10$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowExportDialog();
    }

    public static final sn.z PlayerScreenDialogs$lambda$11$0(ho.l lVar) {
        lVar.invoke(new m(26));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$11$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onExportDialogClose();
        return sn.z.f31622a;
    }

    public static final boolean PlayerScreenDialogs$lambda$12$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowRenameDialog();
    }

    public static final String PlayerScreenDialogs$lambda$13$0(PlayerState playerState) {
        ReadMeta readMeta;
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null && (readMeta = contentState.getReadMeta()) != null) {
            return readMeta.getTitle();
        }
        return null;
    }

    public static final sn.z PlayerScreenDialogs$lambda$14$0(ho.l lVar) {
        lVar.invoke(new j0(13));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$14$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onRenameDialogClose();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$15$0(ho.l lVar, String str) {
        str.getClass();
        lVar.invoke(new y1(str, 9));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$15$0$0(String str, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.rename(str);
        return sn.z.f31622a;
    }

    public static final boolean PlayerScreenDialogs$lambda$16$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowRatingDialog();
    }

    public static final String PlayerScreenDialogs$lambda$17$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getReadId();
    }

    public static final sn.z PlayerScreenDialogs$lambda$18$0(ho.l lVar, boolean z6) {
        lVar.invoke(new m(8));
        if (z6) {
            lVar.invoke(new m(9));
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$18$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onRatingDialogClose();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$18$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        PlayerViewModel.onShareClick$default(playerViewModel, null, 1, null);
        return sn.z.f31622a;
    }

    public static final boolean PlayerScreenDialogs$lambda$19$0(PlayerState playerState) {
        playerState.getClass();
        if (playerState.getShowShareOptionsSheet() && playerState.getShowShareButton()) {
            return true;
        }
        return false;
    }

    public static final int PlayerScreenDialogs$lambda$2$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getCurrentChapterIndex();
    }

    public static final ReadMeta PlayerScreenDialogs$lambda$20$0(PlayerState playerState) {
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null) {
            return contentState.getReadMeta();
        }
        return null;
    }

    public static final sn.z PlayerScreenDialogs$lambda$21$0(ho.l lVar) {
        lVar.invoke(new m(11));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$21$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onShareSheetClose();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$22$0(ho.l lVar) {
        lVar.invoke(new m(7));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$22$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onShareLinkClick();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$23$0(ho.l lVar) {
        lVar.invoke(new j0(14));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$23$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onShareCurrentClipClick();
        return sn.z.f31622a;
    }

    public static final boolean PlayerScreenDialogs$lambda$24$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowBookmarksDialog();
    }

    public static final String PlayerScreenDialogs$lambda$25$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getReadId();
    }

    public static final sn.z PlayerScreenDialogs$lambda$26$0(ho.l lVar) {
        lVar.invoke(new m(20));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$26$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onBookmarksClose();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$27$0(ho.l lVar, Bookmark bookmark) {
        bookmark.getClass();
        lVar.invoke(new i0(bookmark, 1));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$27$0$0(Bookmark bookmark, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.seekToBookmark(bookmark);
        return sn.z.f31622a;
    }

    public static final String PlayerScreenDialogs$lambda$28$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getClickedBookmarkId();
    }

    public static final sn.z PlayerScreenDialogs$lambda$29$0(ho.l lVar) {
        lVar.invoke(new m(12));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$29$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onBookmarkClose();
        return sn.z.f31622a;
    }

    public static final boolean PlayerScreenDialogs$lambda$3$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowTooLargeForOfflineToast();
    }

    public static final sn.z PlayerScreenDialogs$lambda$30$0(ho.l lVar, Bookmark bookmark) {
        bookmark.getClass();
        lVar.invoke(new i0(bookmark, 0));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$30$0$0(Bookmark bookmark, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.seekToBookmark(bookmark);
        playerViewModel.onBookmarkClose();
        return sn.z.f31622a;
    }

    public static final String PlayerScreenDialogs$lambda$31$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getRecentlyAddedBookmarkId();
    }

    public static final sn.z PlayerScreenDialogs$lambda$32$0(ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            i3.t e10 = ib.i.e(EchoTheme.INSTANCE, qVar, EchoTheme.$stable, r1.d.P(i3.q.f13017a, r1.u0.e(qVar).f29154l));
            String R = kj.c.R(qVar, R.string.bookmarking_saved_toast_title);
            String R2 = kj.c.R(qVar, R.string.bookmarking_saved_toast_subtitle);
            String R3 = kj.c.R(qVar, R.string.bookmarking_saved_toast_action);
            Integer valueOf = Integer.valueOf(io.elevenlabs.ui.R.drawable.pencil);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (f10 || L == eVar) {
                L = new l(lVar, 8);
                qVar.h0(L);
            }
            List H = ig.f.H(new EchoToastAction(R3, valueOf, (ho.a) L));
            boolean f11 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f11 || L2 == eVar) {
                L2 = new l(lVar, 9);
                qVar.h0(L2);
            }
            EchoToastKt.EchoToast(R2, e10, R, null, (ho.a) L2, H, qVar, EchoToastAction.$stable << 15, 8);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$32$0$0$0(ho.l lVar) {
        lVar.invoke(new j0(9));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$32$0$0$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.addNoteToRecentBookmark();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$32$0$1$0(ho.l lVar) {
        lVar.invoke(new j0(12));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$32$0$1$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onRecentlyAddedBookmarkToastClick();
        return sn.z.f31622a;
    }

    public static final String PlayerScreenDialogs$lambda$33$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getEditBookmarkId();
    }

    public static final sn.z PlayerScreenDialogs$lambda$34$0(ho.l lVar) {
        lVar.invoke(new j0(11));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$34$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onEditBookmarkClose();
        return sn.z.f31622a;
    }

    public static final String PlayerScreenDialogs$lambda$35$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getFullScreenImageSrc();
    }

    public static final Pronunciation PlayerScreenDialogs$lambda$36$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowPronunciationExistsDialog();
    }

    public static final PronunciationPreviewState PlayerScreenDialogs$lambda$37$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getPronunciationPreviewState();
    }

    public static final sn.z PlayerScreenDialogs$lambda$38$0(ho.l lVar) {
        lVar.invoke(new m(10));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$38$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onPronunciationExistsDialogDismiss();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$39$0(ho.l lVar, Pronunciation pronunciation, String str) {
        str.getClass();
        lVar.invoke(new d2(str, pronunciation, 6));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$39$0$0(String str, Pronunciation pronunciation, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.getAnalytics().log(Analytics.Event.PronunciationExistsDialogClickedEditOption.INSTANCE);
        playerViewModel.onPronunciationExistsDialogDismiss();
        playerViewModel.onNavigateToPronunciationEdit(str, pronunciation.getOriginalText(), pronunciation.getSpokenText());
        return sn.z.f31622a;
    }

    public static final String PlayerScreenDialogs$lambda$4$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getChapterDownloadErrorMessage();
    }

    public static final sn.z PlayerScreenDialogs$lambda$40$0(ho.l lVar, Pronunciation pronunciation) {
        lVar.invoke(new u1(pronunciation, 11));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$40$0$0(Pronunciation pronunciation, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onPlayPronunciationPreview(pronunciation.getSpokenText());
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$41(ir.z1 z1Var, ho.l lVar, int i10, u2.m mVar, int i11) {
        PlayerScreenDialogs(z1Var, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final boolean PlayerScreenDialogs$lambda$5$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowSpeedPickerDialog();
    }

    public static final Float PlayerScreenDialogs$lambda$6$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getPlayer().getPlaybackSpeed();
    }

    public static final boolean PlayerScreenDialogs$lambda$7$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowSleepTimerDialog();
    }

    public static final String PlayerScreenDialogs$lambda$8$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getReadId();
    }

    public static final sn.z PlayerScreenDialogs$lambda$9$0(ho.l lVar) {
        lVar.invoke(new m(13));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenDialogs$lambda$9$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onSleepTimerDialogClose();
        return sn.z.f31622a;
    }
}

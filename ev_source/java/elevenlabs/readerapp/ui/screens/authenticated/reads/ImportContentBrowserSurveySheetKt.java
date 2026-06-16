package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import androidx.lifecycle.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.room.SignalClient;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aI\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001ao\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042 \b\u0002\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onDismiss", "onShowSurvey", "Lkotlin/Function1;", "", "onNavigateToUrl", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportContentBrowserSurveyViewModel;", "vm", "ImportContentBrowserSurveySheet", "(Lho/a;Lho/a;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportContentBrowserSurveyViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportContentBrowserSurveyState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "ImportContentBrowserSurveySheetUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportContentBrowserSurveyState;Lho/a;Lho/a;Lho/l;Lho/l;Lu2/m;II)V", "Preview_ImportContentBrowserSurveySheet_WithTutorial", "(Lu2/m;I)V", "Preview_ImportContentBrowserSurveySheet_WithoutTutorial", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ImportContentBrowserSurveySheetKt {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if ((r24 & 8) != 0) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ImportContentBrowserSurveySheet(ho.a aVar, ho.a aVar2, ho.l lVar, ImportContentBrowserSurveyViewModel importContentBrowserSurveyViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ImportContentBrowserSurveyViewModel importContentBrowserSurveyViewModel2;
        boolean z6;
        ImportContentBrowserSurveyViewModel importContentBrowserSurveyViewModel3;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1389026765);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                importContentBrowserSurveyViewModel2 = importContentBrowserSurveyViewModel;
                if (qVar.h(importContentBrowserSurveyViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                importContentBrowserSurveyViewModel2 = importContentBrowserSurveyViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            importContentBrowserSurveyViewModel2 = importContentBrowserSurveyViewModel;
        }
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 8) != 0) {
                    r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        importContentBrowserSurveyViewModel2 = (ImportContentBrowserSurveyViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(ImportContentBrowserSurveyViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                ImportContentBrowserSurveyViewModel importContentBrowserSurveyViewModel4 = importContentBrowserSurveyViewModel2;
                qVar.q();
                BottomSheetScaffoldKt.m1898BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, aVar, "", (ho.r) c3.k.d(1112644607, true, new io.elevenlabs.readerapp.ui.screens.authenticated.t0((ImportContentBrowserSurveyState) u2.r.o(importContentBrowserSurveyViewModel4.getStateFlow(), qVar, 0).getValue(), aVar, aVar2, lVar, importContentBrowserSurveyViewModel4), qVar), (u2.m) qVar, ((i12 << 12) & 57344) | 1769472, 15);
                qVar = qVar;
                importContentBrowserSurveyViewModel3 = importContentBrowserSurveyViewModel4;
            }
        } else {
            qVar.R();
            importContentBrowserSurveyViewModel3 = importContentBrowserSurveyViewModel2;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l(aVar, aVar2, lVar, (MviViewModel) importContentBrowserSurveyViewModel3, i10, i11, 27);
        }
    }

    public static final sn.z ImportContentBrowserSurveySheet$lambda$0(ImportContentBrowserSurveyState importContentBrowserSurveyState, ho.a aVar, ho.a aVar2, ho.l lVar, ImportContentBrowserSurveyViewModel importContentBrowserSurveyViewModel, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(importContentBrowserSurveyViewModel);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new u(importContentBrowserSurveyViewModel, 0);
            qVar.h0(L);
        }
        ImportContentBrowserSurveySheetUI(importContentBrowserSurveyState, aVar, aVar2, lVar, (ho.l) L, qVar, 0, 0);
        return sn.z.f31622a;
    }

    public static final sn.z ImportContentBrowserSurveySheet$lambda$0$0$0(ImportContentBrowserSurveyViewModel importContentBrowserSurveyViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(importContentBrowserSurveyViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z ImportContentBrowserSurveySheet$lambda$1(ho.a aVar, ho.a aVar2, ho.l lVar, ImportContentBrowserSurveyViewModel importContentBrowserSurveyViewModel, int i10, int i11, u2.m mVar, int i12) {
        ImportContentBrowserSurveySheet(aVar, aVar2, lVar, importContentBrowserSurveyViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01fb, code lost:
    
        if (r14 == r10) goto L254;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ImportContentBrowserSurveySheetUI(ImportContentBrowserSurveyState importContentBrowserSurveyState, ho.a aVar, ho.a aVar2, ho.l lVar, ho.l lVar2, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        ho.a aVar3;
        int i15;
        int i16;
        ho.l lVar3;
        int i17;
        int i18;
        ho.l lVar4;
        int i19;
        boolean z6;
        ho.a aVar4;
        u2.q qVar;
        ho.l lVar5;
        ho.a aVar5;
        ho.l lVar6;
        u2.r1 r10;
        ho.a aVar6;
        ho.a aVar7;
        ho.l lVar7;
        boolean z10;
        boolean z11;
        boolean z12;
        u2.e eVar;
        u2.q qVar2;
        ho.l lVar8;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object dVar;
        int i20;
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-1077171653);
        if ((i10 & 6) == 0) {
            if (qVar3.f(importContentBrowserSurveyState)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar3.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                aVar3 = aVar2;
                if (qVar3.h(aVar3)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    lVar3 = lVar;
                    if (qVar3.h(lVar3)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 16;
                    if (i18 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        lVar4 = lVar2;
                        if (qVar3.h(lVar4)) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i19;
                        if ((i12 & 9363) != 9362) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar3.O(i12 & 1, z6)) {
                            u2.e eVar2 = u2.l.f33918a;
                            if (i21 != 0) {
                                Object L = qVar3.L();
                                if (L == eVar2) {
                                    L = new c(2);
                                    qVar3.h0(L);
                                }
                                aVar6 = (ho.a) L;
                            } else {
                                aVar6 = aVar;
                            }
                            if (i14 != 0) {
                                Object L2 = qVar3.L();
                                if (L2 == eVar2) {
                                    L2 = new c(3);
                                    qVar3.h0(L2);
                                }
                                aVar7 = (ho.a) L2;
                            } else {
                                aVar7 = aVar3;
                            }
                            if (i16 != 0) {
                                Object L3 = qVar3.L();
                                if (L3 == eVar2) {
                                    L3 = new j(16);
                                    qVar3.h0(L3);
                                }
                                lVar7 = (ho.l) L3;
                            } else {
                                lVar7 = lVar3;
                            }
                            if (i18 != 0) {
                                Object L4 = qVar3.L();
                                if (L4 == eVar2) {
                                    L4 = new j(17);
                                    qVar3.h0(L4);
                                }
                                lVar4 = (ho.l) L4;
                            }
                            i3.q qVar4 = i3.q.f13017a;
                            i3.t y10 = l1.n.y(p2.e(qVar4, 1.0f), l1.n.x(qVar3), true, true);
                            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                            int i22 = ElevenLabsTheme.$stable;
                            i3.t G = r1.d.G(y10, elevenLabsTheme.getSpacings(qVar3, i22).m2357getX5D9Ej5fM(), t2.u.P, 2);
                            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar3, 0);
                            int hashCode = Long.hashCode(qVar3.T);
                            c3.o l4 = qVar3.l();
                            i3.t c5 = i3.a.c(G, qVar3);
                            h4.h.f11920i.getClass();
                            h4.f fVar = h4.g.f11903b;
                            qVar3.b0();
                            if (qVar3.S) {
                                qVar3.k(fVar);
                            } else {
                                qVar3.k0();
                            }
                            u2.r.J(h4.g.f11907f, a10, qVar3);
                            u2.r.J(h4.g.f11906e, l4, qVar3);
                            u2.r.y(qVar3, Integer.valueOf(hashCode), h4.g.f11908g);
                            u2.r.F(h4.g.f11909h, qVar3);
                            u2.r.J(h4.g.f11905d, c5, qVar3);
                            ho.a aVar8 = aVar7;
                            ho.l lVar9 = lVar4;
                            j7.d(kj.c.R(qVar3, R.string.import_content_from_chrome_sheet_title), null, defpackage.f.b(elevenLabsTheme, qVar3, i22), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i22).getTitleLarge700Inter(), qVar3, 0, 0, 131066);
                            r1.d.g(p2.f(qVar4, elevenLabsTheme.getSpacings(qVar3, i22).m2360getX8D9Ej5fM()), qVar3);
                            String R = kj.c.R(qVar3, R.string.import_content_from_chrome_sheet_i_know);
                            int i23 = 57344 & i12;
                            if (i23 == 16384) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int i24 = i12 & 896;
                            if (i24 == 256) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean z18 = z10 | z11;
                            int i25 = i12 & 112;
                            if (i25 == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            boolean z19 = z18 | z12;
                            Object L5 = qVar3.L();
                            if (!z19) {
                                eVar = eVar2;
                            } else {
                                eVar = eVar2;
                            }
                            L5 = new c3.b(lVar9, aVar6, aVar8, 25);
                            qVar3.h0(L5);
                            u2.e eVar3 = eVar;
                            ho.a aVar9 = aVar6;
                            ButtonKt.Button(R, (ho.a) L5, p2.e(qVar4, 1.0f), null, null, null, null, false, false, false, qVar3, 384, 1016);
                            String importTutorialUrl = importContentBrowserSurveyState.getImportTutorialUrl();
                            if (importTutorialUrl == null || importTutorialUrl.length() == 0) {
                                qVar2 = qVar3;
                                aVar5 = aVar8;
                                lVar8 = lVar7;
                                qVar2.X(1369579505);
                                qVar2.p(false);
                            } else {
                                qVar3.X(1369085551);
                                r1.d.g(p2.f(qVar4, elevenLabsTheme.getSpacings(qVar3, i22).m2353getX2D9Ej5fM()), qVar3);
                                String R2 = kj.c.R(qVar3, R.string.import_content_from_chrome_sheet_show_me);
                                ButtonVariant buttonVariant = ButtonVariant.Secondary;
                                i3.t e10 = p2.e(qVar4, 1.0f);
                                if (i23 == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (i24 == 256) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                boolean z20 = z14 | z13;
                                if ((i12 & 7168) == 2048) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                boolean z21 = z20 | z15;
                                if ((i12 & 14) == 4) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                boolean z22 = z21 | z16;
                                if (i25 == 32) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                boolean z23 = z22 | z17;
                                Object L6 = qVar3.L();
                                if (!z23 && L6 != eVar3) {
                                    dVar = L6;
                                    aVar5 = aVar8;
                                    lVar8 = lVar7;
                                } else {
                                    ho.l lVar10 = lVar7;
                                    dVar = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.d(lVar9, lVar10, importContentBrowserSurveyState, aVar9, aVar8, 3);
                                    lVar8 = lVar10;
                                    aVar5 = aVar8;
                                    qVar3.h0(dVar);
                                }
                                ButtonKt.Button(R2, (ho.a) dVar, e10, null, buttonVariant, null, null, false, false, false, qVar3, 24960, SignalClient.CLOSE_REASON_NORMAL_CLOSURE);
                                qVar2 = qVar3;
                                qVar2.p(false);
                            }
                            r1.d.g(p2.f(qVar4, elevenLabsTheme.getSpacings(qVar2, i22).m2358getX6D9Ej5fM()), qVar2);
                            qVar2.p(true);
                            qVar = qVar2;
                            aVar4 = aVar9;
                            lVar5 = lVar9;
                            lVar6 = lVar8;
                        } else {
                            qVar3.R();
                            aVar4 = aVar;
                            qVar = qVar3;
                            lVar5 = lVar4;
                            aVar5 = aVar3;
                            lVar6 = lVar3;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(importContentBrowserSurveyState, aVar4, aVar5, lVar6, lVar5, i10, i11, 10);
                            return;
                        }
                        return;
                    }
                    lVar4 = lVar2;
                    if ((i12 & 9363) != 9362) {
                    }
                    if (qVar3.O(i12 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                lVar3 = lVar;
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                lVar4 = lVar2;
                if ((i12 & 9363) != 9362) {
                }
                if (qVar3.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            aVar3 = aVar2;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            lVar3 = lVar;
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            lVar4 = lVar2;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar3.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        aVar3 = aVar2;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        lVar3 = lVar;
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        lVar4 = lVar2;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar3.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ImportContentBrowserSurveySheetUI$lambda$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z ImportContentBrowserSurveySheetUI$lambda$3$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z ImportContentBrowserSurveySheetUI$lambda$4$0$0(ho.l lVar, ho.a aVar, ho.a aVar2) {
        lVar.invoke(new v(1, aVar2));
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ImportContentBrowserSurveySheetUI$lambda$4$0$0$0(ho.a aVar, ImportContentBrowserSurveyViewModel importContentBrowserSurveyViewModel) {
        importContentBrowserSurveyViewModel.getClass();
        importContentBrowserSurveyViewModel.onIKnowClick(aVar);
        return sn.z.f31622a;
    }

    public static final sn.z ImportContentBrowserSurveySheetUI$lambda$4$1$0(ho.l lVar, ho.l lVar2, ImportContentBrowserSurveyState importContentBrowserSurveyState, ho.a aVar, ho.a aVar2) {
        lVar.invoke(new v(0, aVar2));
        lVar2.invoke(importContentBrowserSurveyState.getImportTutorialUrl());
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ImportContentBrowserSurveySheetUI$lambda$4$1$0$0(ho.a aVar, ImportContentBrowserSurveyViewModel importContentBrowserSurveyViewModel) {
        importContentBrowserSurveyViewModel.getClass();
        importContentBrowserSurveyViewModel.onShowMeClick(aVar);
        return sn.z.f31622a;
    }

    public static final sn.z ImportContentBrowserSurveySheetUI$lambda$5(ImportContentBrowserSurveyState importContentBrowserSurveyState, ho.a aVar, ho.a aVar2, ho.l lVar, ho.l lVar2, int i10, int i11, u2.m mVar, int i12) {
        ImportContentBrowserSurveySheetUI(importContentBrowserSurveyState, aVar, aVar2, lVar, lVar2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ImportContentBrowserSurveySheet_WithTutorial(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1982609624);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ImportContentBrowserSurveySheetUI(new ImportContentBrowserSurveyState("https://example.com"), null, null, null, null, qVar, 0, 30);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 17);
        }
    }

    public static final sn.z Preview_ImportContentBrowserSurveySheet_WithTutorial$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ImportContentBrowserSurveySheet_WithTutorial(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ImportContentBrowserSurveySheet_WithoutTutorial(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1567950228);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ImportContentBrowserSurveySheetUI(new ImportContentBrowserSurveyState(null), null, null, null, null, qVar, 0, 30);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 18);
        }
    }

    public static final sn.z Preview_ImportContentBrowserSurveySheet_WithoutTutorial$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ImportContentBrowserSurveySheet_WithoutTutorial(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

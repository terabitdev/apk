package io.elevenlabs.readerapp.ui.screens.authenticated.report;

import androidx.lifecycle.o;
import c3.k;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import h4.g;
import ho.l;
import ho.p;
import i3.t;
import ig.f;
import io.elevenlabs.domain.model.Link;
import io.elevenlabs.domain.model.ReportLinks;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.h;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.u;
import io.elevenlabs.ui.components.BottomSheetListKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import r1.j;
import r1.p2;
import r1.w;
import r1.x;
import r1.y;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001aE\u0010\t\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aO\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2 \b\u0002\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"", "readId", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "Lkotlin/Function1;", "onNavigateToLink", "Lio/elevenlabs/readerapp/ui/screens/authenticated/report/ReportProblemViewModel;", "vm", "ReportProblemBottomSheet", "(Ljava/lang/String;Lho/a;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/report/ReportProblemViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/report/ReportProblemState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "onReportProblemClick", "ReportProblemBottomSheetUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/report/ReportProblemState;Lho/l;Lho/l;Lu2/m;II)V", "Preview_ReportProblemBottomSheet_loading", "(Lu2/m;I)V", "Preview_ReportProblemBottomSheet_error", "Preview_ReportProblemBottomSheet_loaded", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReportProblemBottomSheetKt {
    public static final void Preview_ReportProblemBottomSheet_error(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1225919525);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReportProblemBottomSheetUI(new ReportProblemState(null, null, false, "Some error", 3, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 17);
        }
    }

    public static final z Preview_ReportProblemBottomSheet_error$lambda$0(int i10, m mVar, int i11) {
        Preview_ReportProblemBottomSheet_error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ReportProblemBottomSheet_loaded(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1198137276);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReportProblemBottomSheetUI(new ReportProblemState(null, new ReportLinks(f.I(new Link("Link1", "https://test", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FIcons%2Fflag-2%2C%20priority.webp?alt=media&token=9e9a04ec-e6b1-43e2-90e9-9658162c3e6a"), new Link("Link1", "https://test", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FIcons%2Fflag-2%2C%20priority.webp?alt=media&token=9e9a04ec-e6b1-43e2-90e9-9658162c3e6a"), new Link("Link1", "https://test", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FIcons%2Fflag-2%2C%20priority.webp?alt=media&token=9e9a04ec-e6b1-43e2-90e9-9658162c3e6a"))), false, null, 9, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 16);
        }
    }

    public static final z Preview_ReportProblemBottomSheet_loaded$lambda$0(int i10, m mVar, int i11) {
        Preview_ReportProblemBottomSheet_loaded(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ReportProblemBottomSheet_loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1963984921);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReportProblemBottomSheetUI(new ReportProblemState(null, null, true, null, 11, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 15);
        }
    }

    public static final z Preview_ReportProblemBottomSheet_loading$lambda$0(int i10, m mVar, int i11) {
        Preview_ReportProblemBottomSheet_loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if ((r24 & 8) != 0) goto L127;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReportProblemBottomSheet(String str, ho.a aVar, l lVar, ReportProblemViewModel reportProblemViewModel, m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        ReportProblemViewModel reportProblemViewModel2;
        boolean z6;
        ReportProblemViewModel reportProblemViewModel3;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(1283198932);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        } else {
            aVar2 = aVar;
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
                reportProblemViewModel2 = reportProblemViewModel;
                if (qVar.h(reportProblemViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                reportProblemViewModel2 = reportProblemViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            reportProblemViewModel2 = reportProblemViewModel;
        }
        boolean z10 = false;
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
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof o) {
                            cVar = ((o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        reportProblemViewModel2 = (ReportProblemViewModel) gg.b.j0(e0.f20562a.b(ReportProblemViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                ReportProblemViewModel reportProblemViewModel4 = reportProblemViewModel2;
                int i17 = i12;
                qVar.q();
                ReportProblemState reportProblemState = (ReportProblemState) r.o(reportProblemViewModel4.getStateFlow(), qVar, 0).getValue();
                boolean h10 = qVar.h(reportProblemViewModel4);
                if ((i17 & 14) == 4) {
                    z10 = true;
                }
                boolean z11 = h10 | z10;
                Object L = qVar.L();
                if (z11 || L == u2.l.f33918a) {
                    L = new ReportProblemBottomSheetKt$ReportProblemBottomSheet$1$1(reportProblemViewModel4, str, null);
                    qVar.h0(L);
                }
                r.f((p) L, str, qVar);
                BottomSheetScaffoldKt.m1898BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, aVar2, kj.c.R(qVar, R.string.report_issue_sheet_title), (ho.r) k.d(550569058, true, new h(reportProblemState, reportProblemViewModel4, lVar, 14), qVar), (m) qVar, ((i17 << 9) & 57344) | 1572864, 15);
                qVar = qVar;
                reportProblemViewModel3 = reportProblemViewModel4;
            }
        } else {
            qVar.R();
            reportProblemViewModel3 = reportProblemViewModel2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) str, (Object) aVar, lVar, (Object) reportProblemViewModel3, i10, i11, 29);
        }
    }

    public static final z ReportProblemBottomSheet$lambda$1(ReportProblemState reportProblemState, ReportProblemViewModel reportProblemViewModel, l lVar, y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        q qVar = (q) mVar;
        boolean h10 = qVar.h(reportProblemViewModel);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new c(reportProblemViewModel, 0);
            qVar.h0(L);
        }
        l lVar2 = (l) L;
        boolean f10 = qVar.f(lVar) | qVar.h(bottomSheetControl);
        Object L2 = qVar.L();
        if (f10 || L2 == eVar) {
            L2 = new e(lVar, bottomSheetControl, 1);
            qVar.h0(L2);
        }
        ReportProblemBottomSheetUI(reportProblemState, lVar2, (l) L2, qVar, 0, 0);
        return z.f31622a;
    }

    public static final z ReportProblemBottomSheet$lambda$1$0$0(ReportProblemViewModel reportProblemViewModel, l lVar) {
        lVar.getClass();
        lVar.invoke(reportProblemViewModel);
        return z.f31622a;
    }

    public static final z ReportProblemBottomSheet$lambda$1$1$0(l lVar, BottomSheetControl bottomSheetControl, String str) {
        str.getClass();
        lVar.invoke(str);
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z ReportProblemBottomSheet$lambda$2(String str, ho.a aVar, l lVar, ReportProblemViewModel reportProblemViewModel, int i10, int i11, m mVar, int i12) {
        ReportProblemBottomSheet(str, aVar, lVar, reportProblemViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ReportProblemBottomSheetUI(ReportProblemState reportProblemState, l lVar, l lVar2, m mVar, int i10, int i11) {
        int i12;
        l lVar3;
        int i13;
        int i14;
        l lVar4;
        int i15;
        boolean z6;
        final l lVar5;
        final l lVar6;
        r1 r10;
        List<Link> list;
        boolean z10;
        int i16;
        q qVar = (q) mVar;
        qVar.Z(923824263);
        if ((i10 & 6) == 0) {
            if (qVar.h(reportProblemState)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            lVar3 = lVar;
            if (qVar.h(lVar3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                lVar4 = lVar2;
                if (qVar.h(lVar4)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    u2.e eVar = u2.l.f33918a;
                    if (i17 != 0) {
                        Object L = qVar.L();
                        if (L == eVar) {
                            L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(7);
                            qVar.h0(L);
                        }
                        lVar5 = (l) L;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar.L();
                        if (L2 == eVar) {
                            L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(6);
                            qVar.h0(L2);
                        }
                        lVar6 = (l) L2;
                    } else {
                        lVar6 = lVar4;
                    }
                    t e10 = p2.e(i3.q.f13017a, 1.0f);
                    x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    t c5 = i3.a.c(e10, qVar);
                    h4.h.f11920i.getClass();
                    h4.f fVar = g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    r.J(g.f11907f, a10, qVar);
                    r.J(g.f11906e, l4, qVar);
                    r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                    r.F(g.f11909h, qVar);
                    r.J(g.f11905d, c5, qVar);
                    if (!n.m0(reportProblemState.getError())) {
                        qVar.X(308031285);
                        ErrorScreenKt.m1836ErrorScreenV9fs2A(null, null, reportProblemState.getError(), k.d(2140300510, true, new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.report.a
                            @Override // ho.p
                            public final Object invoke(Object obj, Object obj2) {
                                z ReportProblemBottomSheetUI$lambda$2$0;
                                int intValue = ((Integer) obj2).intValue();
                                ReportProblemBottomSheetUI$lambda$2$0 = ReportProblemBottomSheetKt.ReportProblemBottomSheetUI$lambda$2$0(l.this, (m) obj, intValue);
                                return ReportProblemBottomSheetUI$lambda$2$0;
                            }
                        }, qVar), null, 0L, qVar, 3072, 51);
                        qVar.p(false);
                    } else if (reportProblemState.isLoading()) {
                        qVar.X(308351298);
                        LoaderKt.LoaderRow(qVar, 0);
                        qVar.p(false);
                    } else {
                        qVar.X(308422257);
                        ReportLinks reportLinks = reportProblemState.getReportLinks();
                        if (reportLinks != null) {
                            list = reportLinks.getLinks();
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            qVar.X(308422256);
                            qVar.p(false);
                        } else {
                            qVar.X(308422257);
                            for (final Link link : list) {
                                String title = link.getTitle();
                                String iconUrl = link.getIconUrl();
                                if ((i12 & 896) == 256) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                boolean h10 = z10 | qVar.h(link);
                                Object L3 = qVar.L();
                                if (h10 || L3 == eVar) {
                                    L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.report.b
                                        @Override // ho.a
                                        public final Object invoke() {
                                            z ReportProblemBottomSheetUI$lambda$2$1$0$0;
                                            ReportProblemBottomSheetUI$lambda$2$1$0$0 = ReportProblemBottomSheetKt.ReportProblemBottomSheetUI$lambda$2$1$0$0(l.this, link);
                                            return ReportProblemBottomSheetUI$lambda$2$1$0$0;
                                        }
                                    };
                                    qVar.h0(L3);
                                }
                                BottomSheetListKt.BottomSheetList(title, iconUrl, (ho.a) L3, qVar, 0);
                            }
                            qVar.p(false);
                        }
                        qVar.p(false);
                    }
                    qVar.p(true);
                } else {
                    qVar.R();
                    lVar5 = lVar3;
                    lVar6 = lVar4;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(reportProblemState, lVar5, lVar6, i10, i11, 25);
                    return;
                }
                return;
            }
            lVar4 = lVar2;
            if ((i12 & 147) != 146) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        lVar3 = lVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        lVar4 = lVar2;
        if ((i12 & 147) != 146) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z ReportProblemBottomSheetUI$lambda$0$0(l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z ReportProblemBottomSheetUI$lambda$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z ReportProblemBottomSheetUI$lambda$2$0(final l lVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.common_retry);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.report.d
                    @Override // ho.a
                    public final Object invoke() {
                        z ReportProblemBottomSheetUI$lambda$2$0$0$0;
                        ReportProblemBottomSheetUI$lambda$2$0$0$0 = ReportProblemBottomSheetKt.ReportProblemBottomSheetUI$lambda$2$0$0$0(l.this);
                        return ReportProblemBottomSheetUI$lambda$2$0$0$0;
                    }
                };
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, p2.e(i3.q.f13017a, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ReportProblemBottomSheetUI$lambda$2$0$0$0(l lVar) {
        lVar.invoke(new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(5));
        return z.f31622a;
    }

    public static final z ReportProblemBottomSheetUI$lambda$2$0$0$0$0(ReportProblemViewModel reportProblemViewModel) {
        reportProblemViewModel.getClass();
        reportProblemViewModel.retry();
        return z.f31622a;
    }

    public static final z ReportProblemBottomSheetUI$lambda$2$1$0$0(l lVar, Link link) {
        lVar.invoke(link.getUrl());
        return z.f31622a;
    }

    public static final z ReportProblemBottomSheetUI$lambda$3(ReportProblemState reportProblemState, l lVar, l lVar2, int i10, int i11, m mVar, int i12) {
        ReportProblemBottomSheetUI(reportProblemState, lVar, lVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}

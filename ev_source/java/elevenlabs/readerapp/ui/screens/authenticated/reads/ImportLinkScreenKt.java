package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import a2.k3;
import a2.o2;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.domain.model.LimitReachedData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.k5;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.z1;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\u000e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aS\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001e\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u001e\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u000f\u0010\u001d\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u000f\u0010\u001e\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001e\u0010\u001b¨\u0006\"²\u0006\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClose", "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/ReadMeta;", "onNavigateToRead", "", "initialLink", "", "isPodcastMode", "Lio/elevenlabs/domain/model/LimitReachedData;", "onNavigateToAddPodcastLimitReached", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportLinkViewModel;", "vm", "ImportLinkScreen", "(Lho/a;Lho/l;Ljava/lang/String;ZLho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportLinkViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportLinkState;", RemoteConfigConstants.ResponseFieldKey.STATE, "webView", "action", "onGoBack", "ImportLinkScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportLinkState;Lho/p;Lho/l;Lho/a;Lu2/m;I)V", "initialUrl", "WebViewContent", "(Ljava/lang/String;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportLinkState;Lho/l;Lu2/m;I)V", "Preview_ImportLinkScreen_Idle", "(Lu2/m;I)V", "Preview_ImportLinkScreen_Loading", "Preview_ImportLinkScreen_Loaded", "Preview_ImportLinkScreen_Error", "Landroid/webkit/WebView;", "canGoBack", "canGoForward", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ImportLinkScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ImportLinkScreen(ho.a aVar, ho.l lVar, String str, boolean z6, ho.l lVar2, ImportLinkViewModel importLinkViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        int i13;
        ImportLinkViewModel importLinkViewModel2;
        boolean z10;
        u2.q qVar;
        ho.l lVar4;
        ImportLinkViewModel importLinkViewModel3;
        r1 r10;
        q7.c cVar;
        u2.e eVar;
        u2.q qVar2;
        int i14;
        ImportLinkViewModel importLinkViewModel4;
        boolean z11;
        boolean z12;
        Object L;
        boolean z13;
        boolean h10;
        Object L2;
        boolean z14;
        boolean z15;
        Object L3;
        boolean h11;
        Object L4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        aVar.getClass();
        lVar.getClass();
        str.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-1714107438);
        if ((i10 & 6) == 0) {
            if (qVar3.h(aVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(lVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.f(str)) {
                i17 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.g(z6)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i16;
        }
        int i20 = i11 & 16;
        if (i20 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            lVar3 = lVar2;
            if (qVar3.h(lVar3)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            if ((196608 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    importLinkViewModel2 = importLinkViewModel;
                    if (qVar3.h(importLinkViewModel2)) {
                        i15 = 131072;
                        i12 |= i15;
                    }
                } else {
                    importLinkViewModel2 = importLinkViewModel;
                }
                i15 = 65536;
                i12 |= i15;
            } else {
                importLinkViewModel2 = importLinkViewModel;
            }
            if ((74899 & i12) == 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar3.O(i12 & 1, z10)) {
                qVar3.T();
                int i21 = i10 & 1;
                u2.e eVar2 = u2.l.f33918a;
                if (i21 != 0 && !qVar3.y()) {
                    qVar3.R();
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    lVar4 = lVar3;
                } else {
                    if (i20 != 0) {
                        Object L5 = qVar3.L();
                        if (L5 == eVar2) {
                            L5 = new e0(2);
                            qVar3.h0(L5);
                        }
                        lVar4 = (ho.l) L5;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 32) != 0) {
                        androidx.lifecycle.r1 a10 = r7.a.a(qVar3);
                        if (a10 != null) {
                            pl.f o6 = tb.a.o(a10, qVar3);
                            if (a10 instanceof androidx.lifecycle.o) {
                                cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                            } else {
                                cVar = q7.a.f28123b;
                            }
                            eVar = eVar2;
                            qVar2 = qVar3;
                            i14 = i12 & (-458753);
                            importLinkViewModel4 = (ImportLinkViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(ImportLinkViewModel.class), a10, null, o6, cVar, qVar2);
                            qVar2.q();
                            ImportLinkState importLinkState = (ImportLinkState) u2.r.o(importLinkViewModel4.getStateFlow(), qVar2, 0).getValue();
                            ReadMeta navigateToRead = importLinkState.getNavigateToRead();
                            boolean h12 = qVar2.h(importLinkState);
                            if ((i14 & 112) != 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11 | h12;
                            L = qVar2.L();
                            if (!z12 || L == eVar) {
                                L = new ImportLinkScreenKt$ImportLinkScreen$2$1(importLinkState, lVar, null);
                                qVar2.h0(L);
                            }
                            u2.r.f((ho.p) L, navigateToRead, qVar2);
                            LimitReachedData navigateToAddPodcastLimitReached = importLinkState.getNavigateToAddPodcastLimitReached();
                            boolean h13 = qVar2.h(importLinkState);
                            if ((57344 & i14) != 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            h10 = h13 | z13 | qVar2.h(importLinkViewModel4);
                            L2 = qVar2.L();
                            if (!h10 || L2 == eVar) {
                                L2 = new ImportLinkScreenKt$ImportLinkScreen$3$1(importLinkState, lVar4, importLinkViewModel4, null);
                                qVar2.h0(L2);
                            }
                            u2.r.f((ho.p) L2, navigateToAddPodcastLimitReached, qVar2);
                            Boolean valueOf = Boolean.valueOf(z6);
                            boolean h14 = qVar2.h(importLinkViewModel4);
                            if ((i14 & 7168) != 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = h14 | z14;
                            L3 = qVar2.L();
                            if (!z15 || L3 == eVar) {
                                L3 = new ImportLinkScreenKt$ImportLinkScreen$4$1(importLinkViewModel4, z6, null);
                                qVar2.h0(L3);
                            }
                            u2.r.f((ho.p) L3, valueOf, qVar2);
                            c3.j d10 = c3.k.d(724258885, true, new a2.q0(importLinkState, str, importLinkViewModel4, 8), qVar2);
                            h11 = qVar2.h(importLinkViewModel4);
                            L4 = qVar2.L();
                            if (!h11 || L4 == eVar) {
                                L4 = new d0(importLinkViewModel4, 1);
                                qVar2.h0(L4);
                            }
                            u2.q qVar4 = qVar2;
                            ImportLinkScreenUI(importLinkState, d10, (ho.l) L4, aVar, qVar4, ((i14 << 9) & 7168) | 48);
                            qVar = qVar4;
                            importLinkViewModel3 = importLinkViewModel4;
                        } else {
                            c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                    }
                }
                eVar = eVar2;
                qVar2 = qVar3;
                i14 = i12;
                importLinkViewModel4 = importLinkViewModel2;
                qVar2.q();
                ImportLinkState importLinkState2 = (ImportLinkState) u2.r.o(importLinkViewModel4.getStateFlow(), qVar2, 0).getValue();
                ReadMeta navigateToRead2 = importLinkState2.getNavigateToRead();
                boolean h122 = qVar2.h(importLinkState2);
                if ((i14 & 112) != 32) {
                }
                z12 = z11 | h122;
                L = qVar2.L();
                if (!z12) {
                }
                L = new ImportLinkScreenKt$ImportLinkScreen$2$1(importLinkState2, lVar, null);
                qVar2.h0(L);
                u2.r.f((ho.p) L, navigateToRead2, qVar2);
                LimitReachedData navigateToAddPodcastLimitReached2 = importLinkState2.getNavigateToAddPodcastLimitReached();
                boolean h132 = qVar2.h(importLinkState2);
                if ((57344 & i14) != 16384) {
                }
                h10 = h132 | z13 | qVar2.h(importLinkViewModel4);
                L2 = qVar2.L();
                if (!h10) {
                }
                L2 = new ImportLinkScreenKt$ImportLinkScreen$3$1(importLinkState2, lVar4, importLinkViewModel4, null);
                qVar2.h0(L2);
                u2.r.f((ho.p) L2, navigateToAddPodcastLimitReached2, qVar2);
                Boolean valueOf2 = Boolean.valueOf(z6);
                boolean h142 = qVar2.h(importLinkViewModel4);
                if ((i14 & 7168) != 2048) {
                }
                z15 = h142 | z14;
                L3 = qVar2.L();
                if (!z15) {
                }
                L3 = new ImportLinkScreenKt$ImportLinkScreen$4$1(importLinkViewModel4, z6, null);
                qVar2.h0(L3);
                u2.r.f((ho.p) L3, valueOf2, qVar2);
                c3.j d102 = c3.k.d(724258885, true, new a2.q0(importLinkState2, str, importLinkViewModel4, 8), qVar2);
                h11 = qVar2.h(importLinkViewModel4);
                L4 = qVar2.L();
                if (!h11) {
                }
                L4 = new d0(importLinkViewModel4, 1);
                qVar2.h0(L4);
                u2.q qVar42 = qVar2;
                ImportLinkScreenUI(importLinkState2, d102, (ho.l) L4, aVar, qVar42, ((i14 << 9) & 7168) | 48);
                qVar = qVar42;
                importLinkViewModel3 = importLinkViewModel4;
            } else {
                qVar = qVar3;
                qVar.R();
                lVar4 = lVar3;
                importLinkViewModel3 = importLinkViewModel2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.ocr.o(aVar, lVar, str, z6, lVar4, importLinkViewModel3, i10, i11, 5);
                return;
            }
            return;
        }
        lVar3 = lVar2;
        if ((196608 & i10) != 0) {
        }
        if ((74899 & i12) == 74898) {
        }
        if (!qVar3.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ImportLinkScreen$lambda$0$0(LimitReachedData limitReachedData) {
        limitReachedData.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreen$lambda$4(ImportLinkState importLinkState, String str, ImportLinkViewModel importLinkViewModel, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String url = importLinkState.getUrl();
            if (url != null) {
                str = url;
            }
            boolean h10 = qVar.h(importLinkViewModel);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new d0(importLinkViewModel, 0);
                qVar.h0(L);
            }
            WebViewContent(str, importLinkState, (ho.l) L, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreen$lambda$4$0$0(ImportLinkViewModel importLinkViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(importLinkViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreen$lambda$5$0(ImportLinkViewModel importLinkViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(importLinkViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreen$lambda$6(ho.a aVar, ho.l lVar, String str, boolean z6, ho.l lVar2, ImportLinkViewModel importLinkViewModel, int i10, int i11, u2.m mVar, int i12) {
        ImportLinkScreen(aVar, lVar, str, z6, lVar2, importLinkViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void ImportLinkScreenUI(ImportLinkState importLinkState, ho.p pVar, ho.l lVar, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        importLinkState.getClass();
        pVar.getClass();
        lVar.getClass();
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1537289484);
        if ((i10 & 6) == 0) {
            if (qVar2.h(importLinkState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(pVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            qVar = qVar2;
            k5.a(null, c3.k.d(-517353776, true, new a2.q0(aVar, lVar, importLinkState, 7), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(1751268699, true, new fm.o(importLinkState, pVar, lVar, 26), qVar2), qVar, 805306416, 509);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.d(importLinkState, pVar, lVar, aVar, i10, 8);
        }
    }

    public static final sn.z ImportLinkScreenUI$lambda$0(ho.a aVar, ho.l lVar, ImportLinkState importLinkState, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((i3.t) null, kj.c.R(qVar, R.string.import_link_title), c3.k.d(-1639608917, true, new b(2, aVar), qVar), c3.k.d(-738540982, true, new e(lVar, importLinkState), qVar), (i3.f) null, qVar, 3456, 17);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreenUI$lambda$0$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonKt.BackButton(aVar, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreenUI$lambda$0$1(ho.l lVar, ImportLinkState importLinkState, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.write_listen);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new a(lVar, 5);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, null, ButtonSize.Small, null, Integer.valueOf(io.elevenlabs.ui.R.drawable.listen), null, importLinkState.isLoading(), false, false, qVar, 3072, 852);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreenUI$lambda$0$1$0$0(ho.l lVar) {
        lVar.invoke(new e0(0));
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreenUI$lambda$0$1$0$0$0(ImportLinkViewModel importLinkViewModel) {
        importLinkViewModel.getClass();
        importLinkViewModel.onListenClick();
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreenUI$lambda$1(ImportLinkState importLinkState, ho.p pVar, ho.l lVar, z1 z1Var, u2.m mVar, int i10) {
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
            i3.t o6 = r1.d.o(r1.d.D(qVar2, z1Var), z1Var);
            i3.l lVar2 = i3.d.f12997a;
            f1 d10 = r1.p.d(lVar2, false);
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
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            f1 d12 = r1.p.d(lVar2, false);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d12, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            pVar.invoke(qVar, 0);
            qVar.p(true);
            r1.d.g(r1.d.u(qVar2), qVar);
            qVar.p(true);
            if (importLinkState.getError().length() > 0) {
                qVar.X(1987820329);
                ErrorScreenKt.m1836ErrorScreenV9fs2A(null, null, importLinkState.getError(), c3.k.d(350454996, true, new d(lVar, 4), qVar), null, 0L, qVar, 3072, 51);
                qVar.p(false);
            } else {
                qVar.X(1988223949);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreenUI$lambda$1$0$1(ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.common_retry);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new a(lVar, 4);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, p2.e(i3.q.f13017a, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreenUI$lambda$1$0$1$0$0(ho.l lVar) {
        lVar.invoke(new e0(1));
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreenUI$lambda$1$0$1$0$0$0(ImportLinkViewModel importLinkViewModel) {
        importLinkViewModel.getClass();
        importLinkViewModel.reload();
        return sn.z.f31622a;
    }

    public static final sn.z ImportLinkScreenUI$lambda$2(ImportLinkState importLinkState, ho.p pVar, ho.l lVar, ho.a aVar, int i10, u2.m mVar, int i11) {
        ImportLinkScreenUI(importLinkState, pVar, lVar, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ImportLinkScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1479836620);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ImportLinkState importLinkState = new ImportLinkState(false, "Hello world", null, null, "Error text message", false, false, false, 236, null);
            ho.p lambda$1685576447$app_productionRelease = ComposableSingletons$ImportLinkScreenKt.INSTANCE.getLambda$1685576447$app_productionRelease();
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new j(25);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new c(10);
                qVar.h0(L2);
            }
            ImportLinkScreenUI(importLinkState, lambda$1685576447$app_productionRelease, lVar, (ho.a) L2, qVar, 3504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 24);
        }
    }

    public static final sn.z Preview_ImportLinkScreen_Error$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ImportLinkScreen_Error$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_ImportLinkScreen_Error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ImportLinkScreen_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1985953962);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ImportLinkState importLinkState = new ImportLinkState(false, null, null, null, null, false, false, false, 255, null);
            ho.p m1669getLambda$1563675197$app_productionRelease = ComposableSingletons$ImportLinkScreenKt.INSTANCE.m1669getLambda$1563675197$app_productionRelease();
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new j(27);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new c(12);
                qVar.h0(L2);
            }
            ImportLinkScreenUI(importLinkState, m1669getLambda$1563675197$app_productionRelease, lVar, (ho.a) L2, qVar, 3504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 23);
        }
    }

    public static final sn.z Preview_ImportLinkScreen_Idle$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ImportLinkScreen_Idle$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_ImportLinkScreen_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ImportLinkScreen_Loaded(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2088387719);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ImportLinkState importLinkState = new ImportLinkState(false, "Hello world", null, null, null, false, false, false, 252, null);
            ho.p m1668getLambda$123612236$app_productionRelease = ComposableSingletons$ImportLinkScreenKt.INSTANCE.m1668getLambda$123612236$app_productionRelease();
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new j(26);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new c(11);
                qVar.h0(L2);
            }
            ImportLinkScreenUI(importLinkState, m1668getLambda$123612236$app_productionRelease, lVar, (ho.a) L2, qVar, 3504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 22);
        }
    }

    public static final sn.z Preview_ImportLinkScreen_Loaded$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ImportLinkScreen_Loaded$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_ImportLinkScreen_Loaded(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ImportLinkScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1242089024);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ImportLinkState importLinkState = new ImportLinkState(true, "Hello world", null, null, null, false, false, false, 252, null);
            ho.p m1667getLambda$1094610893$app_productionRelease = ComposableSingletons$ImportLinkScreenKt.INSTANCE.m1667getLambda$1094610893$app_productionRelease();
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new j(28);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new c(13);
                qVar.h0(L2);
            }
            ImportLinkScreenUI(importLinkState, m1667getLambda$1094610893$app_productionRelease, lVar, (ho.a) L2, qVar, 3504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 25);
        }
    }

    public static final sn.z Preview_ImportLinkScreen_Loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ImportLinkScreen_Loading$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_ImportLinkScreen_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void WebViewContent(String str, ImportLinkState importLinkState, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        boolean z11;
        u2.e eVar;
        h4.e eVar2;
        int i12;
        String str2;
        z0 z0Var;
        Object obj;
        Object L;
        ho.l lVar2;
        boolean z12;
        Object L2;
        u2.e eVar3;
        Object L3;
        Object L4;
        boolean z13;
        Object L5;
        boolean h10;
        Object L6;
        boolean z14;
        boolean z15;
        Object L7;
        int i13;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1652311619);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(importLinkState)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
            Object L8 = qVar.L();
            u2.e eVar4 = u2.l.f33918a;
            if (L8 == eVar4) {
                InputStream open = context.getAssets().open("webview-get-html-script.js");
                open.getClass();
                L8 = g0.c.C(new BufferedReader(new InputStreamReader(open, wq.b.f37231a), UserMetadata.MAX_INTERNAL_KEY_SIZE));
                qVar.h0(L8);
            }
            String str3 = (String) L8;
            Object L9 = qVar.L();
            if (L9 == eVar4) {
                L9 = u2.r.A(null);
                qVar.h0(L9);
            }
            z0 z0Var2 = (z0) L9;
            Object L10 = qVar.L();
            if (L10 == eVar4) {
                L10 = u2.r.A(Boolean.FALSE);
                qVar.h0(L10);
            }
            z0 z0Var3 = (z0) L10;
            Object L11 = qVar.L();
            if (L11 == eVar4) {
                L11 = u2.r.A(Boolean.FALSE);
                qVar.h0(L11);
            }
            z0 z0Var4 = (z0) L11;
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
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
            h4.e eVar5 = h4.g.f11907f;
            u2.r.J(eVar5, a10, qVar);
            h4.e eVar6 = h4.g.f11906e;
            u2.r.J(eVar6, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar7 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar7);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar8 = h4.g.f11905d;
            u2.r.J(eVar8, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            i3.t e10 = p2.e(new m1(1.0f, true), 1.0f);
            int i16 = i11 & 896;
            if (i16 == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i17 = i11 & 14;
            if (i17 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z16 = z10 | z11;
            Object L12 = qVar.L();
            if (!z16) {
                eVar = eVar4;
                if (L12 != eVar) {
                    i12 = i17;
                    obj = L12;
                    eVar2 = eVar6;
                    str2 = str;
                    z0Var = z0Var4;
                    ho.l lVar3 = (ho.l) obj;
                    L = qVar.L();
                    if (L != eVar) {
                        lVar2 = lVar3;
                        L = new u(z0Var2, 1);
                        qVar.h0(L);
                    } else {
                        lVar2 = lVar3;
                    }
                    ho.l lVar4 = (ho.l) L;
                    if (i12 != 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    L2 = qVar.L();
                    if (!z12 || L2 == eVar) {
                        L2 = new r(str2, 3);
                        qVar.h0(L2);
                    }
                    h4.e eVar9 = eVar2;
                    z0 z0Var5 = z0Var;
                    eVar3 = eVar;
                    k5.k.a(lVar2, e10, null, lVar4, (ho.l) L2, qVar, 3072, 4);
                    i3.t e11 = p2.e(r1.d.E(qVar2, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2353getX2D9Ej5fM()), 1.0f);
                    k2 a11 = i2.a(r1.j.f29233f, i3.d.f13005z0, qVar, 54);
                    int hashCode2 = Long.hashCode(qVar.T);
                    c3.o l7 = qVar.l();
                    i3.t c10 = i3.a.c(e11, qVar);
                    qVar.b0();
                    if (!qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    u2.r.J(eVar5, a11, qVar);
                    u2.r.J(eVar9, l7, qVar);
                    defpackage.f.u(hashCode2, qVar, eVar7, qVar, dVar);
                    u2.r.J(eVar8, c10, qVar);
                    int i18 = io.elevenlabs.ui.R.drawable.chevron_left;
                    String R = kj.c.R(qVar, R.string.import_link_accessibility_nav_back);
                    L3 = qVar.L();
                    if (L3 == eVar3) {
                        L3 = new n(z0Var2, 2);
                        qVar.h0(L3);
                    }
                    ButtonIconVariant buttonIconVariant = ButtonIconVariant.Quaternary;
                    ButtonIconKt.ButtonIcon(i18, R, (ho.a) L3, null, buttonIconVariant, null, false, WebViewContent$lambda$5(z0Var3), false, qVar, 24960, 360);
                    int i19 = io.elevenlabs.ui.R.drawable.chevron_right;
                    String R2 = kj.c.R(qVar, R.string.import_link_accessibility_nav_forward);
                    L4 = qVar.L();
                    if (L4 == eVar3) {
                        L4 = new n(z0Var2, 3);
                        qVar.h0(L4);
                    }
                    ButtonIconKt.ButtonIcon(i19, R2, (ho.a) L4, null, buttonIconVariant, null, false, WebViewContent$lambda$8(z0Var5), false, qVar, 24960, 360);
                    int i20 = io.elevenlabs.ui.R.drawable.restart;
                    String R3 = kj.c.R(qVar, R.string.import_link_accessibility_nav_refresh);
                    if (i16 != 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    L5 = qVar.L();
                    if (!z13 || L5 == eVar3) {
                        L5 = new a(lVar, 3);
                        qVar.h0(L5);
                    }
                    ButtonIconKt.ButtonIcon(i20, R3, (ho.a) L5, null, buttonIconVariant, null, false, false, false, qVar, 24576, 488);
                    qVar = qVar;
                    qVar.p(true);
                    qVar.p(true);
                    Boolean valueOf2 = Boolean.valueOf(importLinkState.getReload());
                    h10 = qVar.h(importLinkState);
                    L6 = qVar.L();
                    if (!h10 || L6 == eVar3) {
                        L6 = new ImportLinkScreenKt$WebViewContent$2$1(importLinkState, z0Var2, null);
                        qVar.h0(L6);
                    }
                    u2.r.f((ho.p) L6, valueOf2, qVar);
                    Boolean valueOf3 = Boolean.valueOf(importLinkState.getTriggerProcess());
                    boolean h11 = qVar.h(importLinkState);
                    if (i16 != 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = h11 | z14;
                    L7 = qVar.L();
                    if (!z15 || L7 == eVar3) {
                        ImportLinkScreenKt$WebViewContent$3$1 importLinkScreenKt$WebViewContent$3$1 = new ImportLinkScreenKt$WebViewContent$3$1(importLinkState, str3, lVar, z0Var2, null);
                        qVar.h0(importLinkScreenKt$WebViewContent$3$1);
                        L7 = importLinkScreenKt$WebViewContent$3$1;
                    }
                    u2.r.f((ho.p) L7, valueOf3, qVar);
                }
            } else {
                eVar = eVar4;
            }
            i12 = i17;
            eVar2 = eVar6;
            z0Var = z0Var4;
            obj = new o2(lVar, z0Var3, z0Var, str, z0Var2, 6);
            str2 = str;
            z0Var2 = z0Var2;
            qVar.h0(obj);
            ho.l lVar32 = (ho.l) obj;
            L = qVar.L();
            if (L != eVar) {
            }
            ho.l lVar42 = (ho.l) L;
            if (i12 != 4) {
            }
            L2 = qVar.L();
            if (!z12) {
            }
            L2 = new r(str2, 3);
            qVar.h0(L2);
            h4.e eVar92 = eVar2;
            z0 z0Var52 = z0Var;
            eVar3 = eVar;
            k5.k.a(lVar2, e10, null, lVar42, (ho.l) L2, qVar, 3072, 4);
            i3.t e112 = p2.e(r1.d.E(qVar2, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2353getX2D9Ej5fM()), 1.0f);
            k2 a112 = i2.a(r1.j.f29233f, i3.d.f13005z0, qVar, 54);
            int hashCode22 = Long.hashCode(qVar.T);
            c3.o l72 = qVar.l();
            i3.t c102 = i3.a.c(e112, qVar);
            qVar.b0();
            if (!qVar.S) {
            }
            u2.r.J(eVar5, a112, qVar);
            u2.r.J(eVar92, l72, qVar);
            defpackage.f.u(hashCode22, qVar, eVar7, qVar, dVar);
            u2.r.J(eVar8, c102, qVar);
            int i182 = io.elevenlabs.ui.R.drawable.chevron_left;
            String R4 = kj.c.R(qVar, R.string.import_link_accessibility_nav_back);
            L3 = qVar.L();
            if (L3 == eVar3) {
            }
            ButtonIconVariant buttonIconVariant2 = ButtonIconVariant.Quaternary;
            ButtonIconKt.ButtonIcon(i182, R4, (ho.a) L3, null, buttonIconVariant2, null, false, WebViewContent$lambda$5(z0Var3), false, qVar, 24960, 360);
            int i192 = io.elevenlabs.ui.R.drawable.chevron_right;
            String R22 = kj.c.R(qVar, R.string.import_link_accessibility_nav_forward);
            L4 = qVar.L();
            if (L4 == eVar3) {
            }
            ButtonIconKt.ButtonIcon(i192, R22, (ho.a) L4, null, buttonIconVariant2, null, false, WebViewContent$lambda$8(z0Var52), false, qVar, 24960, 360);
            int i202 = io.elevenlabs.ui.R.drawable.restart;
            String R32 = kj.c.R(qVar, R.string.import_link_accessibility_nav_refresh);
            if (i16 != 256) {
            }
            L5 = qVar.L();
            if (!z13) {
            }
            L5 = new a(lVar, 3);
            qVar.h0(L5);
            ButtonIconKt.ButtonIcon(i202, R32, (ho.a) L5, null, buttonIconVariant2, null, false, false, false, qVar, 24576, 488);
            qVar = qVar;
            qVar.p(true);
            qVar.p(true);
            Boolean valueOf22 = Boolean.valueOf(importLinkState.getReload());
            h10 = qVar.h(importLinkState);
            L6 = qVar.L();
            if (!h10) {
            }
            L6 = new ImportLinkScreenKt$WebViewContent$2$1(importLinkState, z0Var2, null);
            qVar.h0(L6);
            u2.r.f((ho.p) L6, valueOf22, qVar);
            Boolean valueOf32 = Boolean.valueOf(importLinkState.getTriggerProcess());
            boolean h112 = qVar.h(importLinkState);
            if (i16 != 256) {
            }
            z15 = h112 | z14;
            L7 = qVar.L();
            if (!z15) {
            }
            ImportLinkScreenKt$WebViewContent$3$1 importLinkScreenKt$WebViewContent$3$12 = new ImportLinkScreenKt$WebViewContent$3$1(importLinkState, str3, lVar, z0Var2, null);
            qVar.h0(importLinkScreenKt$WebViewContent$3$12);
            L7 = importLinkScreenKt$WebViewContent$3$12;
            u2.r.f((ho.p) L7, valueOf32, qVar);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 23, str, importLinkState, lVar);
        }
    }

    public static final WebView WebViewContent$lambda$10$0$0(final ho.l lVar, z0 z0Var, z0 z0Var2, String str, z0 z0Var3, Context context) {
        context.getClass();
        WebView webView = new WebView(context);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setWebViewClient(new ImportLinkScreenKt$WebViewContent$1$1$1$1$1(webView, lVar, z0Var, z0Var2, str));
        webView.getSettings().setJavaScriptEnabled(true);
        final int i10 = 0;
        final int i11 = 1;
        webView.addJavascriptInterface(new WebViewInterface(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.c0
            @Override // ho.l
            public final Object invoke(Object obj) {
                sn.z WebViewContent$lambda$10$0$0$0$0;
                sn.z WebViewContent$lambda$10$0$0$0$1;
                switch (i10) {
                    case 0:
                        WebViewContent$lambda$10$0$0$0$0 = ImportLinkScreenKt.WebViewContent$lambda$10$0$0$0$0(lVar, (String) obj);
                        return WebViewContent$lambda$10$0$0$0$0;
                    default:
                        WebViewContent$lambda$10$0$0$0$1 = ImportLinkScreenKt.WebViewContent$lambda$10$0$0$0$1(lVar, (String) obj);
                        return WebViewContent$lambda$10$0$0$0$1;
                }
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.c0
            @Override // ho.l
            public final Object invoke(Object obj) {
                sn.z WebViewContent$lambda$10$0$0$0$0;
                sn.z WebViewContent$lambda$10$0$0$0$1;
                switch (i11) {
                    case 0:
                        WebViewContent$lambda$10$0$0$0$0 = ImportLinkScreenKt.WebViewContent$lambda$10$0$0$0$0(lVar, (String) obj);
                        return WebViewContent$lambda$10$0$0$0$0;
                    default:
                        WebViewContent$lambda$10$0$0$0$1 = ImportLinkScreenKt.WebViewContent$lambda$10$0$0$0$1(lVar, (String) obj);
                        return WebViewContent$lambda$10$0$0$0$1;
                }
            }
        }), "WebViewInterface");
        webView.getSettings().setGeolocationEnabled(false);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setUserAgentString("Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.6478.122 Mobile Safari/537.36");
        webView.setLayerType(2, null);
        z0Var3.setValue(webView);
        return webView;
    }

    public static final sn.z WebViewContent$lambda$10$0$0$0$0(ho.l lVar, String str) {
        str.getClass();
        lVar.invoke(new r(str, 5));
        return sn.z.f31622a;
    }

    public static final sn.z WebViewContent$lambda$10$0$0$0$0$0(String str, ImportLinkViewModel importLinkViewModel) {
        importLinkViewModel.getClass();
        importLinkViewModel.onParsingCompleted(str);
        return sn.z.f31622a;
    }

    public static final sn.z WebViewContent$lambda$10$0$0$0$1(ho.l lVar, String str) {
        str.getClass();
        lVar.invoke(new r(str, 4));
        return sn.z.f31622a;
    }

    public static final sn.z WebViewContent$lambda$10$0$0$0$1$0(String str, ImportLinkViewModel importLinkViewModel) {
        importLinkViewModel.getClass();
        importLinkViewModel.onParsingError(str);
        return sn.z.f31622a;
    }

    public static final sn.z WebViewContent$lambda$10$1$0(z0 z0Var, WebView webView) {
        webView.getClass();
        z0Var.setValue(null);
        webView.destroy();
        return sn.z.f31622a;
    }

    public static final sn.z WebViewContent$lambda$10$2$0(String str, WebView webView) {
        webView.getClass();
        webView.loadUrl(str);
        return sn.z.f31622a;
    }

    public static final sn.z WebViewContent$lambda$10$3$0$0(z0 z0Var) {
        WebView WebViewContent$lambda$2 = WebViewContent$lambda$2(z0Var);
        if (WebViewContent$lambda$2 != null) {
            WebViewContent$lambda$2.goBack();
        }
        return sn.z.f31622a;
    }

    public static final sn.z WebViewContent$lambda$10$3$1$0(z0 z0Var) {
        WebView WebViewContent$lambda$2 = WebViewContent$lambda$2(z0Var);
        if (WebViewContent$lambda$2 != null) {
            WebViewContent$lambda$2.goForward();
        }
        return sn.z.f31622a;
    }

    public static final sn.z WebViewContent$lambda$10$3$2$0(ho.l lVar) {
        lVar.invoke(new j(29));
        return sn.z.f31622a;
    }

    public static final sn.z WebViewContent$lambda$10$3$2$0$0(ImportLinkViewModel importLinkViewModel) {
        importLinkViewModel.getClass();
        importLinkViewModel.reload();
        return sn.z.f31622a;
    }

    public static final sn.z WebViewContent$lambda$13(String str, ImportLinkState importLinkState, ho.l lVar, int i10, u2.m mVar, int i11) {
        WebViewContent(str, importLinkState, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final WebView WebViewContent$lambda$2(z0 z0Var) {
        return (WebView) z0Var.getValue();
    }

    private static final boolean WebViewContent$lambda$5(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void WebViewContent$lambda$6(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final boolean WebViewContent$lambda$8(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void WebViewContent$lambda$9(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }
}

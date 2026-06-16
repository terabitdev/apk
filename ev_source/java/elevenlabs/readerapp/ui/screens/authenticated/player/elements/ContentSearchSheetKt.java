package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import a2.h0;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import i4.e2;
import i4.j1;
import i4.u2;
import io.elevenlabs.readerapp.ui.formatter.WordCountToLengthFormatterKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.InputSearchKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.format.DurationFormatterKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.a1;
import q2.j7;
import q2.y2;
import r1.c3;
import r1.p2;
import r1.u0;
import rd.c1;
import rd.s0;
import s4.p0;
import s4.y0;
import u2.r1;
import u2.z0;
import w4.g0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\u001aC\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aO\u0010\u000f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010 \u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u000f\u0010\"\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\u0001H\u0007¢\u0006\u0004\b$\u0010#\u001a\u000f\u0010%\u001a\u00020\u0001H\u0007¢\u0006\u0004\b%\u0010#\"\u0014\u0010&\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010(\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006)²\u0006\u000e\u0010\u0013\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onDismiss", "", "readId", "Lkotlin/Function1;", "", "onNavigateToOffset", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ContentSearchViewModel;", "vm", "ContentSearchSheet", "(Lho/a;Ljava/lang/String;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ContentSearchViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ContentSearchState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "ContentSearchBottomSheetUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ContentSearchState;Lho/l;Lho/l;Lu2/m;II)V", "input", "Lwq/l;", "query", "", "contextWords", "Lp3/x;", "highlightTextColor", "highlightBackgroundColor", "Ls4/h;", "buildHighlightedText-jZ3TX3s", "(Ljava/lang/String;Lwq/l;IJJ)Ls4/h;", "buildHighlightedText", FirebaseAnalytics.Param.INDEX, "", "forward", "findWordBoundary", "(Ljava/lang/String;IZ)I", "Preview_ContentSearchBottomSheet_Idle", "(Lu2/m;I)V", "Preview_ContentSearchBottomSheet_Loading", "Preview_ContentSearchBottomSheet_Loaded", "LIMIT", TokenNames.I, "MIN_CHARS_IN_QUERY", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ContentSearchSheetKt {
    private static final int LIMIT = 100;
    private static final int MIN_CHARS_IN_QUERY = 3;

    /* JADX WARN: Code restructure failed: missing block: B:81:0x02e9, code lost:
    
        if (r7 == r4) goto L192;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ContentSearchBottomSheetUI(ContentSearchState contentSearchState, ho.l lVar, ho.l lVar2, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        int i13;
        int i14;
        ho.l lVar4;
        int i15;
        boolean z6;
        ho.l lVar5;
        ho.l lVar6;
        r1 r10;
        ho.l lVar7;
        ho.l lVar8;
        int i16;
        ho.l lVar9;
        ho.l lVar10;
        i3.q qVar;
        boolean z10;
        Object obj;
        u2.q qVar2;
        boolean z11;
        boolean z12;
        int i17;
        i3.j jVar = i3.d.C0;
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-1041503228);
        if ((i10 & 6) == 0) {
            if (qVar3.h(contentSearchState)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            lVar3 = lVar;
            if (qVar3.h(lVar3)) {
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
                if (qVar3.h(lVar4)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar3.O(i12 & 1, z6)) {
                    Object obj2 = u2.l.f33918a;
                    if (i18 != 0) {
                        Object L = qVar3.L();
                        if (L == obj2) {
                            L = new o(10);
                            qVar3.h0(L);
                        }
                        lVar7 = (ho.l) L;
                    } else {
                        lVar7 = lVar3;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar3.L();
                        if (L2 == obj2) {
                            L2 = new o(11);
                            qVar3.h0(L2);
                        }
                        lVar8 = (ho.l) L2;
                    } else {
                        lVar8 = lVar4;
                    }
                    i3.q qVar4 = i3.q.f13017a;
                    i3.t d10 = p2.d(qVar4, 1.0f);
                    WeakHashMap weakHashMap = c3.f29142x;
                    i3.t p10 = r1.d.p(r1.d.P(d10, u0.e(qVar3).f29154l), u0.e(qVar3).f29154l);
                    View view = (View) qVar3.j(AndroidCompositionLocals_androidKt.f2295f);
                    u2 u2Var = (u2) qVar3.j(j1.f13139s);
                    boolean f10 = qVar3.f(view) | qVar3.f(u2Var);
                    Object L3 = qVar3.L();
                    if (f10 || L3 == obj2) {
                        u2Var.c();
                        L3 = new e2(view);
                        qVar3.h0(L3);
                    }
                    i3.t a10 = b4.f.a(p10, (e2) L3, null);
                    r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar3, 0);
                    int hashCode = Long.hashCode(qVar3.T);
                    c3.o l4 = qVar3.l();
                    i3.t c5 = i3.a.c(a10, qVar3);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar3.b0();
                    if (qVar3.S) {
                        qVar3.k(fVar);
                    } else {
                        qVar3.k0();
                    }
                    h4.e eVar = h4.g.f11907f;
                    u2.r.J(eVar, a11, qVar3);
                    h4.e eVar2 = h4.g.f11906e;
                    u2.r.J(eVar2, l4, qVar3);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar3 = h4.g.f11908g;
                    u2.r.y(qVar3, valueOf, eVar3);
                    h4.d dVar = h4.g.f11909h;
                    u2.r.F(dVar, qVar3);
                    h4.e eVar4 = h4.g.f11905d;
                    u2.r.J(eVar4, c5, qVar3);
                    int length = contentSearchState.getQuery().length();
                    r1.z zVar = r1.z.f29398a;
                    ho.l lVar11 = lVar7;
                    if (length < 3) {
                        qVar3.X(-780051809);
                        ho.l lVar12 = lVar8;
                        i3.t c10 = zVar.c(p2.e(qVar4, 1.0f), 1.0f, true);
                        r1.x a12 = r1.w.a(r1.j.f29232e, jVar, qVar3, 54);
                        int hashCode2 = Long.hashCode(qVar3.T);
                        c3.o l7 = qVar3.l();
                        i3.t c11 = i3.a.c(c10, qVar3);
                        qVar3.b0();
                        if (qVar3.S) {
                            qVar3.k(fVar);
                        } else {
                            qVar3.k0();
                        }
                        u2.r.J(eVar, a12, qVar3);
                        u2.r.J(eVar2, l7, qVar3);
                        defpackage.f.u(hashCode2, qVar3, eVar3, qVar3, dVar);
                        u2.r.J(eVar4, c11, qVar3);
                        u3.c M = kd.a.M(R.drawable.magnifying_glass, qVar3, 0);
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        int i19 = ElevenLabsTheme.$stable;
                        y2.a(M, null, p2.o(qVar4, 24), ib.i.w(elevenLabsTheme, qVar3, i19), qVar3, u3.c.$stable | 432, 0);
                        ib.i.p(elevenLabsTheme, qVar3, i19, qVar4, qVar3);
                        String R = kj.c.R(qVar3, io.elevenlabs.readerapp.R.string.read_search_hint);
                        long w6 = ib.i.w(elevenLabsTheme, qVar3, i19);
                        y0 bodyMedium400 = elevenLabsTheme.getTypo(qVar3, i19).getBodyMedium400();
                        lVar10 = lVar11;
                        i16 = i12;
                        j7.d(R, null, w6, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bodyMedium400, qVar3, 0, 0, 131066);
                        qVar2 = qVar3;
                        qVar2.p(true);
                        qVar2.p(false);
                        z11 = false;
                        lVar9 = lVar12;
                        obj = obj2;
                        qVar = qVar4;
                    } else {
                        i16 = i12;
                        if (contentSearchState.isLoading()) {
                            qVar3.X(-779161148);
                            i3.t c12 = zVar.c(p2.e(qVar4, 1.0f), 1.0f, true);
                            r1.x a13 = r1.w.a(r1.j.f29232e, jVar, qVar3, 54);
                            int hashCode3 = Long.hashCode(qVar3.T);
                            c3.o l10 = qVar3.l();
                            i3.t c13 = i3.a.c(c12, qVar3);
                            qVar3.b0();
                            if (qVar3.S) {
                                qVar3.k(fVar);
                            } else {
                                qVar3.k0();
                            }
                            u2.r.J(eVar, a13, qVar3);
                            u2.r.J(eVar2, l10, qVar3);
                            defpackage.f.u(hashCode3, qVar3, eVar3, qVar3, dVar);
                            u2.r.J(eVar4, c13, qVar3);
                            lVar9 = lVar8;
                            qVar = qVar4;
                            lVar10 = lVar11;
                            LoaderKt.m1840LoadereopBjH0(p2.o(qVar4, 24), 0L, 0L, null, qVar3, 6, 14);
                            ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                            int i20 = ElevenLabsTheme.$stable;
                            ib.i.p(elevenLabsTheme2, qVar3, i20, qVar, qVar3);
                            j7.d(kj.c.R(qVar3, io.elevenlabs.readerapp.R.string.read_search_searching), null, ib.i.w(elevenLabsTheme2, qVar3, i20), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme2.getTypo(qVar3, i20).getBodyMedium400(), qVar3, 0, 0, 131066);
                            qVar2 = qVar3;
                            qVar2.p(true);
                            qVar2.p(false);
                            z11 = false;
                            obj = obj2;
                        } else {
                            lVar9 = lVar8;
                            lVar10 = lVar11;
                            qVar = qVar4;
                            qVar3.X(-778400532);
                            i3.t c14 = zVar.c(qVar, 1.0f, true);
                            boolean h10 = qVar3.h(contentSearchState);
                            if ((i16 & 896) == 256) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            boolean z13 = h10 | z10;
                            Object L4 = qVar3.L();
                            if (!z13) {
                                obj = obj2;
                            } else {
                                obj = obj2;
                            }
                            L4 = new io.elevenlabs.data.database.entities.reads.h(contentSearchState, lVar9, 10);
                            qVar3.h0(L4);
                            i16 = i16;
                            c1.c(c14, null, null, false, null, null, null, false, null, (ho.l) L4, qVar3, 0, 510);
                            qVar2 = qVar3;
                            z11 = false;
                            qVar2.p(false);
                        }
                    }
                    Object L5 = qVar2.L();
                    if (L5 == obj) {
                        L5 = new n3.v();
                        qVar2.h0(L5);
                    }
                    n3.v vVar = (n3.v) L5;
                    Object L6 = qVar2.L();
                    if (L6 == obj) {
                        L6 = u2.r.A(contentSearchState.getQuery());
                        qVar2.h0(L6);
                    }
                    z0 z0Var = (z0) L6;
                    boolean z14 = z11;
                    String ContentSearchBottomSheetUI$lambda$2$5 = ContentSearchBottomSheetUI$lambda$2$5(z0Var);
                    if ((i16 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = z14;
                    }
                    Object L7 = qVar2.L();
                    if (z12 || L7 == obj) {
                        L7 = new h0(lVar10, z0Var, 2);
                        qVar2.h0(L7);
                    }
                    u2.q qVar5 = qVar2;
                    InputSearchKt.InputSearch(ContentSearchBottomSheetUI$lambda$2$5, (ho.l) L7, ib.i.x(ElevenLabsTheme.INSTANCE, qVar2, ElevenLabsTheme.$stable, n3.d.j(qVar, vVar)), kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.read_search_input_placeholder), qVar5, 0, 0);
                    qVar3 = qVar5;
                    Object L8 = qVar3.L();
                    if (L8 == obj) {
                        L8 = new ContentSearchSheetKt$ContentSearchBottomSheetUI$3$5$1(vVar, null);
                        qVar3.h0(L8);
                    }
                    u2.r.f((ho.p) L8, sn.z.f31622a, qVar3);
                    qVar3.p(true);
                    lVar6 = lVar9;
                    lVar5 = lVar10;
                } else {
                    qVar3.R();
                    lVar5 = lVar3;
                    lVar6 = lVar4;
                }
                r10 = qVar3.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(contentSearchState, lVar5, lVar6, i10, i11, 4);
                    return;
                }
                return;
            }
            lVar4 = lVar2;
            if ((i12 & 147) != 146) {
            }
            if (qVar3.O(i12 & 1, z6)) {
            }
            r10 = qVar3.r();
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
        if (qVar3.O(i12 & 1, z6)) {
        }
        r10 = qVar3.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ContentSearchBottomSheetUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z ContentSearchBottomSheetUI$lambda$1$0(long j4) {
        return sn.z.f31622a;
    }

    public static final sn.z ContentSearchBottomSheetUI$lambda$2$2$0(final ContentSearchState contentSearchState, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, "search-results", null, new c3.j(new i(contentSearchState, 0), true, 2146194421), 2);
        final List<String> results = contentSearchState.getResults();
        final ContentSearchSheetKt$ContentSearchBottomSheetUI$lambda$2$2$0$$inlined$items$default$1 contentSearchSheetKt$ContentSearchBottomSheetUI$lambda$2$2$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchSheetKt$ContentSearchBottomSheetUI$lambda$2$2$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((String) obj);
            }

            @Override // ho.l
            public final Void invoke(String str) {
                return null;
            }
        };
        ((t1.i) tVar).u(results.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchSheetKt$ContentSearchBottomSheetUI$lambda$2$2$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(results.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchSheetKt$ContentSearchBottomSheetUI$lambda$2$2$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                int i12;
                boolean z6;
                boolean z10;
                long m2472getYellow5000d7_KjU;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((u2.q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i11 | i14;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((u2.q) mVar).d(i10)) {
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
                u2.q qVar = (u2.q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    String str = (String) results.get(i10);
                    qVar.X(-1948541626);
                    boolean f10 = qVar.f(str);
                    Object L = qVar.L();
                    Object obj = u2.l.f33918a;
                    if (f10 || L == obj) {
                        L = s0.B(str);
                        qVar.h0(L);
                    }
                    org.jsoup.nodes.g gVar = (org.jsoup.nodes.g) L;
                    gVar.getClass();
                    boolean f11 = qVar.f(gVar);
                    Object L2 = qVar.L();
                    if (f11 || L2 == obj) {
                        L2 = gVar.a0();
                        qVar.h0(L2);
                    }
                    String str2 = (String) L2;
                    str2.getClass();
                    boolean f12 = qVar.f(gVar);
                    Object L3 = qVar.L();
                    if (f12 || L3 == obj) {
                        us.g.z("c");
                        xs.e e10 = jo.a.e(new xs.h("c", 0, false), gVar);
                        e10.getClass();
                        Iterator it = e10.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                String d10 = ((org.jsoup.nodes.k) it.next()).d("c");
                                d10.getClass();
                                Long Z = wq.u.Z(d10);
                                if (Z != null) {
                                    L3 = Z;
                                    break;
                                }
                            } else {
                                L3 = null;
                                break;
                            }
                        }
                        qVar.h0(L3);
                    }
                    Long l4 = (Long) L3;
                    if (l4 != null) {
                        final long longValue = l4.longValue();
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        int i15 = ElevenLabsTheme.$stable;
                        long b10 = defpackage.f.b(elevenLabsTheme, qVar, i15);
                        if (elevenLabsTheme.getColor(qVar, i15).isDark()) {
                            m2472getYellow5000d7_KjU = ReaderColors.INSTANCE.m2474getYellow7000d7_KjU();
                        } else {
                            m2472getYellow5000d7_KjU = ReaderColors.INSTANCE.m2472getYellow5000d7_KjU();
                        }
                        long j4 = m2472getYellow5000d7_KjU;
                        boolean f13 = qVar.f(contentSearchState.getPattern()) | qVar.f(str2);
                        Object L4 = qVar.L();
                        if (f13 || L4 == obj) {
                            L4 = ContentSearchSheetKt.m1501buildHighlightedTextjZ3TX3s(str2, contentSearchState.getPattern(), 10, b10, j4);
                            qVar.h0(L4);
                        }
                        final s4.h hVar = (s4.h) L4;
                        if (hVar == null) {
                            qVar.p(false);
                            return;
                        }
                        i3.q qVar2 = i3.q.f13017a;
                        i3.t e11 = p2.e(qVar2, 1.0f);
                        r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                        int hashCode = Long.hashCode(qVar.T);
                        c3.o l7 = qVar.l();
                        i3.t c5 = i3.a.c(e11, qVar);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(h4.g.f11907f, a10, qVar);
                        u2.r.J(h4.g.f11906e, l7, qVar);
                        u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                        u2.r.F(h4.g.f11909h, qVar);
                        u2.r.J(h4.g.f11905d, c5, qVar);
                        String str3 = hVar.f31041b;
                        boolean f14 = qVar.f(lVar) | qVar.e(longValue);
                        Object L5 = qVar.L();
                        if (f14 || L5 == obj) {
                            final ho.l lVar2 = lVar;
                            L5 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchSheetKt$ContentSearchBottomSheetUI$3$3$1$2$1$1$1
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m1502invoke() {
                                    ho.l.this.invoke(Long.valueOf(longValue));
                                }

                                @Override // ho.a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m1502invoke();
                                    return sn.z.f31622a;
                                }
                            };
                            qVar.h0(L5);
                        }
                        ButtonContainerKt.m1780ButtonContainer83mGB3Q(str3, (ho.a) L5, null, 0L, false, 0, null, false, null, c3.k.d(1558125132, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchSheetKt$ContentSearchBottomSheetUI$3$3$1$2$1$2
                            public final void invoke(r1.s sVar, u2.m mVar2, int i16) {
                                boolean z11;
                                sVar.getClass();
                                if ((i16 & 17) != 16) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                u2.q qVar3 = (u2.q) mVar2;
                                if (qVar3.O(i16 & 1, z11)) {
                                    i3.q qVar4 = i3.q.f13017a;
                                    i3.t e12 = p2.e(qVar4, 1.0f);
                                    ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                                    int i17 = ElevenLabsTheme.$stable;
                                    i3.t F = r1.d.F(e12, elevenLabsTheme2.getSpacings(qVar3, i17).m2356getX4D9Ej5fM(), elevenLabsTheme2.getSpacings(qVar3, i17).m2353getX2D9Ej5fM());
                                    long j10 = longValue;
                                    s4.h hVar2 = hVar;
                                    r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar3, 0);
                                    int hashCode2 = Long.hashCode(qVar3.T);
                                    c3.o l10 = qVar3.l();
                                    i3.t c10 = i3.a.c(F, qVar3);
                                    h4.h.f11920i.getClass();
                                    h4.f fVar2 = h4.g.f11903b;
                                    qVar3.b0();
                                    if (qVar3.S) {
                                        qVar3.k(fVar2);
                                    } else {
                                        qVar3.k0();
                                    }
                                    u2.r.J(h4.g.f11907f, a11, qVar3);
                                    u2.r.J(h4.g.f11906e, l10, qVar3);
                                    u2.r.y(qVar3, Integer.valueOf(hashCode2), h4.g.f11908g);
                                    u2.r.F(h4.g.f11909h, qVar3);
                                    u2.r.J(h4.g.f11905d, c10, qVar3);
                                    j7.d(DurationFormatterKt.formatMinutesDuration$default(WordCountToLengthFormatterKt.charCountToMinutes(j10), false, 1, null), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme2.getTypo(qVar3, i17).getBodyMedium600(), qVar3, 0, 0, 131070);
                                    r1.d.g(p2.f(qVar4, elevenLabsTheme2.getSpacings(qVar3, i17).m2350getX1D9Ej5fM()), qVar3);
                                    j7.e(hVar2, null, defpackage.f.A(elevenLabsTheme2, qVar3, i17), 0L, 0L, null, 0L, 0, false, 0, 0, null, null, elevenLabsTheme2.getTypo(qVar3, i17).getBodyMedium400(), qVar3, 0, 0, 262138);
                                    qVar3.p(true);
                                    return;
                                }
                                qVar3.R();
                            }

                            @Override // ho.q
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                invoke((r1.s) obj2, (u2.m) obj3, ((Number) obj4).intValue());
                                return sn.z.f31622a;
                            }
                        }, qVar), qVar, 805306368, 508);
                        qVar = qVar;
                        DividerKt.m1828DividerLightiJQMabo(r1.d.F(qVar2, elevenLabsTheme.getSpacings(qVar, i15).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i15).m2353getX2D9Ej5fM()), 0L, qVar, 0, 2);
                        qVar.p(true);
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    qVar.p(z10);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return sn.z.f31622a;
            }
        }, true, 802480018));
        return sn.z.f31622a;
    }

    public static final sn.z ContentSearchBottomSheetUI$lambda$2$2$0$0(ContentSearchState contentSearchState, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        String valueOf;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = io.elevenlabs.readerapp.R.plurals.read_search_results_plurals;
            int size = contentSearchState.getResults().size();
            if (contentSearchState.getResults().size() >= 100) {
                valueOf = "100+";
            } else {
                valueOf = String.valueOf(contentSearchState.getResults().size());
            }
            String I = kj.c.I(i11, size, new Object[]{valueOf}, qVar);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i12 = ElevenLabsTheme.$stable;
            j7.d(I, r1.d.F(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar, i12).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i12).m2350getX1D9Ej5fM()), ib.i.w(elevenLabsTheme, qVar, i12), 0L, null, 0L, null, 0L, 0, false, 5, 0, null, elevenLabsTheme.getTypo(qVar, i12).getBodyMedium500(), qVar, 0, 24576, 114680);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    private static final String ContentSearchBottomSheetUI$lambda$2$5(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z ContentSearchBottomSheetUI$lambda$2$7$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new j(z0Var, 0));
        return sn.z.f31622a;
    }

    public static final sn.z ContentSearchBottomSheetUI$lambda$2$7$0$0(z0 z0Var, ContentSearchViewModel contentSearchViewModel) {
        contentSearchViewModel.getClass();
        contentSearchViewModel.onQueryChanged(ContentSearchBottomSheetUI$lambda$2$5(z0Var));
        return sn.z.f31622a;
    }

    public static final sn.z ContentSearchBottomSheetUI$lambda$3(ContentSearchState contentSearchState, ho.l lVar, ho.l lVar2, int i10, int i11, u2.m mVar, int i12) {
        ContentSearchBottomSheetUI(contentSearchState, lVar, lVar2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        if ((r23 & 8) != 0) goto L130;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContentSearchSheet(ho.a aVar, String str, ho.l lVar, ContentSearchViewModel contentSearchViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ContentSearchViewModel contentSearchViewModel2;
        boolean z6;
        q7.c cVar;
        boolean z10;
        String str2;
        int i13;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        str.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1325499680);
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
            if (qVar.f(str)) {
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
                contentSearchViewModel2 = contentSearchViewModel;
                if (qVar.h(contentSearchViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                contentSearchViewModel2 = contentSearchViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            contentSearchViewModel2 = contentSearchViewModel;
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
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        contentSearchViewModel2 = (ContentSearchViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(ContentSearchViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                ContentSearchState contentSearchState = (ContentSearchState) u2.r.o(contentSearchViewModel2.getStateFlow(), qVar, 0).getValue();
                boolean h10 = qVar.h(contentSearchViewModel2);
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = h10 | z10;
                Object L = qVar.L();
                if (z11 || L == u2.l.f33918a) {
                    L = new ContentSearchSheetKt$ContentSearchSheet$1$1(contentSearchViewModel2, str, null);
                    qVar.h0(L);
                }
                u2.r.f((ho.p) L, str, qVar);
                if (contentSearchState.getQuery().length() >= 3) {
                    qVar.X(1800107530);
                    str2 = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_search_title);
                    qVar.p(false);
                } else {
                    qVar.X(-31195042);
                    qVar.p(false);
                    str2 = "";
                }
                BottomSheetScaffoldKt.m1898BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, aVar, str2, (ho.r) c3.k.d(-302350062, true, new io.elevenlabs.readerapp.core.h(contentSearchState, contentSearchViewModel2, lVar, 9), qVar), (u2.m) qVar, ((i12 << 12) & 57344) | 1572864, 15);
                qVar = qVar;
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l(aVar, (Object) str, (Object) lVar, (Object) contentSearchViewModel2, i10, i11, 19);
        }
    }

    public static final sn.z ContentSearchSheet$lambda$1(ContentSearchState contentSearchState, ContentSearchViewModel contentSearchViewModel, ho.l lVar, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(contentSearchViewModel);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new d(contentSearchViewModel, 1);
            qVar.h0(L);
        }
        ContentSearchBottomSheetUI(contentSearchState, (ho.l) L, lVar, qVar, 0, 0);
        return sn.z.f31622a;
    }

    public static final sn.z ContentSearchSheet$lambda$1$0$0(ContentSearchViewModel contentSearchViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(contentSearchViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z ContentSearchSheet$lambda$2(ho.a aVar, String str, ho.l lVar, ContentSearchViewModel contentSearchViewModel, int i10, int i11, u2.m mVar, int i12) {
        ContentSearchSheet(aVar, str, lVar, contentSearchViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ContentSearchBottomSheet_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(684672916);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ContentSearchBottomSheetUI(new ContentSearchState(null, null, false, null, null, 31, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.j1(i10, 18);
        }
    }

    public static final sn.z Preview_ContentSearchBottomSheet_Idle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ContentSearchBottomSheet_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ContentSearchBottomSheet_Loaded(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-40815291);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ContentSearchBottomSheetUI(new ContentSearchState("Eleven", new wq.l("Eleven\\s+i"), false, null, ig.f.I("<p><span c=\"0\">Eleven</span> <span c=\"0\">is</span> <span c=\"0\">more</span> <span c=\"0\">than</span> <span c=\"0\">ten</span></p>", "<p><span c=\"0\">This</span> <span c=\"0\">is</span> <span c=\"0\">Eleven</span> <span c=\"0\">in</span> <span c=\"0\">the</span> <span c=\"0\">middle</span></p>", "<p><span c=\"0\">AI</span> <span c=\"0\">could</span> <span c=\"0\">be</span> <span c=\"0\">just</span> <span c=\"0\">Eleven</span> <span c=\"0\">as</span> <span c=\"0\">I</span> <span c=\"0\">think</span> <span c=\"0\">most</span> <span c=\"0\">people</span> <span c=\"0\">are</span> <span c=\"0\">underestimating</span> <span c=\"0\">how</span> <span c=\"0\">bad</span> <span c=\"0\">the</span> <span c=\"0\">risks</span> <span c=\"0\">could</span> <span c=\"0\">be</span> <span c=\"0\">Eleven</span> <span c=\"0\">is</span> <span c=\"0\">in</span> <span c=\"0\">this</span> <span c=\"0\">essay</span> <span c=\"0\">I</span> <span c=\"0\">try</span> <span c=\"0\">to</span> <span c=\"0\">sketch</span> <span c=\"0\">out</span> <span c=\"0\">what</span> <span c=\"0\">that</span> <span c=\"0\">upside</span> <span c=\"0\">might</span> <span c=\"0\">look</span> <span c=\"0\">like</span> <span c=\"0\">Eleven</span> <span c=\"0\">in</span> <span c=\"0\">a</span> <span c=\"0\">world</span> <span c=\"0\">with</span> <span c=\"0\">powerful</span> <span c=\"0\">AI</span> <span c=\"0\">might</span> <span c=\"0\">look</span> <span c=\"0\">like</span> <span c=\"0\">if</span> <span c=\"0\">everything</span> <span c=\"0\">goes</span> <span c=\"0\">right</span></p>"), 8, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.j1(i10, 17);
        }
    }

    public static final sn.z Preview_ContentSearchBottomSheet_Loaded$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ContentSearchBottomSheet_Loaded(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ContentSearchBottomSheet_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1160816206);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ContentSearchBottomSheetUI(new ContentSearchState("Eleven", null, true, null, null, 26, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.j1(i10, 16);
        }
    }

    public static final sn.z Preview_ContentSearchBottomSheet_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ContentSearchBottomSheet_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* renamed from: buildHighlightedText-jZ3TX3s */
    public static final s4.h m1501buildHighlightedTextjZ3TX3s(String str, wq.l lVar, int i10, long j4, long j10) {
        int findWordBoundary;
        str.getClass();
        lVar.getClass();
        List u02 = vq.k.u0(wq.l.b(lVar, str));
        if (u02.isEmpty()) {
            return null;
        }
        s4.e eVar = new s4.e();
        int i11 = i10 * 5;
        int findWordBoundary2 = findWordBoundary(str, Math.max(0, ((wq.i) ((wq.h) tn.o.w0(u02))).b().f24556a - i11), false);
        int i12 = i10 * 10;
        int i13 = 0;
        int i14 = 0;
        for (Object obj : u02) {
            int i15 = i13 + 1;
            if (i13 >= 0) {
                wq.i iVar = (wq.i) ((wq.h) obj);
                int i16 = iVar.b().f24556a;
                int i17 = iVar.b().f24557b + 1;
                if (i16 - i14 > i12) {
                    eVar.d(str.substring(i14, findWordBoundary(str, i14, true)));
                    eVar.d("... ");
                    findWordBoundary2 = findWordBoundary(str, Math.max(0, i16 - i11), false);
                }
                if (findWordBoundary2 < i16) {
                    eVar.d(str.substring(findWordBoundary2, i16));
                }
                int i18 = eVar.i(new p0(j4, 0L, g0.B0, (w4.a0) null, (w4.b0) null, (w4.u) null, (String) null, 0L, (e5.a) null, (e5.p) null, (a5.c) null, j10, (e5.l) null, (a1) null, 63482));
                try {
                    eVar.d(str.substring(i16, i17));
                    eVar.g(i18);
                    if (i13 == u02.size() - 1 && i17 < (findWordBoundary = findWordBoundary(str, i17 + i11, true))) {
                        eVar.d(str.substring(i17, findWordBoundary).concat("..."));
                    }
                    findWordBoundary2 = i17;
                    i14 = findWordBoundary2;
                    i13 = i15;
                } catch (Throwable th) {
                    eVar.g(i18);
                    throw th;
                }
            } else {
                ig.f.U();
                throw null;
            }
        }
        return eVar.k();
    }

    public static final int findWordBoundary(String str, int i10, boolean z6) {
        str.getClass();
        if (z6) {
            int j02 = wq.n.j0(' ', i10, 4, str);
            if (j02 != -1) {
                return j02;
            }
            return str.length();
        }
        int o02 = wq.n.o0(' ', i10, 4, str);
        if (o02 != -1) {
            return o02 + 1;
        }
        return 0;
    }
}

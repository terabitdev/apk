package io.elevenlabs.readerapp.ui.screens.authenticated;

import a2.k3;
import android.graphics.Canvas;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import i1.e2;
import i4.j1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.Rating;
import io.elevenlabs.domain.model.ReadCreationStatus;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadSource;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.ReadMetaRowKt;
import io.elevenlabs.readerapp.ui.previews.ExploreFactoryKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.Filter;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpec;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.ChipGroupKt;
import io.elevenlabs.ui.components.ChipKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.SwipeAnchor;
import io.elevenlabs.ui.components.SwipeToActionBoxKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import q2.j7;
import q2.k5;
import q2.v7;
import r1.c3;
import r1.d2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.z1;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001ac\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a}\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001e\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u0019\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010!\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u001d*\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010$\u001a\u000f\u0010%\u001a\u00020\u0001H\u0007¢\u0006\u0004\b%\u0010&\u001a\u000f\u0010'\u001a\u00020\u0001H\u0007¢\u0006\u0004\b'\u0010&\u001a1\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00142\u0006\u0010)\u001a\u00020(2\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140\u0014H\u0002¢\u0006\u0004\b,\u0010-\u001a\u000f\u0010.\u001a\u00020\u0001H\u0007¢\u0006\u0004\b.\u0010&\u001a\u000f\u0010/\u001a\u00020\u0001H\u0007¢\u0006\u0004\b/\u0010&\u001a\u000f\u00100\u001a\u00020\u0001H\u0007¢\u0006\u0004\b0\u0010&\u001a\u000f\u00101\u001a\u00020\u0001H\u0007¢\u0006\u0004\b1\u0010&\u001a\u000f\u00102\u001a\u00020\u0001H\u0007¢\u0006\u0004\b2\u0010&\"\u0017\u00103\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0014\u00107\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104¨\u00069²\u0006\u000e\u00108\u001a\u00020(8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lkotlin/Function1;", "", "onNavigateToRead", "Lkotlin/Function2;", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "onNavigateToPlayer", "onNavigateToLibrary", "Lio/elevenlabs/readerapp/ui/screens/authenticated/DownloadsViewModel;", "vm", "DownloadsScreen", "(Lho/a;Lho/l;Lho/p;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/DownloadsViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/DownloadsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "miniPlayer", "action", "DownloadsScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/DownloadsState;Lho/p;Lho/l;Lho/a;Lho/l;Lho/a;Lu2/m;II)V", "", "availableCategories", "Lio/elevenlabs/readerapp/ui/screens/authenticated/Filter;", "selectedFilter", "onCategorySelected", "CategoriesTabs", "(Ljava/util/List;Lio/elevenlabs/readerapp/ui/screens/authenticated/Filter;Lho/l;Lu2/m;I)V", "DownloadsEmptyState", "(Lho/a;Lu2/m;II)V", "Li3/t;", "modifier", "MockDownloadItems", "(Li3/t;Lu2/m;II)V", "DownloadsHeader", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/DownloadsState;Lu2/m;I)V", "alphaSolidAlphaGradientMask", "(Li3/t;)Li3/t;", "Preview_DownloadsScreen_Loading", "(Lu2/m;I)V", "Preview_DownloadsScreen_Empty", "", "count", "genres", "Lio/elevenlabs/domain/model/ReadMeta;", "createReadsWithGenres", "(ILjava/util/List;)Ljava/util/List;", "Preview_DownloadsScreen_SingleItem", "Preview_DownloadsScreen_MultipleItems", "Preview_DownloadsScreen_AllReadsOnly", "Preview_DownloadsScreen_WithCategories", "Preview_DownloadsEmptyState", "EMPTY_STATE_MOCK_ITEM_A", "Lio/elevenlabs/domain/model/ReadMeta;", "getEMPTY_STATE_MOCK_ITEM_A", "()Lio/elevenlabs/domain/model/ReadMeta;", "EMPTY_STATE_MOCK_ITEM_B", "miniPlayerHeight", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DownloadsScreenKt {
    private static final ReadMeta EMPTY_STATE_MOCK_ITEM_A;
    private static final ReadMeta EMPTY_STATE_MOCK_ITEM_B;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadsScreenState.values().length];
            try {
                iArr[DownloadsScreenState.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadsScreenState.Empty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadsScreenState.Content.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Date date = new Date();
        Date date2 = new Date();
        Date date3 = new Date();
        ReadSource readSource = ReadSource.Website;
        List H = ig.f.H("Fiction");
        Rating rating = new Rating(3.2f, 4L);
        ReadCreationStatus readCreationStatus = ReadCreationStatus.Finished;
        Float valueOf = Float.valueOf(1.0f);
        tn.t tVar = tn.t.f33547a;
        EMPTY_STATE_MOCK_ITEM_A = new ReadMeta(null, "Arthur Conan Doyle", tVar, 48000L, date, date2, date3, "Officia fugiat dolor dolor fugiat dolor. Culpa dolore irure tempor ipsum adipisicing do do proident.", 0L, "mock-1", readSource, "The Adventure of the Engineer's Thumb", "", null, 8000L, null, false, false, null, null, H, true, false, rating, null, null, readCreationStatus, valueOf, false, false, null, null, null, null, true, null, false, null, null, null, null, null, null, false, false, null, false, null, null, null, null, false, null, null, null, ExploreFactoryKt.SAMPLE_BLUR_PLACEHOLDER, 0, 8386560, null);
        EMPTY_STATE_MOCK_ITEM_B = new ReadMeta(null, "John Doe", tVar, 35000L, new Date(), new Date(), new Date(), "Officia fugiat dolor dolor fugiat dolor. Culpa dolore irure tempor ipsum adipisicing do do proident.", 0L, "mock-2", readSource, "The Essence of Landscape Photography", "", null, 6000L, null, false, false, null, null, ig.f.H("Photography"), false, false, new Rating(3.2f, 4L), null, null, readCreationStatus, valueOf, false, false, null, null, null, null, true, null, false, null, null, null, null, null, null, false, false, null, false, null, null, null, null, false, null, null, null, ExploreFactoryKt.SAMPLE_BLUR_PLACEHOLDER, 0, 8386560, null);
    }

    private static final void CategoriesTabs(List<String> list, Filter filter, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        boolean h10;
        int i13;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1075414763);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = qVar.f(filter);
            } else {
                h10 = qVar.h(filter);
            }
            if (h10) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        boolean z11 = false;
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            if ((i11 & 112) != 32 && ((i11 & 64) == 0 || !qVar.h(filter))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((i11 & 896) == 256) {
                z11 = true;
            }
            boolean h11 = z10 | z11 | qVar.h(list);
            Object L = qVar.L();
            if (h11 || L == u2.l.f33918a) {
                L = new a2.o0(list, filter, lVar, 14);
                qVar.h0(L);
            }
            ChipGroupKt.ChipGroup(null, null, (ho.l) L, qVar, 0, 3);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 10, list, filter, lVar);
        }
    }

    public static final sn.z CategoriesTabs$lambda$0$0(List list, Filter filter, ho.l lVar, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new f(filter, lVar, 0), true, -1094630140), 3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t1.t.c(tVar, null, null, new c3.j(new fm.o((String) it.next(), (Object) filter, (Object) lVar, 3), true, -1441517838), 3);
        }
        return sn.z.f31622a;
    }

    public static final sn.z CategoriesTabs$lambda$0$0$0(Filter filter, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.downloaded_collection_all_reads);
            boolean z10 = filter instanceof Filter.AllReads;
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new j(lVar, 0);
                qVar.h0(L);
            }
            ChipKt.Chip(R, null, z10, null, null, null, (ho.a) L, null, null, qVar, 0, 442);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CategoriesTabs$lambda$0$0$0$0$0(ho.l lVar) {
        lVar.invoke(Filter.AllReads.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z CategoriesTabs$lambda$0$0$1$0(String str, Filter filter, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        Filter.Category category;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String str2 = null;
            if (filter instanceof Filter.Category) {
                category = (Filter.Category) filter;
            } else {
                category = null;
            }
            if (category != null) {
                str2 = category.getCategory();
            }
            boolean c5 = kotlin.jvm.internal.m.c(str2, str);
            boolean f10 = qVar.f(lVar) | qVar.f(str);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new v(lVar, str, 0);
                qVar.h0(L);
            }
            ChipKt.Chip(str, null, c5, null, null, null, (ho.a) L, null, null, qVar, 0, 442);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CategoriesTabs$lambda$0$0$1$0$0$0(ho.l lVar, String str) {
        lVar.invoke(new Filter.Category(str));
        return sn.z.f31622a;
    }

    public static final sn.z CategoriesTabs$lambda$1(List list, Filter filter, ho.l lVar, int i10, u2.m mVar, int i11) {
        CategoriesTabs(list, filter, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void DownloadsEmptyState(ho.a aVar, u2.m mVar, int i10, int i11) {
        ho.a aVar2;
        int i12;
        int i13;
        boolean z6;
        int i14;
        ho.a aVar3;
        ho.a aVar4;
        boolean z10;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1570333837);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            aVar2 = aVar;
        } else if ((i10 & 6) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            aVar2 = aVar;
            i12 = i10;
        }
        if ((i12 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            u2.e eVar = u2.l.f33918a;
            if (i15 != 0) {
                Object L = qVar.L();
                if (L == eVar) {
                    L = new d(25);
                    qVar.h0(L);
                }
                aVar4 = (ho.a) L;
            } else {
                aVar4 = aVar2;
            }
            i3.q qVar2 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar2, 1.0f);
            i3.j jVar = i3.d.C0;
            r1.x a10 = r1.w.a(r1.j.f29234g, jVar, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
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
            r1.d.g(p2.f(qVar2, v7.f27815b), qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            f4.f1 d11 = r1.p.d(i3.d.f13001e, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, d11, qVar);
            u2.r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c10, qVar);
            MockDownloadItems(m3.h.j(qVar2, 0.8f, 0.8f), qVar, 6, 0);
            qVar.p(true);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i16 = ElevenLabsTheme.$stable;
            i3.t G = r1.d.G(qVar2, elevenLabsTheme.getSpacings(qVar, i16).m2356getX4D9Ej5fM(), t2.u.P, 2);
            r1.x a11 = r1.w.a(r1.j.f29230c, jVar, qVar, 48);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(G, qVar);
            qVar.b0();
            ho.a aVar5 = aVar4;
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, a11, qVar);
            u2.r.J(eVar3, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c11, qVar);
            j7.d(kj.c.R(qVar, R.string.downloaded_collection_empty_title), r1.d.G(qVar2, elevenLabsTheme.getSpacings(qVar, i16).m2359getX7D9Ej5fM(), t2.u.P, 2), 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i16).getTitleMedium700(), qVar, 0, 0, 130044);
            j7.d(kj.c.R(qVar, R.string.downloaded_collection_empty_subtitle), r1.d.I(qVar2, t2.u.P, elevenLabsTheme.getSpacings(qVar, i16).m2356getX4D9Ej5fM(), t2.u.P, t2.u.P, 13), 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i16).getTitleSmall500(), qVar, 0, 0, 130044);
            qVar = qVar;
            String R = kj.c.R(qVar, R.string.downloaded_collection_empty_action);
            FullWidthButtonSize fullWidthButtonSize = FullWidthButtonSize.Large;
            i3.t I = r1.d.I(p2.e(qVar2, 1.0f), t2.u.P, elevenLabsTheme.getSpacings(qVar, i16).m2360getX8D9Ej5fM(), t2.u.P, elevenLabsTheme.getSpacings(qVar, i16).m2356getX4D9Ej5fM(), 5);
            if ((i12 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L2 = qVar.L();
            if (!z10 && L2 != eVar) {
                aVar3 = aVar5;
                i14 = 0;
            } else {
                aVar3 = aVar5;
                i14 = 0;
                L2 = new q(0, aVar3);
                qVar.h0(L2);
            }
            FullWidthButtonKt.FullWidthButton(R, (ho.a) L2, I, fullWidthButtonSize, null, null, false, false, false, qVar, 3072, 496);
            WeakHashMap weakHashMap = c3.f29142x;
            r1.d.g(r1.d.N(r1.u0.e(qVar).f29154l), qVar);
            qVar.p(true);
            qVar.p(true);
        } else {
            i14 = 0;
            qVar.R();
            aVar3 = aVar2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new r(aVar3, i10, i11, i14);
        }
    }

    public static final sn.z DownloadsEmptyState$lambda$1$1$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsEmptyState$lambda$2(ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        DownloadsEmptyState(aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void DownloadsHeader(DownloadsState downloadsState, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(662199622);
        if ((i10 & 6) == 0) {
            if (qVar.h(downloadsState)) {
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
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t E = r1.d.E(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar, i13).m2357getX5D9Ej5fM());
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
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
            j7.d(downloadsState.getMeta().getTitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getTitleLarge700Inter(), qVar, 0, 0, 131070);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new em.a(downloadsState, i10, 3);
        }
    }

    public static final sn.z DownloadsHeader$lambda$1(DownloadsState downloadsState, int i10, u2.m mVar, int i11) {
        DownloadsHeader(downloadsState, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DownloadsScreen(ho.a aVar, ho.l lVar, ho.p pVar, ho.a aVar2, DownloadsViewModel downloadsViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        DownloadsViewModel downloadsViewModel2;
        boolean z6;
        u2.q qVar;
        DownloadsViewModel downloadsViewModel3;
        q7.c cVar;
        u2.q qVar2;
        int i13;
        DownloadsViewModel downloadsViewModel4;
        boolean h10;
        Object L;
        boolean z10;
        Object L2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ho.a aVar3 = aVar;
        aVar3.getClass();
        lVar.getClass();
        pVar.getClass();
        aVar2.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-820892889);
        if ((i10 & 6) == 0) {
            if (qVar3.h(aVar3)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(lVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(pVar)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.h(aVar2)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                downloadsViewModel2 = downloadsViewModel;
                if (qVar3.h(downloadsViewModel2)) {
                    i14 = 16384;
                    i12 |= i14;
                }
            } else {
                downloadsViewModel2 = downloadsViewModel;
            }
            i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i12 |= i14;
        } else {
            downloadsViewModel2 = downloadsViewModel;
        }
        boolean z11 = false;
        if ((i12 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i12 & 1, z6)) {
            qVar3.T();
            if ((i10 & 1) != 0 && !qVar3.y()) {
                qVar3.R();
                if ((i11 & 16) != 0) {
                    i13 = i12 & (-57345);
                    downloadsViewModel4 = downloadsViewModel2;
                    qVar2 = qVar3;
                    qVar2.q();
                    DownloadsState downloadsState = (DownloadsState) u2.r.o(downloadsViewModel4.getStateFlow(), qVar2, 0).getValue();
                    c3.j d10 = c3.k.d(319151688, true, new s(pVar, 0), qVar2);
                    h10 = qVar2.h(downloadsViewModel4);
                    L = qVar2.L();
                    u2.e eVar = u2.l.f33918a;
                    if (!h10) {
                    }
                    L = new l0(downloadsViewModel4, 4);
                    qVar2.h0(L);
                    int i19 = i13 << 9;
                    u2.q qVar4 = qVar2;
                    DownloadsScreenUI(downloadsState, d10, (ho.l) L, aVar3, lVar, aVar2, qVar4, (i19 & 57344) | (i19 & 7168) | 48 | ((i13 << 6) & 458752), 0);
                    aVar3 = aVar3;
                    qVar = qVar4;
                    Boolean valueOf = Boolean.valueOf(downloadsState.getNavigateBack());
                    boolean h11 = qVar.h(downloadsState);
                    if ((i13 & 14) == 4) {
                    }
                    z10 = h11 | z11;
                    L2 = qVar.L();
                    if (!z10) {
                    }
                    L2 = new DownloadsScreenKt$DownloadsScreen$3$1(downloadsState, aVar3, null);
                    qVar.h0(L2);
                    u2.r.f((ho.p) L2, valueOf, qVar);
                    downloadsViewModel3 = downloadsViewModel4;
                }
            } else if ((i11 & 16) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar3);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar3);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    qVar2 = qVar3;
                    downloadsViewModel2 = (DownloadsViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(DownloadsViewModel.class), a10, null, o6, cVar, qVar2);
                    i12 &= -57345;
                    i13 = i12;
                    downloadsViewModel4 = downloadsViewModel2;
                    qVar2.q();
                    DownloadsState downloadsState2 = (DownloadsState) u2.r.o(downloadsViewModel4.getStateFlow(), qVar2, 0).getValue();
                    c3.j d102 = c3.k.d(319151688, true, new s(pVar, 0), qVar2);
                    h10 = qVar2.h(downloadsViewModel4);
                    L = qVar2.L();
                    u2.e eVar2 = u2.l.f33918a;
                    if (!h10 || L == eVar2) {
                        L = new l0(downloadsViewModel4, 4);
                        qVar2.h0(L);
                    }
                    int i192 = i13 << 9;
                    u2.q qVar42 = qVar2;
                    DownloadsScreenUI(downloadsState2, d102, (ho.l) L, aVar3, lVar, aVar2, qVar42, (i192 & 57344) | (i192 & 7168) | 48 | ((i13 << 6) & 458752), 0);
                    aVar3 = aVar3;
                    qVar = qVar42;
                    Boolean valueOf2 = Boolean.valueOf(downloadsState2.getNavigateBack());
                    boolean h112 = qVar.h(downloadsState2);
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    }
                    z10 = h112 | z11;
                    L2 = qVar.L();
                    if (!z10 || L2 == eVar2) {
                        L2 = new DownloadsScreenKt$DownloadsScreen$3$1(downloadsState2, aVar3, null);
                        qVar.h0(L2);
                    }
                    u2.r.f((ho.p) L2, valueOf2, qVar);
                    downloadsViewModel3 = downloadsViewModel4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            qVar2 = qVar3;
            i13 = i12;
            downloadsViewModel4 = downloadsViewModel2;
            qVar2.q();
            DownloadsState downloadsState22 = (DownloadsState) u2.r.o(downloadsViewModel4.getStateFlow(), qVar2, 0).getValue();
            c3.j d1022 = c3.k.d(319151688, true, new s(pVar, 0), qVar2);
            h10 = qVar2.h(downloadsViewModel4);
            L = qVar2.L();
            u2.e eVar22 = u2.l.f33918a;
            if (!h10) {
            }
            L = new l0(downloadsViewModel4, 4);
            qVar2.h0(L);
            int i1922 = i13 << 9;
            u2.q qVar422 = qVar2;
            DownloadsScreenUI(downloadsState22, d1022, (ho.l) L, aVar3, lVar, aVar2, qVar422, (i1922 & 57344) | (i1922 & 7168) | 48 | ((i13 << 6) & 458752), 0);
            aVar3 = aVar3;
            qVar = qVar422;
            Boolean valueOf22 = Boolean.valueOf(downloadsState22.getNavigateBack());
            boolean h1122 = qVar.h(downloadsState22);
            if ((i13 & 14) == 4) {
            }
            z10 = h1122 | z11;
            L2 = qVar.L();
            if (!z10) {
            }
            L2 = new DownloadsScreenKt$DownloadsScreen$3$1(downloadsState22, aVar3, null);
            qVar.h0(L2);
            u2.r.f((ho.p) L2, valueOf22, qVar);
            downloadsViewModel3 = downloadsViewModel4;
        } else {
            qVar = qVar3;
            qVar.R();
            downloadsViewModel3 = downloadsViewModel2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(aVar3, lVar, pVar, aVar2, downloadsViewModel3, i10, i11);
        }
    }

    public static final sn.z DownloadsScreen$lambda$0(ho.p pVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            float m2357getX5D9Ej5fM = ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM();
            boolean f10 = qVar.f(pVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new k(pVar, 0);
                qVar.h0(L);
            }
            MiniPlayerKt.m1520MiniPlayerGSIvlCE(m2357getX5D9Ej5fM, false, 0L, (ho.l) L, null, qVar, 48, 20);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsScreen$lambda$0$0$0(ho.p pVar, String str) {
        str.getClass();
        pVar.invoke(str, Analytics.Event.PlayerActivationSource.Mini);
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsScreen$lambda$1$0(DownloadsViewModel downloadsViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(downloadsViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsScreen$lambda$3(ho.a aVar, ho.l lVar, ho.p pVar, ho.a aVar2, DownloadsViewModel downloadsViewModel, int i10, int i11, u2.m mVar, int i12) {
        DownloadsScreen(aVar, lVar, pVar, aVar2, downloadsViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DownloadsScreenUI(final DownloadsState downloadsState, ho.p pVar, final ho.l lVar, ho.a aVar, ho.l lVar2, ho.a aVar2, u2.m mVar, int i10, int i11) {
        int i12;
        ho.p pVar2;
        int i13;
        int i14;
        ho.a aVar3;
        int i15;
        int i16;
        ho.l lVar3;
        int i17;
        int i18;
        ho.a aVar4;
        int i19;
        boolean z6;
        u2.q qVar;
        ho.p pVar3;
        ho.a aVar5;
        ho.l lVar4;
        ho.a aVar6;
        r1 r10;
        final ho.p pVar4;
        boolean z10;
        boolean z11;
        int i20;
        int i21;
        downloadsState.getClass();
        lVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1933788956);
        if ((i10 & 6) == 0) {
            if (qVar2.h(downloadsState)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            pVar2 = pVar;
            if (qVar2.h(pVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i10 & 384) == 0) {
                if (qVar2.h(lVar)) {
                    i20 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i20 = 128;
                }
                i12 |= i20;
            }
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                aVar3 = aVar;
                if (qVar2.h(aVar3)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 16;
                if (i16 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    lVar3 = lVar2;
                    if (qVar2.h(lVar3)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 32;
                    if (i18 == 0) {
                        i12 |= 196608;
                    } else if ((196608 & i10) == 0) {
                        aVar4 = aVar2;
                        if (qVar2.h(aVar4)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                        if ((74899 & i12) != 74898) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar2.O(i12 & 1, z6)) {
                            if (i22 != 0) {
                                pVar4 = ComposableSingletons$DownloadsScreenKt.INSTANCE.getLambda$1624366846$app_productionRelease();
                            } else {
                                pVar4 = pVar2;
                            }
                            u2.e eVar = u2.l.f33918a;
                            if (i14 != 0) {
                                Object L = qVar2.L();
                                if (L == eVar) {
                                    L = new d(23);
                                    qVar2.h0(L);
                                }
                                aVar3 = (ho.a) L;
                            }
                            if (i16 != 0) {
                                Object L2 = qVar2.L();
                                if (L2 == eVar) {
                                    L2 = new w(16);
                                    qVar2.h0(L2);
                                }
                                lVar3 = (ho.l) L2;
                            }
                            if (i18 != 0) {
                                Object L3 = qVar2.L();
                                if (L3 == eVar) {
                                    L3 = new d(24);
                                    qVar2.h0(L3);
                                }
                                aVar4 = (ho.a) L3;
                            }
                            Object L4 = qVar2.L();
                            if (L4 == eVar) {
                                L4 = com.google.android.gms.internal.play_billing.b.t(0, qVar2);
                            }
                            final u2.x0 x0Var = (u2.x0) L4;
                            final float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(DownloadsScreenUI$lambda$4(x0Var), (u2.m) qVar2, 0);
                            String navigateToReadId = downloadsState.getNavigateToReadId();
                            boolean h10 = qVar2.h(downloadsState);
                            if ((i12 & 57344) == 16384) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            boolean z12 = z10 | h10;
                            if ((i12 & 896) == 256) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean z13 = z11 | z12;
                            Object L5 = qVar2.L();
                            if (z13 || L5 == eVar) {
                                L5 = new DownloadsScreenKt$DownloadsScreenUI$4$1(downloadsState, lVar3, lVar, null);
                                qVar2.h0(L5);
                            }
                            u2.r.f((ho.p) L5, navigateToReadId, qVar2);
                            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
                            int hashCode = Long.hashCode(qVar2.T);
                            c3.o l4 = qVar2.l();
                            i3.t c5 = i3.a.c(i3.q.f13017a, qVar2);
                            h4.h.f11920i.getClass();
                            h4.f fVar = h4.g.f11903b;
                            qVar2.b0();
                            if (qVar2.S) {
                                qVar2.k(fVar);
                            } else {
                                qVar2.k0();
                            }
                            u2.r.J(h4.g.f11907f, d10, qVar2);
                            u2.r.J(h4.g.f11906e, l4, qVar2);
                            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                            u2.r.F(h4.g.f11909h, qVar2);
                            u2.r.J(h4.g.f11905d, c5, qVar2);
                            c3.j d11 = c3.k.d(-1085656742, true, new o(0, aVar3), qVar2);
                            long d12 = ib.i.d(ElevenLabsTheme.INSTANCE, qVar2, ElevenLabsTheme.$stable);
                            final ho.a aVar7 = aVar4;
                            c3.j d13 = c3.k.d(-1950543569, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.p
                                @Override // ho.q
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    sn.z DownloadsScreenUI$lambda$7$1;
                                    int intValue = ((Integer) obj3).intValue();
                                    DownloadsScreenUI$lambda$7$1 = DownloadsScreenKt.DownloadsScreenUI$lambda$7$1(DownloadsState.this, aVar7, rememberPxToDp, lVar, x0Var, pVar4, (z1) obj, (u2.m) obj2, intValue);
                                    return DownloadsScreenUI$lambda$7$1;
                                }
                            }, qVar2);
                            aVar5 = aVar3;
                            k5.a(null, d11, null, null, null, 0, d12, 0L, null, d13, qVar2, 805306416, 445);
                            qVar = qVar2;
                            qVar.p(true);
                            ho.p pVar5 = pVar4;
                            aVar6 = aVar7;
                            pVar3 = pVar5;
                            lVar4 = lVar3;
                        } else {
                            qVar = qVar2;
                            qVar.R();
                            pVar3 = pVar2;
                            aVar5 = aVar3;
                            lVar4 = lVar3;
                            aVar6 = aVar4;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new io.elevenlabs.readerapp.ui.components.u0(downloadsState, pVar3, lVar, aVar5, lVar4, aVar6, i10, i11, 3);
                            return;
                        }
                        return;
                    }
                    aVar4 = aVar2;
                    if ((74899 & i12) != 74898) {
                    }
                    if (qVar2.O(i12 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                lVar3 = lVar2;
                i18 = i11 & 32;
                if (i18 == 0) {
                }
                aVar4 = aVar2;
                if ((74899 & i12) != 74898) {
                }
                if (qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            aVar3 = aVar;
            i16 = i11 & 16;
            if (i16 != 0) {
            }
            lVar3 = lVar2;
            i18 = i11 & 32;
            if (i18 == 0) {
            }
            aVar4 = aVar2;
            if ((74899 & i12) != 74898) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        pVar2 = pVar;
        if ((i10 & 384) == 0) {
        }
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        aVar3 = aVar;
        i16 = i11 & 16;
        if (i16 != 0) {
        }
        lVar3 = lVar2;
        i18 = i11 & 32;
        if (i18 == 0) {
        }
        aVar4 = aVar2;
        if ((74899 & i12) != 74898) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z DownloadsScreenUI$lambda$1$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    private static final int DownloadsScreenUI$lambda$4(u2.x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void DownloadsScreenUI$lambda$5(u2.x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final sn.z DownloadsScreenUI$lambda$7$0(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((i3.t) null, (String) null, c3.k.d(-1735722273, true, new u(0, aVar), qVar), (ho.q) null, (i3.f) null, qVar, 384, 27);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsScreenUI$lambda$7$0$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonWithBackgroundKt.BackButtonWithBackground(aVar, t2.u.P, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsScreenUI$lambda$7$1(final DownloadsState downloadsState, final ho.a aVar, final float f10, final ho.l lVar, final u2.x0 x0Var, final ho.p pVar, z1 z1Var, u2.m mVar, int i10) {
        final z1 z1Var2;
        int i11;
        boolean z6;
        DownloadsScreenState downloadsScreenState;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            z1Var2 = z1Var;
            if (((u2.q) mVar).f(z1Var2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            z1Var2 = z1Var;
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            if (downloadsState.isLoading()) {
                downloadsScreenState = DownloadsScreenState.Loading;
            } else if (downloadsState.getReads().isEmpty()) {
                downloadsScreenState = DownloadsScreenState.Empty;
            } else {
                downloadsScreenState = DownloadsScreenState.Content;
            }
            e2.f(downloadsScreenState, null, j1.e.s(0, 0, null, 7), null, c3.k.d(-1573597194, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.i
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    sn.z DownloadsScreenUI$lambda$7$1$0;
                    int intValue = ((Integer) obj3).intValue();
                    DownloadsScreenUI$lambda$7$1$0 = DownloadsScreenKt.DownloadsScreenUI$lambda$7$1$0(ho.a.this, z1Var2, f10, downloadsState, lVar, x0Var, pVar, (DownloadsScreenState) obj, (u2.m) obj2, intValue);
                    return DownloadsScreenUI$lambda$7$1$0;
                }
            }, qVar), qVar, 24960, 10);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsScreenUI$lambda$7$1$0(ho.a aVar, z1 z1Var, float f10, DownloadsState downloadsState, ho.l lVar, u2.x0 x0Var, ho.p pVar, DownloadsScreenState downloadsScreenState, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        i3.l lVar2 = i3.d.f12997a;
        downloadsScreenState.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).d(downloadsScreenState.ordinal())) {
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
            int i13 = WhenMappings.$EnumSwitchMapping$0[downloadsScreenState.ordinal()];
            i3.q qVar2 = i3.q.f13017a;
            r1.t tVar = r1.t.f29349a;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        qVar.X(534707575);
                        t1.z a10 = t1.b0.a(0, qVar, 3);
                        h5.m mVar2 = (h5.m) qVar.j(j1.f13135n);
                        i3.t d10 = p2.d(qVar2, 1.0f);
                        f4.f1 d11 = r1.p.d(lVar2, false);
                        int hashCode = Long.hashCode(qVar.T);
                        c3.o l4 = qVar.l();
                        i3.t c5 = i3.a.c(d10, qVar);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        h4.e eVar = h4.g.f11907f;
                        u2.r.J(eVar, d11, qVar);
                        h4.e eVar2 = h4.g.f11906e;
                        u2.r.J(eVar2, l4, qVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        h4.e eVar3 = h4.g.f11908g;
                        u2.r.y(qVar, valueOf, eVar3);
                        h4.d dVar = h4.g.f11909h;
                        u2.r.F(dVar, qVar);
                        h4.e eVar4 = h4.g.f11905d;
                        u2.r.J(eVar4, c5, qVar);
                        d2 d2Var = new d2(r1.d.m(z1Var, mVar2), z1Var.d(), r1.d.l(z1Var, mVar2), z1Var.a() + f10);
                        i3.t d12 = p2.d(qVar2, 1.0f);
                        boolean h10 = qVar.h(downloadsState) | qVar.f(lVar);
                        Object L = qVar.L();
                        u2.e eVar5 = u2.l.f33918a;
                        if (h10 || L == eVar5) {
                            L = new i1(downloadsState, lVar, 1);
                            qVar.h0(L);
                        }
                        rd.c1.c(d12, a10, d2Var, false, null, null, null, false, null, (ho.l) L, qVar, 6, 504);
                        i3.t I = r1.d.I(tVar.b(qVar2, i3.d.Z), t2.u.P, t2.u.P, t2.u.P, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2356getX4D9Ej5fM(), 7);
                        Object L2 = qVar.L();
                        if (L2 == eVar5) {
                            L2 = new m(x0Var, 0);
                            qVar.h0(L2);
                        }
                        i3.t q = f4.i0.q(I, (ho.l) L2);
                        f4.f1 d13 = r1.p.d(lVar2, false);
                        int hashCode2 = Long.hashCode(qVar.T);
                        c3.o l7 = qVar.l();
                        i3.t c10 = i3.a.c(q, qVar);
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(eVar, d13, qVar);
                        u2.r.J(eVar2, l7, qVar);
                        defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                        u2.r.J(eVar4, c10, qVar);
                        j0.c.r(0, pVar, qVar, true, true);
                        qVar.p(false);
                    } else {
                        throw com.google.android.gms.internal.play_billing.b.h(-398408320, qVar, false);
                    }
                } else {
                    qVar.X(534381982);
                    DownloadsEmptyState(aVar, qVar, 0, 0);
                    qVar.p(false);
                }
            } else {
                qVar.X(534140554);
                i3.t d14 = p2.d(qVar2, 1.0f);
                f4.f1 d15 = r1.p.d(lVar2, false);
                int hashCode3 = Long.hashCode(qVar.T);
                c3.o l10 = qVar.l();
                i3.t c11 = i3.a.c(d14, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar2);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, d15, qVar);
                u2.r.J(h4.g.f11906e, l10, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode3), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c11, qVar);
                LoaderKt.m1840LoadereopBjH0(tVar.b(qVar2, i3.d.f13001e), 0L, 0L, null, qVar, 0, 14);
                qVar.p(true);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsScreenUI$lambda$7$1$0$1$0$0(DownloadsState downloadsState, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new g(downloadsState, 0), true, 1284834235), 3);
        if (!downloadsState.getAvailableCategories().isEmpty()) {
            t1.t.c(tVar, null, null, new c3.j(new f(downloadsState, lVar, 1), true, 1117483584), 3);
        }
        final List<ReadMeta> filteredReads = downloadsState.getFilteredReads();
        final h hVar = new h(downloadsState, 0);
        ((t1.i) tVar).u(filteredReads.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$DownloadsScreenUI$lambda$7$1$0$1$0$0$$inlined$itemsIndexed$default$1
            public final Object invoke(int i10) {
                return ho.p.this.invoke(Integer.valueOf(i10), filteredReads.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$DownloadsScreenUI$lambda$7$1$0$1$0$0$$inlined$itemsIndexed$default$2
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                filteredReads.get(i10);
                return null;
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$DownloadsScreenUI$lambda$7$1$0$1$0$0$$inlined$itemsIndexed$default$3
            public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                int i12;
                boolean z6;
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
                    final ReadMeta readMeta = (ReadMeta) filteredReads.get(i10);
                    qVar.X(-188567945);
                    i3.q qVar2 = i3.q.f13017a;
                    i3.t a10 = t1.b.a(bVar, p2.e(qVar2, 1.0f), null, 7);
                    r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    i3.t c5 = i3.a.c(a10, qVar);
                    h4.h.f11920i.getClass();
                    ho.a aVar = h4.g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(aVar);
                    } else {
                        qVar.k0();
                    }
                    u2.r.J(h4.g.f11907f, a11, qVar);
                    u2.r.J(h4.g.f11906e, l4, qVar);
                    u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                    u2.r.F(h4.g.f11909h, qVar);
                    u2.r.J(h4.g.f11905d, c5, qVar);
                    final ActionConfig actionConfig = new ActionConfig(io.elevenlabs.ui.R.drawable.close, kj.c.R(qVar, R.string.swipe_action_remove_download), ReaderColors.INSTANCE.m2449getRed5000d7_KjU(), false, false, 24, null);
                    final ho.l lVar2 = lVar;
                    ActionSpec actionSpec = SwipeToActionBoxKt.actionSpec(c3.k.d(1521389834, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$DownloadsScreenUI$5$2$1$2$1$1$4$1$actionSpec$1
                        public final void invoke(ActionSpecBuilder actionSpecBuilder, u2.m mVar2, int i15) {
                            boolean z10;
                            boolean h10;
                            int i16;
                            actionSpecBuilder.getClass();
                            if ((i15 & 6) == 0) {
                                if ((i15 & 8) == 0) {
                                    h10 = ((u2.q) mVar2).f(actionSpecBuilder);
                                } else {
                                    h10 = ((u2.q) mVar2).h(actionSpecBuilder);
                                }
                                if (h10) {
                                    i16 = 4;
                                } else {
                                    i16 = 2;
                                }
                                i15 |= i16;
                            }
                            if ((i15 & 19) != 18) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u2.q qVar3 = (u2.q) mVar2;
                            if (qVar3.O(i15 & 1, z10)) {
                                boolean h11 = qVar3.h(ActionConfig.this) | qVar3.f(lVar2) | qVar3.h(readMeta);
                                final ActionConfig actionConfig2 = ActionConfig.this;
                                final ho.l lVar3 = lVar2;
                                final ReadMeta readMeta2 = readMeta;
                                Object L = qVar3.L();
                                u2.e eVar = u2.l.f33918a;
                                if (h11 || L == eVar) {
                                    L = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$DownloadsScreenUI$5$2$1$2$1$1$4$1$actionSpec$1$1$1
                                        public final void invoke(ActionSpecBuilder.HandlerScope handlerScope) {
                                            handlerScope.getClass();
                                            ActionConfig actionConfig3 = ActionConfig.this;
                                            final ho.l lVar4 = lVar3;
                                            final ReadMeta readMeta3 = readMeta2;
                                            handlerScope.handledBy(actionConfig3, new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$DownloadsScreenUI$5$2$1$2$1$1$4$1$actionSpec$1$1$1.1
                                                /* renamed from: invoke, reason: collision with other method in class */
                                                public final void m1209invoke() {
                                                    ho.l lVar5 = ho.l.this;
                                                    final ReadMeta readMeta4 = readMeta3;
                                                    lVar5.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt.DownloadsScreenUI.5.2.1.2.1.1.4.1.actionSpec.1.1.1.1.1
                                                        public final void invoke(DownloadsViewModel downloadsViewModel) {
                                                            downloadsViewModel.getClass();
                                                            downloadsViewModel.removeDownload(ReadMeta.this);
                                                        }

                                                        @Override // ho.l
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                            invoke((DownloadsViewModel) obj);
                                                            return sn.z.f31622a;
                                                        }
                                                    });
                                                }

                                                @Override // ho.a
                                                public /* bridge */ /* synthetic */ Object invoke() {
                                                    m1209invoke();
                                                    return sn.z.f31622a;
                                                }
                                            });
                                        }

                                        @Override // ho.l
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((ActionSpecBuilder.HandlerScope) obj);
                                            return sn.z.f31622a;
                                        }
                                    };
                                    qVar3.h0(L);
                                }
                                actionSpecBuilder.handlers((ho.l) L);
                                boolean h12 = qVar3.h(ActionConfig.this);
                                final ActionConfig actionConfig3 = ActionConfig.this;
                                Object L2 = qVar3.L();
                                if (h12 || L2 == eVar) {
                                    L2 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$DownloadsScreenUI$5$2$1$2$1$1$4$1$actionSpec$1$2$1
                                        public final void invoke(ActionSpecBuilder.PlacementScope placementScope) {
                                            placementScope.getClass();
                                            placementScope.setStartSide(ig.f.H(ActionConfig.this));
                                        }

                                        @Override // ho.l
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((ActionSpecBuilder.PlacementScope) obj);
                                            return sn.z.f31622a;
                                        }
                                    };
                                    qVar3.h0(L2);
                                }
                                actionSpecBuilder.placement((ho.l) L2);
                                return;
                            }
                            qVar3.R();
                        }

                        @Override // ho.q
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((ActionSpecBuilder) obj, (u2.m) obj2, ((Number) obj3).intValue());
                            return sn.z.f31622a;
                        }
                    }, qVar), qVar, 6);
                    String title = readMeta.getTitle();
                    boolean f10 = qVar.f(lVar) | qVar.h(readMeta);
                    Object L = qVar.L();
                    if (f10 || L == u2.l.f33918a) {
                        final ho.l lVar3 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$DownloadsScreenUI$5$2$1$2$1$1$4$1$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1208invoke() {
                                ho.l lVar4 = ho.l.this;
                                final ReadMeta readMeta2 = readMeta;
                                lVar4.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$DownloadsScreenUI$5$2$1$2$1$1$4$1$1$1.1
                                    public final void invoke(DownloadsViewModel downloadsViewModel) {
                                        downloadsViewModel.getClass();
                                        downloadsViewModel.onReadClicked(ReadMeta.this.getReadId());
                                    }

                                    @Override // ho.l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((DownloadsViewModel) obj);
                                        return sn.z.f31622a;
                                    }
                                });
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1208invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    SwipeToActionBoxKt.SwipeToActionBox(title, null, (ho.a) L, actionSpec, null, null, c3.k.d(-589649749, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$DownloadsScreenUI$5$2$1$2$1$1$4$1$2
                        public final void invoke(u2.m mVar2, int i15) {
                            boolean z10;
                            if ((i15 & 3) != 2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u2.q qVar3 = (u2.q) mVar2;
                            if (qVar3.O(i15 & 1, z10)) {
                                ReadMetaRowKt.ReadMetaRow(ReadMeta.this, l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar3, ElevenLabsTheme.$stable), p3.h0.f26395b), qVar3, 0, 0);
                                return;
                            }
                            qVar3.R();
                        }

                        @Override // ho.p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((u2.m) obj, ((Number) obj2).intValue());
                            return sn.z.f31622a;
                        }
                    }, qVar), qVar, 1572864, 50);
                    DividerKt.m1828DividerLightiJQMabo(p2.e(qVar2, 1.0f), 0L, qVar, 6, 2);
                    qVar.p(true);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return sn.z.f31622a;
            }
        }, true, 2039820996));
        t1.t.c(tVar, null, null, ComposableSingletons$DownloadsScreenKt.INSTANCE.getLambda$1724260836$app_productionRelease(), 3);
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsScreenUI$lambda$7$1$0$1$0$0$0(DownloadsState downloadsState, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            DownloadsHeader(downloadsState, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsScreenUI$lambda$7$1$0$1$0$0$1(DownloadsState downloadsState, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            List<String> availableCategories = downloadsState.getAvailableCategories();
            Filter selectedFilter = downloadsState.getSelectedFilter();
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new l0(lVar, 5);
                qVar.h0(L);
            }
            CategoriesTabs(availableCategories, selectedFilter, (ho.l) L, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsScreenUI$lambda$7$1$0$1$0$0$1$0$0(ho.l lVar, Filter filter) {
        filter.getClass();
        lVar.invoke(new l(filter, 0));
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsScreenUI$lambda$7$1$0$1$0$0$1$0$0$0(Filter filter, DownloadsViewModel downloadsViewModel) {
        downloadsViewModel.getClass();
        downloadsViewModel.selectCategory(filter);
        return sn.z.f31622a;
    }

    public static final Object DownloadsScreenUI$lambda$7$1$0$1$0$0$2(DownloadsState downloadsState, int i10, ReadMeta readMeta) {
        readMeta.getClass();
        int i11 = 0;
        List<ReadMeta> subList = downloadsState.getFilteredReads().subList(0, i10);
        if (subList == null || !subList.isEmpty()) {
            Iterator<T> it = subList.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.m.c(((ReadMeta) it.next()).getReadId(), readMeta.getReadId()) && (i11 = i11 + 1) < 0) {
                    ig.f.T();
                    throw null;
                }
            }
        }
        return readMeta.getReadId() + ":" + i11;
    }

    public static final sn.z DownloadsScreenUI$lambda$7$1$0$1$1$0(u2.x0 x0Var, h5.l lVar) {
        DownloadsScreenUI$lambda$5(x0Var, (int) (lVar.f12092a & 4294967295L));
        return sn.z.f31622a;
    }

    public static final sn.z DownloadsScreenUI$lambda$8(DownloadsState downloadsState, ho.p pVar, ho.l lVar, ho.a aVar, ho.l lVar2, ho.a aVar2, int i10, int i11, u2.m mVar, int i12) {
        DownloadsScreenUI(downloadsState, pVar, lVar, aVar, lVar2, aVar2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void MockDownloadItems(i3.t tVar, u2.m mVar, int i10, int i11) {
        i3.t tVar2;
        int i12;
        int i13;
        boolean z6;
        u2.q qVar;
        i3.t tVar3;
        SwipeAnchor swipeAnchor;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(63638881);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        boolean z10 = false;
        if ((i12 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i12 & 1, z6)) {
            i3.q qVar3 = i3.q.f13017a;
            if (i14 != 0) {
                tVar3 = qVar3;
            } else {
                tVar3 = tVar2;
            }
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                ReadMeta readMeta = EMPTY_STATE_MOCK_ITEM_B;
                L = ig.f.I(readMeta, EMPTY_STATE_MOCK_ITEM_A, readMeta);
                qVar2.h0(L);
            }
            List list = (List) L;
            ActionSpec actionSpec = SwipeToActionBoxKt.actionSpec(c3.k.d(5110829, true, new g(new ActionConfig(io.elevenlabs.ui.R.drawable.download, kj.c.R(qVar2, R.string.swipe_action_download), ReaderColors.INSTANCE.m2372getBlue5000d7_KjU(), false, false, 24, null), 1), qVar2), qVar2, 6);
            Object L2 = qVar2.L();
            if (L2 == eVar) {
                L2 = new PointerInputEventHandler() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$MockDownloadItems$1$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$MockDownloadItems$1$1$1", f = "DownloadsScreen.kt", l = {477}, m = "invokeSuspend", v = 2)
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc4/b;", "Lsn/z;", "<anonymous>", "(Lc4/b;)V"}, k = 3, mv = {2, 3, 0})
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$MockDownloadItems$1$1$1, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends yn.h implements ho.p {
                        private /* synthetic */ Object L$0;
                        int label;

                        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                        }

                        @Override // yn.a
                        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // ho.p
                        public final Object invoke(c4.b bVar, wn.c<? super sn.z> cVar) {
                            return ((AnonymousClass1) create(bVar, cVar)).invokeSuspend(sn.z.f31622a);
                        }

                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0034 A[LOOP:0: B:6:0x002e->B:8:0x0034, LOOP_END] */
                        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Iterable] */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0023 -> B:5:0x0026). Please report as a decompilation issue!!! */
                        @Override // yn.a
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                            /*
                                r3 = this;
                                java.lang.Object r0 = r3.L$0
                                c4.b r0 = (c4.b) r0
                                int r1 = r3.label
                                r2 = 1
                                if (r1 == 0) goto L16
                                if (r1 != r2) goto Lf
                                sn.a.g(r4)
                                goto L26
                            Lf:
                                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                                com.google.protobuf.c6.x(r4)
                                r4 = 0
                                return r4
                            L16:
                                sn.a.g(r4)
                            L19:
                                r3.L$0 = r0
                                r3.label = r2
                                java.lang.Object r4 = c4.b.Y(r0, r3)
                                xn.a r1 = xn.a.f37986a
                                if (r4 != r1) goto L26
                                return r1
                            L26:
                                c4.m r4 = (c4.m) r4
                                java.lang.Object r4 = r4.f4713a
                                java.util.Iterator r4 = r4.iterator()
                            L2e:
                                boolean r1 = r4.hasNext()
                                if (r1 == 0) goto L19
                                java.lang.Object r1 = r4.next()
                                c4.v r1 = (c4.v) r1
                                r1.a()
                                goto L2e
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt$MockDownloadItems$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(c4.a0 a0Var, wn.c<? super sn.z> cVar) {
                        Object r02 = ((c4.q0) a0Var).r0(new AnonymousClass1(null), cVar);
                        if (r02 == xn.a.f37986a) {
                            return r02;
                        }
                        return sn.z.f31622a;
                    }
                };
                qVar2.h0(L2);
            }
            i3.t b10 = c4.l0.b(tVar3, sn.z.f31622a, (PointerInputEventHandler) L2);
            p3.w0 w0Var = p3.h0.f26395b;
            i3.t j4 = l1.n.j(1, ElevenLabsTheme.INSTANCE.getColor(qVar2, ElevenLabsTheme.$stable).getDivider().m2058getLightLine0d7_KjU(), alphaSolidAlphaGradientMask(m3.h.c(b10, w0Var)), w0Var);
            r1.x a10 = r1.w.a(r1.j.f29232e, i3.d.C0, qVar2, 54);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(j4, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar2, c5, h4.g.f11905d, -761780747, list);
            int i15 = 0;
            while (s10.hasNext()) {
                Object next = s10.next();
                int i16 = i15 + 1;
                if (i15 >= 0) {
                    ReadMeta readMeta2 = (ReadMeta) next;
                    i3.t e10 = p2.e(qVar3, 1.0f);
                    f4.f1 d10 = r1.p.d(i3.d.f12997a, z10);
                    int hashCode2 = Long.hashCode(qVar2.T);
                    c3.o l7 = qVar2.l();
                    i3.t c10 = i3.a.c(e10, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar2 = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar2);
                    } else {
                        qVar2.k0();
                    }
                    u2.r.J(h4.g.f11907f, d10, qVar2);
                    u2.r.J(h4.g.f11906e, l7, qVar2);
                    u2.r.y(qVar2, Integer.valueOf(hashCode2), h4.g.f11908g);
                    u2.r.F(h4.g.f11909h, qVar2);
                    u2.r.J(h4.g.f11905d, c10, qVar2);
                    if (i15 == 1) {
                        swipeAnchor = SwipeAnchor.StartPeeking;
                    } else {
                        swipeAnchor = SwipeAnchor.SettledAtCenter;
                    }
                    String title = readMeta2.getTitle();
                    Object L3 = qVar2.L();
                    if (L3 == eVar) {
                        L3 = new d(26);
                        qVar2.h0(L3);
                    }
                    c3.j d11 = c3.k.d(269587606, true, new h(readMeta2, 1), qVar2);
                    u2.q qVar4 = qVar2;
                    ActionSpec actionSpec2 = actionSpec;
                    SwipeToActionBoxKt.SwipeToActionBox(title, null, (ho.a) L3, actionSpec2, swipeAnchor, null, d11, qVar4, 1573248, 34);
                    qVar2 = qVar4;
                    DividerKt.m1828DividerLightiJQMabo(p2.e(qVar3, 1.0f), 0L, qVar2, 6, 2);
                    qVar4.p(true);
                    actionSpec = actionSpec2;
                    i15 = i16;
                    eVar = eVar;
                    z10 = false;
                } else {
                    ig.f.U();
                    throw null;
                }
            }
            qVar = qVar2;
            qVar.p(z10);
            qVar.p(true);
        } else {
            qVar = qVar2;
            qVar.R();
            tVar3 = tVar2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new t(tVar3, i10, i11, 0);
        }
    }

    public static final sn.z MockDownloadItems$lambda$1(final ActionConfig actionConfig, ActionSpecBuilder actionSpecBuilder, u2.m mVar, int i10) {
        boolean z6;
        boolean h10;
        int i11;
        actionSpecBuilder.getClass();
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = ((u2.q) mVar).f(actionSpecBuilder);
            } else {
                h10 = ((u2.q) mVar).h(actionSpecBuilder);
            }
            if (h10) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h11 = qVar.h(actionConfig);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (h11 || L == eVar) {
                final int i12 = 0;
                L = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.n
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        sn.z MockDownloadItems$lambda$1$0$0;
                        sn.z MockDownloadItems$lambda$1$1$0;
                        switch (i12) {
                            case 0:
                                MockDownloadItems$lambda$1$0$0 = DownloadsScreenKt.MockDownloadItems$lambda$1$0$0(actionConfig, (ActionSpecBuilder.HandlerScope) obj);
                                return MockDownloadItems$lambda$1$0$0;
                            default:
                                MockDownloadItems$lambda$1$1$0 = DownloadsScreenKt.MockDownloadItems$lambda$1$1$0(actionConfig, (ActionSpecBuilder.PlacementScope) obj);
                                return MockDownloadItems$lambda$1$1$0;
                        }
                    }
                };
                qVar.h0(L);
            }
            actionSpecBuilder.handlers((ho.l) L);
            boolean h12 = qVar.h(actionConfig);
            Object L2 = qVar.L();
            if (h12 || L2 == eVar) {
                final int i13 = 1;
                L2 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.n
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        sn.z MockDownloadItems$lambda$1$0$0;
                        sn.z MockDownloadItems$lambda$1$1$0;
                        switch (i13) {
                            case 0:
                                MockDownloadItems$lambda$1$0$0 = DownloadsScreenKt.MockDownloadItems$lambda$1$0$0(actionConfig, (ActionSpecBuilder.HandlerScope) obj);
                                return MockDownloadItems$lambda$1$0$0;
                            default:
                                MockDownloadItems$lambda$1$1$0 = DownloadsScreenKt.MockDownloadItems$lambda$1$1$0(actionConfig, (ActionSpecBuilder.PlacementScope) obj);
                                return MockDownloadItems$lambda$1$1$0;
                        }
                    }
                };
                qVar.h0(L2);
            }
            actionSpecBuilder.placement((ho.l) L2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z MockDownloadItems$lambda$1$0$0(ActionConfig actionConfig, ActionSpecBuilder.HandlerScope handlerScope) {
        handlerScope.getClass();
        handlerScope.handledBy(actionConfig, new d(22));
        return sn.z.f31622a;
    }

    public static final sn.z MockDownloadItems$lambda$1$1$0(ActionConfig actionConfig, ActionSpecBuilder.PlacementScope placementScope) {
        placementScope.getClass();
        placementScope.setStartSide(ig.f.H(actionConfig));
        return sn.z.f31622a;
    }

    public static final sn.z MockDownloadItems$lambda$3$0$0$1(ReadMeta readMeta, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMetaRowKt.ReadMetaRow(readMeta, l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), p3.h0.f26395b), qVar, 0, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z MockDownloadItems$lambda$4(i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        MockDownloadItems(tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_DownloadsEmptyState(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2145394784);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$DownloadsScreenKt.INSTANCE.getLambda$1245552842$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 11);
        }
    }

    public static final sn.z Preview_DownloadsEmptyState$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_DownloadsEmptyState(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_DownloadsScreen_AllReadsOnly(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-841193355);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List stubReadMetaList$default = ReadsFactoryKt.stubReadMetaList$default(3, null, 2, null);
            ArrayList arrayList = new ArrayList(tn.p.a0(stubReadMetaList$default, 10));
            Iterator it = stubReadMetaList$default.iterator();
            while (it.hasNext()) {
                copy = r12.copy((r84 & 1) != 0 ? r12.articleImageUrl : null, (r84 & 2) != 0 ? r12.author : null, (r84 & 4) != 0 ? r12.chapters : null, (r84 & 8) != 0 ? r12.charCount : 0L, (r84 & 16) != 0 ? r12.createdAt : null, (r84 & 32) != 0 ? r12.updatedAt : null, (r84 & 64) != 0 ? r12.addedAt : null, (r84 & 128) != 0 ? r12.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r12.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r12.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r12.source : null, (r84 & 2048) != 0 ? r12.title : null, (r84 & 4096) != 0 ? r12.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r12.url : null, (r84 & 16384) != 0 ? r12.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r12.originalFileType : null, (r84 & 65536) != 0 ? r12.hasOriginalAudio : false, (r84 & 131072) != 0 ? r12.matureContent : false, (r84 & 262144) != 0 ? r12.origin : null, (r84 & 524288) != 0 ? r12.contentType : null, (r84 & 1048576) != 0 ? r12.genre : tn.t.f33547a, (r84 & 2097152) != 0 ? r12.isBookType : false, (r84 & 4194304) != 0 ? r12.fromUserImport : false, (r84 & 8388608) != 0 ? r12.rating : null, (r84 & 16777216) != 0 ? r12.userRating : null, (r84 & 33554432) != 0 ? r12.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r12.creationStatus : null, (r84 & 134217728) != 0 ? r12.creationProgress : null, (r84 & 268435456) != 0 ? r12.isArchived : false, (r84 & 536870912) != 0 ? r12.markedAsUnread : false, (r84 & 1073741824) != 0 ? r12.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r12.publicationDate : null, (r85 & 1) != 0 ? r12.language : null, (r85 & 2) != 0 ? r12.publisherProfileId : null, (r85 & 4) != 0 ? r12.canDelete : false, (r85 & 8) != 0 ? r12.androidProductId : null, (r85 & 16) != 0 ? r12.isPaid : false, (r85 & 32) != 0 ? r12.offlineReadData : null, (r85 & 64) != 0 ? r12.previewAudio : null, (r85 & 128) != 0 ? r12.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r12.voiceSelectionConfig : null, (r85 & 512) != 0 ? r12.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r12.displayMode : null, (r85 & 2048) != 0 ? r12.inUserLibrary : false, (r85 & 4096) != 0 ? r12.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r12.audioType : null, (r85 & 16384) != 0 ? r12.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r12.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r12.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r12.audioDurationSeconds : null, (r85 & 262144) != 0 ? r12.audioTypes : null, (r85 & 524288) != 0 ? r12.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r12.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r12.coverImageUrls : null, (r85 & 4194304) != 0 ? r12.coverAspectRatio : null, (r85 & 8388608) != 0 ? ((ReadMeta) it.next()).blurPlaceholder : null);
                arrayList.add(copy);
            }
            DownloadsState downloadsState = new DownloadsState(LibraryScreenKt.downloadsCollection("Downloaded"), false, arrayList, Filter.AllReads.INSTANCE, null, false, 48, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new w(14);
                qVar.h0(L);
            }
            DownloadsScreenUI(downloadsState, null, (ho.l) L, null, null, null, qVar, 384, 58);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 9);
        }
    }

    public static final sn.z Preview_DownloadsScreen_AllReadsOnly$lambda$1$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_DownloadsScreen_AllReadsOnly$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_DownloadsScreen_AllReadsOnly(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_DownloadsScreen_Empty(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-818545398);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            DownloadsState downloadsState = new DownloadsState(LibraryScreenKt.downloadsCollection("Downloaded"), false, tn.t.f33547a, null, null, false, 56, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new w(11);
                qVar.h0(L);
            }
            DownloadsScreenUI(downloadsState, null, (ho.l) L, null, null, null, qVar, 384, 58);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 7);
        }
    }

    public static final sn.z Preview_DownloadsScreen_Empty$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_DownloadsScreen_Empty$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_DownloadsScreen_Empty(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_DownloadsScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(862203259);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            DownloadsState downloadsState = new DownloadsState(LibraryScreenKt.downloadsCollection("Downloaded"), true, null, null, null, false, 60, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new w(15);
                qVar.h0(L);
            }
            DownloadsScreenUI(downloadsState, null, (ho.l) L, null, null, null, qVar, 384, 58);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 10);
        }
    }

    public static final sn.z Preview_DownloadsScreen_Loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_DownloadsScreen_Loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_DownloadsScreen_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_DownloadsScreen_MultipleItems(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1403583719);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            DownloadsState downloadsState = new DownloadsState(LibraryScreenKt.downloadsCollection("Downloaded"), false, createReadsWithGenres(3, ig.f.I(ig.f.I("Fiction", "Fantasy"), ig.f.I("Science", "Technology"), ig.f.I("Mystery", "Thriller"))), Filter.AllReads.INSTANCE, null, false, 48, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new w(10);
                qVar.h0(L);
            }
            DownloadsScreenUI(downloadsState, null, (ho.l) L, null, null, null, qVar, 384, 58);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 6);
        }
    }

    public static final sn.z Preview_DownloadsScreen_MultipleItems$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_DownloadsScreen_MultipleItems$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_DownloadsScreen_MultipleItems(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_DownloadsScreen_SingleItem(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1619648222);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            DownloadsState downloadsState = new DownloadsState(LibraryScreenKt.downloadsCollection("Downloaded"), false, createReadsWithGenres(1, ig.f.H(ig.f.I("Fiction", "Science Fiction"))), Filter.AllReads.INSTANCE, null, false, 48, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new w(17);
                qVar.h0(L);
            }
            DownloadsScreenUI(downloadsState, null, (ho.l) L, null, null, null, qVar, 384, 58);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 5);
        }
    }

    public static final sn.z Preview_DownloadsScreen_SingleItem$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_DownloadsScreen_SingleItem$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_DownloadsScreen_SingleItem(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_DownloadsScreen_WithCategories(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1764642757);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            DownloadsState downloadsState = new DownloadsState(LibraryScreenKt.downloadsCollection("Downloaded"), false, createReadsWithGenres(3, ig.f.I(ig.f.I("Fiction", "Fantasy"), ig.f.I("Science", "Technology"), ig.f.I("Fiction", "Mystery"))), new Filter.Category("Fiction"), null, false, 48, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new w(12);
                qVar.h0(L);
            }
            DownloadsScreenUI(downloadsState, null, (ho.l) L, null, null, null, qVar, 384, 58);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 8);
        }
    }

    public static final sn.z Preview_DownloadsScreen_WithCategories$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_DownloadsScreen_WithCategories$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_DownloadsScreen_WithCategories(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final i3.t alphaSolidAlphaGradientMask(i3.t tVar) {
        return m3.h.g(tVar, new w(13));
    }

    public static final sn.z alphaSolidAlphaGradientMask$lambda$0(r3.c cVar) {
        cVar.getClass();
        long j4 = p3.x.f26431f;
        long b10 = p3.x.b(t2.u.P, j4);
        long b11 = p3.x.b(1.0f, j4);
        p3.n0 c5 = p3.s.c(p3.t.Companion, (sn.k[]) Arrays.copyOf(new sn.k[]{new sn.k(Float.valueOf(t2.u.P), new p3.x(b10)), new sn.k(Float.valueOf(0.1f), new p3.x(b10)), new sn.k(Float.valueOf(0.4f), new p3.x(b11)), new sn.k(Float.valueOf(0.6f), new p3.x(b11)), new sn.k(Float.valueOf(0.9f), new p3.x(b10)), new sn.k(Float.valueOf(1.0f), new p3.x(b10))}, 6));
        h4.k0 k0Var = (h4.k0) cVar;
        Canvas a10 = p3.c.a(k0Var.f11967a.f29421b.y());
        int saveLayer = a10.saveLayer(null, null);
        k0Var.a();
        r3.e.m(cVar, c5, 0L, 0L, t2.u.P, null, null, 6, 62);
        a10.restoreToCount(saveLayer);
        return sn.z.f31622a;
    }

    private static final List<ReadMeta> createReadsWithGenres(int i10, List<? extends List<String>> list) {
        ReadMeta copy;
        List stubReadMetaList$default = ReadsFactoryKt.stubReadMetaList$default(i10, null, 2, null);
        ArrayList arrayList = new ArrayList(tn.p.a0(stubReadMetaList$default, 10));
        int i11 = 0;
        for (Object obj : stubReadMetaList$default) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                copy = r6.copy((r84 & 1) != 0 ? r6.articleImageUrl : null, (r84 & 2) != 0 ? r6.author : null, (r84 & 4) != 0 ? r6.chapters : null, (r84 & 8) != 0 ? r6.charCount : 0L, (r84 & 16) != 0 ? r6.createdAt : null, (r84 & 32) != 0 ? r6.updatedAt : null, (r84 & 64) != 0 ? r6.addedAt : null, (r84 & 128) != 0 ? r6.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r6.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r6.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r6.source : null, (r84 & 2048) != 0 ? r6.title : null, (r84 & 4096) != 0 ? r6.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r6.url : null, (r84 & 16384) != 0 ? r6.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r6.originalFileType : null, (r84 & 65536) != 0 ? r6.hasOriginalAudio : false, (r84 & 131072) != 0 ? r6.matureContent : false, (r84 & 262144) != 0 ? r6.origin : null, (r84 & 524288) != 0 ? r6.contentType : null, (r84 & 1048576) != 0 ? r6.genre : list.get(i11 % list.size()), (r84 & 2097152) != 0 ? r6.isBookType : false, (r84 & 4194304) != 0 ? r6.fromUserImport : false, (r84 & 8388608) != 0 ? r6.rating : null, (r84 & 16777216) != 0 ? r6.userRating : null, (r84 & 33554432) != 0 ? r6.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r6.creationStatus : null, (r84 & 134217728) != 0 ? r6.creationProgress : null, (r84 & 268435456) != 0 ? r6.isArchived : false, (r84 & 536870912) != 0 ? r6.markedAsUnread : false, (r84 & 1073741824) != 0 ? r6.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r6.publicationDate : null, (r85 & 1) != 0 ? r6.language : null, (r85 & 2) != 0 ? r6.publisherProfileId : null, (r85 & 4) != 0 ? r6.canDelete : false, (r85 & 8) != 0 ? r6.androidProductId : null, (r85 & 16) != 0 ? r6.isPaid : false, (r85 & 32) != 0 ? r6.offlineReadData : null, (r85 & 64) != 0 ? r6.previewAudio : null, (r85 & 128) != 0 ? r6.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r6.voiceSelectionConfig : null, (r85 & 512) != 0 ? r6.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r6.displayMode : null, (r85 & 2048) != 0 ? r6.inUserLibrary : false, (r85 & 4096) != 0 ? r6.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r6.audioType : null, (r85 & 16384) != 0 ? r6.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r6.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r6.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r6.audioDurationSeconds : null, (r85 & 262144) != 0 ? r6.audioTypes : null, (r85 & 524288) != 0 ? r6.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r6.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r6.coverImageUrls : null, (r85 & 4194304) != 0 ? r6.coverAspectRatio : null, (r85 & 8388608) != 0 ? ((ReadMeta) obj).blurPlaceholder : null);
                arrayList.add(copy);
                i11 = i12;
            } else {
                ig.f.U();
                throw null;
            }
        }
        return arrayList;
    }

    public static final ReadMeta getEMPTY_STATE_MOCK_ITEM_A() {
        return EMPTY_STATE_MOCK_ITEM_A;
    }
}

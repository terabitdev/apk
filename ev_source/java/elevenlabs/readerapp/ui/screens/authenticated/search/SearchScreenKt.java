package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import a2.u0;
import android.gov.nist.javax.sip.parser.TokenNames;
import c3.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import i1.j2;
import i3.t;
import id.c0;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.SearchResult;
import io.elevenlabs.domain.model.SearchSection;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.CollectionMetaRowKt;
import io.elevenlabs.readerapp.ui.components.ReadMetaRowKt;
import io.elevenlabs.readerapp.ui.components.o0;
import io.elevenlabs.readerapp.ui.components.q0;
import io.elevenlabs.readerapp.ui.previews.ExploreFactoryKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.u;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.CachedAsyncImageKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.ErrorContainerKt;
import io.elevenlabs.ui.components.InputSearchKt;
import io.elevenlabs.ui.components.MenuKt;
import io.elevenlabs.ui.components.SearchButtonKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import n3.v;
import p3.h0;
import q2.j7;
import q2.k5;
import r1.i1;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p;
import r1.p2;
import r1.s;
import r1.w;
import r1.x;
import r1.z1;
import rd.c1;
import sn.z;
import t1.b0;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\u001a\u008f\u0001\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a¹\u0001\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132 \b\u0002\u0010\u0015\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a%\u0010$\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b$\u0010%\u001a\u0087\u0001\u0010.\u001a\u00020\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\"\u001a\u00020)2\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010+\u001a\u00020*2\u001e\u0010\u0015\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060,H\u0003¢\u0006\u0004\b.\u0010/\u001a;\u00105\u001a\u00020\u00032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b5\u00106\u001a\u000f\u00107\u001a\u00020\u0003H\u0007¢\u0006\u0004\b7\u00108\u001a\u000f\u00109\u001a\u00020\u0003H\u0007¢\u0006\u0004\b9\u00108\u001a\u000f\u0010:\u001a\u00020\u0003H\u0007¢\u0006\u0004\b:\u00108\u001a\u000f\u0010;\u001a\u00020\u0003H\u0007¢\u0006\u0004\b;\u00108\u001a\u000f\u0010<\u001a\u00020\u0003H\u0007¢\u0006\u0004\b<\u00108\"\u0014\u0010=\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010?\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\f\u0010@\u001a\u0002008\nX\u008a\u0084\u0002²\u0006\u000e\u0010A\u001a\u0002008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010A\u001a\u0002008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010A\u001a\u0002008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010A\u001a\u0002008\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchCorpus;", "corpus", "Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lkotlin/Function1;", "", "onNavigateToLibraryRead", "onNavigateToExploreCollection", "onNavigateToExploreRead", "onNavigateToDeeplink", "Li1/j2;", "sharedTransitionScope", "Li1/o;", "animatedContentScope", "Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchViewModel;", "vm", "SearchScreen", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchCorpus;Lho/a;Lho/l;Lho/l;Lho/l;Lho/l;Li1/j2;Li1/o;Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "SearchScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchState;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/a;Li1/j2;Li1/o;Lu2/m;II)V", "Lio/elevenlabs/domain/model/SearchSection;", "item", "", FirebaseAnalytics.Param.INDEX, "getSearchSectionUniqueKey", "(Lio/elevenlabs/domain/model/SearchSection;I)Ljava/lang/String;", "title", "SectionHeader", "(Ljava/lang/String;Lu2/m;I)V", "Lio/elevenlabs/domain/model/SearchSection$GenericItem;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onPress", "GenericItemRow", "(Lio/elevenlabs/domain/model/SearchSection$GenericItem;Lho/a;Lu2/m;I)V", "", "Lio/elevenlabs/domain/model/MediaItemState;", "playerQueue", "Lio/elevenlabs/domain/model/SearchSection$SearchList;", "Ljava/util/Date;", "now", "", "exploreReadsInLibrary", "SearchListColumn", "(Ljava/util/List;Lio/elevenlabs/domain/model/SearchSection$SearchList;Lho/l;Lho/l;Ljava/util/Date;Lho/l;Ljava/util/Set;Lu2/m;II)V", "", "isInQueue", "expanded", "onDismiss", "onClickAddOrRemoveFromQueue", "ReadPlayerQueueMenu", "(ZZLho/a;Lho/a;Lu2/m;I)V", "Preview_SearchScreen_Library_Idle", "(Lu2/m;I)V", "Preview_SearchScreen_Explore_Idle", "Preview_SearchScreen_Both_Results", "Preview_SearchScreen_Both_Error", "Preview_SearchScreen_Both_EmptyStates", "MAX_QUERY_LENGTH", TokenNames.I, "query", "hasReachedEnd", "menuExpanded", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SearchScreenKt {
    private static final int MAX_QUERY_LENGTH = 40;

    public static final void GenericItemRow(SearchSection.GenericItem genericItem, ho.a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        q qVar = (q) mVar;
        qVar.Z(-1083256265);
        if ((i10 & 6) == 0) {
            if (qVar.h(genericItem)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
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
            ButtonContainerKt.m1780ButtonContainer83mGB3Q(genericItem.getTitle(), aVar, null, 0L, false, 0, null, false, null, c3.k.d(299515091, true, new g(genericItem, 2), qVar), qVar, (i11 & 112) | 805306368, 508);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(genericItem, aVar, i10, 20);
        }
    }

    public static final z GenericItemRow$lambda$0(SearchSection.GenericItem genericItem, s sVar, m mVar, int i10) {
        boolean z6;
        h4.e eVar;
        h4.d dVar;
        h4.e eVar2;
        h4.f fVar;
        h4.e eVar3;
        h4.e eVar4;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t t10 = r1.d.t(p2.e(qVar2, 1.0f), i1.f29224a);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            t F = r1.d.F(t10, elevenLabsTheme.getSpacings(qVar, i11).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i11).m2356getX4D9Ej5fM());
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13004y0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(F, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar2);
            } else {
                qVar.k0();
            }
            h4.e eVar5 = h4.g.f11907f;
            r.J(eVar5, a10, qVar);
            h4.e eVar6 = h4.g.f11906e;
            r.J(eVar6, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar7 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar7);
            h4.d dVar2 = h4.g.f11909h;
            r.F(dVar2, qVar);
            h4.e eVar8 = h4.g.f11905d;
            r.J(eVar8, c5, qVar);
            t h10 = n.h(m3.h.c(p2.o(qVar2, 100), elevenLabsTheme.getShapes(qVar, i11).getMd()), elevenLabsTheme.getColor(qVar, i11).getBackground().m2004getReadCover0d7_KjU(), h0.f26395b);
            f1 d10 = p.d(i3.d.f13001e, false);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(h10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar2);
            } else {
                qVar.k0();
            }
            r.J(eVar5, d10, qVar);
            r.J(eVar6, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar7, qVar, dVar2);
            r.J(eVar8, c10, qVar);
            String image = genericItem.getImage();
            if (image == null || wq.n.m0(image)) {
                eVar = eVar6;
                dVar = dVar2;
                eVar2 = eVar7;
                fVar = fVar2;
                eVar3 = eVar5;
                eVar4 = eVar8;
                qVar.X(1158676473);
                qVar.p(false);
            } else {
                qVar.X(1158460248);
                eVar = eVar6;
                eVar2 = eVar7;
                dVar = dVar2;
                fVar = fVar2;
                eVar3 = eVar5;
                eVar4 = eVar8;
                CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(image, p2.d(qVar2, 1.0f), null, f4.q.f8839b, null, null, null, qVar, 3120, 116);
                qVar.p(false);
            }
            qVar.p(true);
            r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2355getX3D9Ej5fM()), qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            t c11 = p2.c(new m1(1.0f, true), 1.0f);
            x a11 = w.a(r1.j.f29232e, i3.d.B0, qVar, 6);
            int hashCode3 = Long.hashCode(qVar.T);
            o l10 = qVar.l();
            t c12 = i3.a.c(c11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar3, a11, qVar);
            r.J(eVar, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar2, qVar, dVar);
            r.J(eVar4, c12, qVar);
            j7.d(genericItem.getTitle(), null, defpackage.f.b(elevenLabsTheme, qVar, i11), 0L, null, 0L, null, 0L, 2, false, 3, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyMedium700(), qVar, 0, 24960, 110586);
            q qVar3 = qVar;
            String subtitle = genericItem.getSubtitle();
            if (subtitle != null && !wq.n.m0(subtitle)) {
                qVar3.X(-249391679);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar3, i11).m2350getX1D9Ej5fM()), qVar3);
                j7.d(subtitle, null, ib.i.w(elevenLabsTheme, qVar3, i11), 0L, null, 0L, null, 0L, 2, false, 3, 0, null, elevenLabsTheme.getTypo(qVar3, i11).getBodySmall500(), qVar3, 0, 24960, 110586);
                qVar3 = qVar3;
                qVar3.p(false);
            } else {
                qVar3.X(-248984215);
                qVar3.p(false);
            }
            String text = genericItem.getText();
            if (text != null && !wq.n.m0(text)) {
                qVar3.X(-248889851);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar3, i11).m2353getX2D9Ej5fM()), qVar3);
                q qVar4 = qVar3;
                j7.d(text, null, ib.i.w(elevenLabsTheme, qVar3, i11), 0L, null, 0L, null, 0L, 2, false, 3, 0, null, elevenLabsTheme.getTypo(qVar3, i11).getBodySmall500(), qVar4, 0, 24960, 110586);
                qVar3 = qVar4;
                qVar3.p(false);
            } else {
                qVar3.X(-248486231);
                qVar3.p(false);
            }
            qVar3.p(true);
            qVar3.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z GenericItemRow$lambda$1(SearchSection.GenericItem genericItem, ho.a aVar, int i10, m mVar, int i11) {
        GenericItemRow(genericItem, aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SearchScreen_Both_EmptyStates(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1880327996);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            SearchCorpus searchCorpus = SearchCorpus.BOTH;
            Date date = new Date(1729581652L);
            tn.t tVar = tn.t.f33547a;
            SearchScreenUI(new SearchState(searchCorpus, "no results query", false, tVar, false, 0, false, tVar, null, false, null, null, null, date, null, 24368, null), null, null, null, null, null, null, null, null, qVar, 0, 510);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 20);
        }
    }

    public static final z Preview_SearchScreen_Both_EmptyStates$lambda$0(int i10, m mVar, int i11) {
        Preview_SearchScreen_Both_EmptyStates(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SearchScreen_Both_Error(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1411161283);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            SearchScreenUI(new SearchState(SearchCorpus.BOTH, "test query", false, ReadsFactoryKt.stubReadMetaList$default(2, null, 2, null), false, 0, false, null, null, false, null, "Network error occurred", null, new Date(1729581652L), null, 22448, null), null, null, null, null, null, null, null, null, qVar, 0, 510);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 18);
        }
    }

    public static final z Preview_SearchScreen_Both_Error$lambda$0(int i10, m mVar, int i11) {
        Preview_SearchScreen_Both_Error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SearchScreen_Both_Results(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(428515605);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            SearchScreenUI(new SearchState(SearchCorpus.BOTH, null, false, ReadsFactoryKt.stubReadMetaList$default(3, null, 2, null), false, 0, false, ExploreFactoryKt.stubReadsExploreSearch(), null, false, null, null, null, new Date(1729581652L), null, 23842, null), null, null, null, null, null, null, null, null, qVar, 0, 510);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 19);
        }
    }

    public static final z Preview_SearchScreen_Both_Results$lambda$0(int i10, m mVar, int i11) {
        Preview_SearchScreen_Both_Results(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SearchScreen_Explore_Idle(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1323616013);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            SearchScreenUI(new SearchState(SearchCorpus.EXPLORE_ONLY, "", false, null, false, 0, false, null, null, false, null, null, null, new Date(1729581652L), null, 24572, null), null, null, null, null, null, null, null, null, qVar, 0, 510);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 22);
        }
    }

    public static final z Preview_SearchScreen_Explore_Idle$lambda$0(int i10, m mVar, int i11) {
        Preview_SearchScreen_Explore_Idle(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SearchScreen_Library_Idle(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-557292235);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            SearchScreenUI(new SearchState(SearchCorpus.LIBRARY_ONLY, "", false, null, false, 0, false, null, null, false, null, null, null, new Date(1729581652L), null, 24572, null), null, null, null, null, null, null, null, null, qVar, 0, 510);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 21);
        }
    }

    public static final z Preview_SearchScreen_Library_Idle$lambda$0(int i10, m mVar, int i11) {
        Preview_SearchScreen_Library_Idle(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void ReadPlayerQueueMenu(boolean z6, boolean z10, ho.a aVar, ho.a aVar2, m mVar, int i10) {
        int i11;
        boolean z11;
        ho.a aVar3;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(-63329750);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar2)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (qVar.O(i11 & 1, z11)) {
            int i16 = i11 >> 3;
            aVar3 = aVar;
            MenuKt.m1842MenuILWXrKs(z10, aVar3, null, (Float.floatToRawIntBits(ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2356getX4D9Ej5fM()) << 32) | (Float.floatToRawIntBits(0) & 4294967295L), null, ig.f.H(c3.k.d(-1270176038, true, new u0(aVar2, z6, 2), qVar)), qVar, (i16 & 14) | 196608 | (i16 & 112), 20);
            z12 = z10;
        } else {
            aVar3 = aVar;
            z12 = z10;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new o0(z6, z12, aVar3, aVar2, i10);
        }
    }

    public static final z ReadPlayerQueueMenu$lambda$0(ho.a aVar, boolean z6, m mVar, int i10) {
        boolean z10;
        int i11;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            if (z6) {
                i11 = R.string.menu_item_player_remove_from_queue;
            } else {
                i11 = R.string.menu_item_player_add_to_queue;
            }
            MenuKt.MenuItem(aVar, false, kj.c.R(qVar, i11), Integer.valueOf(io.elevenlabs.ui.R.drawable.playlist_add), false, false, qVar, 0, 50);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ReadPlayerQueueMenu$lambda$1(boolean z6, boolean z10, ho.a aVar, ho.a aVar2, int i10, m mVar, int i11) {
        ReadPlayerQueueMenu(z6, z10, aVar, aVar2, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchListColumn(List<MediaItemState> list, SearchSection.SearchList searchList, ho.l lVar, ho.l lVar2, Date date, ho.l lVar3, Set<String> set, m mVar, int i10, int i11) {
        int i12;
        ho.l lVar4;
        int i13;
        int i14;
        ho.l lVar5;
        int i15;
        boolean z6;
        ho.l lVar6;
        ho.l lVar7;
        r1 r10;
        final ho.l lVar8;
        ho.l lVar9;
        Iterator it;
        ho.l lVar10;
        final ho.l lVar11;
        Object obj;
        i3.q qVar;
        boolean z10;
        boolean z11;
        boolean z12;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        final Date date2 = date;
        q qVar2 = (q) mVar;
        qVar2.Z(-880477768);
        if ((i10 & 6) == 0) {
            if (qVar2.h(list)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(searchList)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        int i21 = i11 & 4;
        if (i21 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            lVar4 = lVar;
            if (qVar2.h(lVar4)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                lVar5 = lVar2;
                if (qVar2.h(lVar5)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                if ((i10 & 24576) == 0) {
                    if (qVar2.h(date2)) {
                        i18 = 16384;
                    } else {
                        i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) == 0) {
                    if (qVar2.h(lVar3)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((1572864 & i10) == 0) {
                    if (qVar2.h(set)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((599187 & i12) != 599186) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i12 & 1, z6)) {
                    Object obj2 = u2.l.f33918a;
                    if (i21 != 0) {
                        Object L = qVar2.L();
                        if (L == obj2) {
                            L = new i(6);
                            qVar2.h0(L);
                        }
                        lVar8 = (ho.l) L;
                    } else {
                        lVar8 = lVar4;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar2.L();
                        if (L2 == obj2) {
                            L2 = new i(7);
                            qVar2.h0(L2);
                        }
                        lVar9 = (ho.l) L2;
                    } else {
                        lVar9 = lVar5;
                    }
                    i3.q qVar3 = i3.q.f13017a;
                    t e10 = p2.e(qVar3, 1.0f);
                    x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
                    int hashCode = Long.hashCode(qVar2.T);
                    o l4 = qVar2.l();
                    t c5 = i3.a.c(e10, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    r.J(h4.g.f11907f, a10, qVar2);
                    r.J(h4.g.f11906e, l4, qVar2);
                    r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                    r.F(h4.g.f11909h, qVar2);
                    r.J(h4.g.f11905d, c5, qVar2);
                    boolean z13 = false;
                    SectionHeader(searchList.getTitle(), qVar2, 0);
                    qVar2.X(1610840513);
                    Iterator it2 = searchList.getSearches().iterator();
                    int i22 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i23 = i22 + 1;
                        if (i22 >= 0) {
                            SearchResult searchResult = (SearchResult) next;
                            if (searchResult instanceof SearchResult.Collection) {
                                qVar2.X(1080238266);
                                final SearchResult.Collection collection = (SearchResult.Collection) searchResult;
                                String title = collection.getCollection().getTitle();
                                it = it2;
                                if ((i12 & 896) == 256) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                boolean h10 = z12 | qVar2.h(searchResult);
                                Object L3 = qVar2.L();
                                if (h10 || L3 == obj2) {
                                    final int i24 = 0;
                                    L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.e
                                        @Override // ho.a
                                        public final Object invoke() {
                                            z SearchListColumn$lambda$2$0$0$0;
                                            z SearchListColumn$lambda$2$0$6$0;
                                            switch (i24) {
                                                case 0:
                                                    SearchListColumn$lambda$2$0$0$0 = SearchScreenKt.SearchListColumn$lambda$2$0$0$0(lVar8, (SearchResult.Collection) collection);
                                                    return SearchListColumn$lambda$2$0$0$0;
                                                default:
                                                    SearchListColumn$lambda$2$0$6$0 = SearchScreenKt.SearchListColumn$lambda$2$0$6$0(lVar8, (SearchResult.GlobalRead) collection);
                                                    return SearchListColumn$lambda$2$0$6$0;
                                            }
                                        }
                                    };
                                    qVar2.h0(L3);
                                }
                                c3.j d10 = c3.k.d(649491356, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.f
                                    @Override // ho.q
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        z SearchListColumn$lambda$2$0$1;
                                        int intValue = ((Integer) obj5).intValue();
                                        SearchListColumn$lambda$2$0$1 = SearchScreenKt.SearchListColumn$lambda$2$0$1(SearchResult.Collection.this, date2, (s) obj3, (m) obj4, intValue);
                                        return SearchListColumn$lambda$2$0$1;
                                    }
                                }, qVar2);
                                q qVar4 = qVar2;
                                obj = obj2;
                                lVar11 = lVar9;
                                lVar10 = lVar8;
                                qVar = qVar3;
                                ButtonContainerKt.m1780ButtonContainer83mGB3Q(title, (ho.a) L3, null, 0L, false, 0, null, false, null, d10, qVar4, 805306368, 508);
                                qVar2 = qVar4;
                                qVar2.p(false);
                            } else {
                                it = it2;
                                lVar10 = lVar8;
                                lVar11 = lVar9;
                                obj = obj2;
                                qVar = qVar3;
                                if (searchResult instanceof SearchResult.GlobalRead) {
                                    qVar2.X(-871931760);
                                    Object L4 = qVar2.L();
                                    if (L4 == obj) {
                                        L4 = r.A(Boolean.FALSE);
                                        qVar2.h0(L4);
                                    }
                                    z0 z0Var = (z0) L4;
                                    final SearchResult.GlobalRead globalRead = (SearchResult.GlobalRead) searchResult;
                                    boolean f10 = qVar2.f(globalRead) | qVar2.f(list);
                                    Object L5 = qVar2.L();
                                    if (f10 || L5 == obj) {
                                        if (list == null || !list.isEmpty()) {
                                            Iterator<T> it3 = list.iterator();
                                            while (it3.hasNext()) {
                                                if (kotlin.jvm.internal.m.c(((MediaItemState) it3.next()).getReadId(), globalRead.getRead().getReadId())) {
                                                    z10 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z10 = z13;
                                        L5 = Boolean.valueOf(z10);
                                        qVar2.h0(L5);
                                    }
                                    boolean booleanValue = ((Boolean) L5).booleanValue();
                                    String title2 = globalRead.getRead().getTitle();
                                    if ((i12 & 7168) == 2048) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    boolean h11 = z11 | qVar2.h(searchResult);
                                    Object L6 = qVar2.L();
                                    if (h11 || L6 == obj) {
                                        final int i25 = 1;
                                        L6 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.e
                                            @Override // ho.a
                                            public final Object invoke() {
                                                z SearchListColumn$lambda$2$0$0$0;
                                                z SearchListColumn$lambda$2$0$6$0;
                                                switch (i25) {
                                                    case 0:
                                                        SearchListColumn$lambda$2$0$0$0 = SearchScreenKt.SearchListColumn$lambda$2$0$0$0(lVar11, (SearchResult.Collection) globalRead);
                                                        return SearchListColumn$lambda$2$0$0$0;
                                                    default:
                                                        SearchListColumn$lambda$2$0$6$0 = SearchScreenKt.SearchListColumn$lambda$2$0$6$0(lVar11, (SearchResult.GlobalRead) globalRead);
                                                        return SearchListColumn$lambda$2$0$6$0;
                                                }
                                            }
                                        };
                                        qVar2.h0(L6);
                                    }
                                    ho.a aVar = (ho.a) L6;
                                    boolean h12 = qVar2.h(searchResult) | qVar2.h(set);
                                    Object L7 = qVar2.L();
                                    if (h12 || L7 == obj) {
                                        L7 = new c3.b(set, globalRead, z0Var, 28);
                                        qVar2.h0(L7);
                                    }
                                    q qVar5 = qVar2;
                                    ButtonContainerKt.m1780ButtonContainer83mGB3Q(title2, aVar, null, 0L, false, 0, null, false, (ho.a) L7, c3.k.d(851593605, true, new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.u(globalRead, booleanValue, lVar3, z0Var), qVar2), qVar5, 805306368, 252);
                                    qVar2 = qVar5;
                                    qVar2.p(false);
                                } else {
                                    throw com.google.android.gms.internal.play_billing.b.h(1080237766, qVar2, z13);
                                }
                            }
                            if (i22 != ig.f.y(searchList.getSearches())) {
                                qVar2.X(-870615841);
                                DividerKt.m1827DivideriJQMabo(r1.d.G(qVar, ElevenLabsTheme.INSTANCE.getSpacings(qVar2, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), t2.u.P, 2), 0L, qVar2, 0, 2);
                                z13 = false;
                                qVar2.p(false);
                            } else {
                                z13 = false;
                                qVar2.X(-870520702);
                                qVar2.p(false);
                            }
                            lVar9 = lVar11;
                            qVar3 = qVar;
                            obj2 = obj;
                            i22 = i23;
                            lVar8 = lVar10;
                            it2 = it;
                            date2 = date;
                        } else {
                            ig.f.U();
                            throw null;
                        }
                    }
                    ho.l lVar12 = lVar8;
                    qVar2.p(z13);
                    qVar2.p(true);
                    lVar7 = lVar9;
                    lVar6 = lVar12;
                } else {
                    qVar2.R();
                    lVar6 = lVar4;
                    lVar7 = lVar5;
                }
                r10 = qVar2.r();
                if (r10 != null) {
                    r10.f34012d = new fm.c(list, searchList, lVar6, lVar7, date, lVar3, set, i10, i11);
                    return;
                }
                return;
            }
            lVar5 = lVar2;
            if ((i10 & 24576) == 0) {
            }
            if ((196608 & i10) == 0) {
            }
            if ((1572864 & i10) == 0) {
            }
            if ((599187 & i12) != 599186) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar2.r();
            if (r10 != null) {
            }
        }
        lVar4 = lVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        lVar5 = lVar2;
        if ((i10 & 24576) == 0) {
        }
        if ((196608 & i10) == 0) {
        }
        if ((1572864 & i10) == 0) {
        }
        if ((599187 & i12) != 599186) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 != null) {
        }
    }

    public static final z SearchListColumn$lambda$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z SearchListColumn$lambda$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z SearchListColumn$lambda$2$0$0$0(ho.l lVar, SearchResult searchResult) {
        lVar.invoke(((SearchResult.Collection) searchResult).getCollection().getId());
        return z.f31622a;
    }

    public static final z SearchListColumn$lambda$2$0$1(SearchResult searchResult, Date date, s sVar, m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CollectionMetaRowKt.CollectionMetaRow(((SearchResult.Collection) searchResult).getCollection(), date, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    private static final boolean SearchListColumn$lambda$2$0$3(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void SearchListColumn$lambda$2$0$4(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z SearchListColumn$lambda$2$0$6$0(ho.l lVar, SearchResult searchResult) {
        lVar.invoke(((SearchResult.GlobalRead) searchResult).getRead().getReadId());
        return z.f31622a;
    }

    public static final z SearchListColumn$lambda$2$0$7$0(Set set, SearchResult searchResult, z0 z0Var) {
        if (set.contains(((SearchResult.GlobalRead) searchResult).getRead().getReadId())) {
            SearchListColumn$lambda$2$0$4(z0Var, true);
        }
        return z.f31622a;
    }

    public static final z SearchListColumn$lambda$2$0$8(SearchResult searchResult, boolean z6, ho.l lVar, z0 z0Var, s sVar, m mVar, int i10) {
        boolean z10;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            ReadMetaRowKt.ReadMetaRow(((SearchResult.GlobalRead) searchResult).getRead(), null, qVar, 0, 2);
            boolean SearchListColumn$lambda$2$0$3 = SearchListColumn$lambda$2$0$3(z0Var);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(z0Var, 2);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            boolean f10 = qVar.f(lVar) | qVar.h(searchResult);
            Object L2 = qVar.L();
            if (f10 || L2 == eVar) {
                L2 = new c3.b(lVar, z0Var, searchResult, 29);
                qVar.h0(L2);
            }
            ReadPlayerQueueMenu(z6, SearchListColumn$lambda$2$0$3, aVar, (ho.a) L2, qVar, 384);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SearchListColumn$lambda$2$0$8$0$0(z0 z0Var) {
        SearchListColumn$lambda$2$0$4(z0Var, false);
        return z.f31622a;
    }

    public static final z SearchListColumn$lambda$2$0$8$1$0(ho.l lVar, z0 z0Var, SearchResult searchResult) {
        SearchListColumn$lambda$2$0$4(z0Var, false);
        lVar.invoke(new k(searchResult, 3));
        return z.f31622a;
    }

    public static final z SearchListColumn$lambda$2$0$8$1$0$0(SearchResult searchResult, SearchViewModel searchViewModel) {
        searchViewModel.getClass();
        searchViewModel.onClickAddOrRemoveFromQueue(((SearchResult.GlobalRead) searchResult).getRead());
        return z.f31622a;
    }

    public static final z SearchListColumn$lambda$3(List list, SearchSection.SearchList searchList, ho.l lVar, ho.l lVar2, Date date, ho.l lVar3, Set set, int i10, int i11, m mVar, int i12) {
        SearchListColumn(list, searchList, lVar, lVar2, date, lVar3, set, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void SearchScreen(SearchCorpus searchCorpus, ho.a aVar, ho.l lVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, j2 j2Var, i1.o oVar, SearchViewModel searchViewModel, m mVar, int i10, int i11) {
        int i12;
        SearchViewModel searchViewModel2;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        searchCorpus.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        j2Var.getClass();
        oVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(2061780641);
        if ((i10 & 6) == 0) {
            if (qVar.d(searchCorpus.ordinal())) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i19 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i19 = 128;
            }
            i12 |= i19;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(lVar2)) {
                i18 = 2048;
            } else {
                i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i18;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(lVar3)) {
                i17 = 16384;
            } else {
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i17;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(lVar4)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((1572864 & i10) == 0) {
            if (qVar.f(j2Var)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i12 |= i15;
        }
        if ((12582912 & i10) == 0) {
            if (qVar.h(oVar)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i12 |= i14;
        }
        if ((100663296 & i10) == 0) {
            if ((i11 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                searchViewModel2 = searchViewModel;
                if (qVar.h(searchViewModel2)) {
                    i13 = 67108864;
                    i12 |= i13;
                }
            } else {
                searchViewModel2 = searchViewModel;
            }
            i13 = 33554432;
            i12 |= i13;
        } else {
            searchViewModel2 = searchViewModel;
        }
        boolean z10 = true;
        if ((38347923 & i12) != 38347922) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                    i12 &= -234881025;
                }
            } else if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    i12 &= -234881025;
                    searchViewModel2 = (SearchViewModel) gg.b.j0(e0.f20562a.b(SearchViewModel.class), a10, null, o6, cVar, qVar);
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            qVar.q();
            boolean h10 = qVar.h(searchViewModel2);
            if ((i12 & 14) != 4) {
                z10 = false;
            }
            boolean z11 = h10 | z10;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (z11 || L == eVar) {
                L = new SearchScreenKt$SearchScreen$1$1(searchViewModel2, searchCorpus, null);
                qVar.h0(L);
            }
            r.f((ho.p) L, searchCorpus, qVar);
            SearchState SearchScreen$lambda$1 = SearchScreen$lambda$1(r.o(searchViewModel2.getStateFlow(), qVar, 0));
            boolean h11 = qVar.h(searchViewModel2);
            Object L2 = qVar.L();
            if (h11 || L2 == eVar) {
                L2 = new h(searchViewModel2, 0);
                qVar.h0(L2);
            }
            int i22 = (524160 & i12) | ((i12 << 15) & 3670016);
            int i23 = i12 << 3;
            SearchScreenUI(SearchScreen$lambda$1, (ho.l) L2, lVar, lVar2, lVar3, lVar4, aVar, j2Var, oVar, qVar, i22 | (29360128 & i23) | (i23 & 234881024), 0);
        } else {
            qVar.R();
        }
        SearchViewModel searchViewModel3 = searchViewModel2;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.h(searchCorpus, aVar, lVar, lVar2, lVar3, lVar4, j2Var, oVar, searchViewModel3, i10, i11);
        }
    }

    private static final SearchState SearchScreen$lambda$1(s2 s2Var) {
        return (SearchState) s2Var.getValue();
    }

    public static final z SearchScreen$lambda$2$0(SearchViewModel searchViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(searchViewModel);
        return z.f31622a;
    }

    public static final z SearchScreen$lambda$3(SearchCorpus searchCorpus, ho.a aVar, ho.l lVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, j2 j2Var, i1.o oVar, SearchViewModel searchViewModel, int i10, int i11, m mVar, int i12) {
        SearchScreen(searchCorpus, aVar, lVar, lVar2, lVar3, lVar4, j2Var, oVar, searchViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchScreenUI(SearchState searchState, ho.l lVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.l lVar5, ho.a aVar, j2 j2Var, i1.o oVar, m mVar, int i10, int i11) {
        int i12;
        ho.l lVar6;
        int i13;
        int i14;
        ho.l lVar7;
        int i15;
        int i16;
        ho.l lVar8;
        int i17;
        int i18;
        ho.l lVar9;
        int i19;
        int i20;
        ho.l lVar10;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z6;
        q qVar;
        ho.a aVar2;
        i1.o oVar2;
        ho.l lVar11;
        ho.l lVar12;
        ho.l lVar13;
        ho.l lVar14;
        ho.l lVar15;
        j2 j2Var2;
        r1 r10;
        ho.a aVar3;
        j2 j2Var3;
        int i31;
        searchState.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-1853233181);
        if ((i10 & 6) == 0) {
            if (qVar2.h(searchState)) {
                i31 = 4;
            } else {
                i31 = 2;
            }
            i12 = i31 | i10;
        } else {
            i12 = i10;
        }
        int i32 = i11 & 2;
        if (i32 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            lVar6 = lVar;
            if (qVar2.h(lVar6)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                lVar7 = lVar2;
                if (qVar2.h(lVar7)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    lVar8 = lVar3;
                    if (qVar2.h(lVar8)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 16;
                    if (i18 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        lVar9 = lVar4;
                        if (qVar2.h(lVar9)) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i19;
                        i20 = i11 & 32;
                        if (i20 != 0) {
                            i12 |= 196608;
                        } else if ((196608 & i10) == 0) {
                            lVar10 = lVar5;
                            if (qVar2.h(lVar10)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i12 |= i21;
                            i22 = i11 & 64;
                            if (i22 == 0) {
                                i12 |= 1572864;
                            } else if ((i10 & 1572864) == 0) {
                                if (qVar2.h(aVar)) {
                                    i23 = 1048576;
                                } else {
                                    i23 = 524288;
                                }
                                i12 |= i23;
                            }
                            i24 = i11 & 128;
                            if (i24 == 0) {
                                i12 |= 12582912;
                            } else if ((i10 & 12582912) == 0) {
                                i25 = i24;
                                if (qVar2.f(j2Var)) {
                                    i26 = 8388608;
                                } else {
                                    i26 = 4194304;
                                }
                                i12 |= i26;
                                i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
                                if (i27 != 0) {
                                    i12 |= 100663296;
                                } else if ((i10 & 100663296) == 0) {
                                    i28 = i27;
                                    if (qVar2.h(oVar)) {
                                        i29 = 67108864;
                                    } else {
                                        i29 = 33554432;
                                    }
                                    i12 |= i29;
                                    i30 = i12;
                                    if ((i12 & 38347923) == 38347922) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (!qVar2.O(i30 & 1, z6)) {
                                        u2.e eVar = u2.l.f33918a;
                                        if (i32 != 0) {
                                            Object L = qVar2.L();
                                            if (L == eVar) {
                                                L = new i(1);
                                                qVar2.h0(L);
                                            }
                                            lVar6 = (ho.l) L;
                                        }
                                        if (i14 != 0) {
                                            Object L2 = qVar2.L();
                                            if (L2 == eVar) {
                                                L2 = new i(2);
                                                qVar2.h0(L2);
                                            }
                                            lVar7 = (ho.l) L2;
                                        }
                                        if (i16 != 0) {
                                            Object L3 = qVar2.L();
                                            if (L3 == eVar) {
                                                L3 = new i(3);
                                                qVar2.h0(L3);
                                            }
                                            lVar8 = (ho.l) L3;
                                        }
                                        if (i18 != 0) {
                                            Object L4 = qVar2.L();
                                            if (L4 == eVar) {
                                                L4 = new i(4);
                                                qVar2.h0(L4);
                                            }
                                            lVar9 = (ho.l) L4;
                                        }
                                        if (i20 != 0) {
                                            Object L5 = qVar2.L();
                                            if (L5 == eVar) {
                                                L5 = new i(5);
                                                qVar2.h0(L5);
                                            }
                                            lVar10 = (ho.l) L5;
                                        }
                                        if (i22 != 0) {
                                            Object L6 = qVar2.L();
                                            if (L6 == eVar) {
                                                L6 = new Object();
                                                qVar2.h0(L6);
                                            }
                                            aVar3 = (ho.a) L6;
                                        } else {
                                            aVar3 = aVar;
                                        }
                                        i1.o oVar3 = null;
                                        if (i25 != 0) {
                                            j2Var3 = null;
                                        } else {
                                            j2Var3 = j2Var;
                                        }
                                        if (i28 == 0) {
                                            oVar3 = oVar;
                                        }
                                        Object L7 = qVar2.L();
                                        if (L7 == eVar) {
                                            L7 = r.A(searchState.getQuery());
                                            qVar2.h0(L7);
                                        }
                                        ho.l lVar16 = lVar6;
                                        i1.o oVar4 = oVar3;
                                        j2 j2Var4 = j2Var3;
                                        ho.l lVar17 = lVar9;
                                        ho.l lVar18 = lVar10;
                                        qVar = qVar2;
                                        k5.a(null, c3.k.d(1272847079, true, new f2.o(lVar16, j2Var4, oVar4, (z0) L7, aVar3), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(999247730, true, new io.elevenlabs.readerapp.ui.screens.authenticated.account.q(lVar16, searchState, lVar8, lVar17, lVar18, lVar7), qVar2), qVar, 805306416, 509);
                                        aVar2 = aVar3;
                                        lVar11 = lVar6;
                                        lVar13 = lVar8;
                                        j2Var2 = j2Var4;
                                        lVar14 = lVar17;
                                        lVar12 = lVar7;
                                        lVar15 = lVar18;
                                        oVar2 = oVar4;
                                    } else {
                                        qVar = qVar2;
                                        qVar.R();
                                        aVar2 = aVar;
                                        oVar2 = oVar;
                                        lVar11 = lVar6;
                                        lVar12 = lVar7;
                                        lVar13 = lVar8;
                                        lVar14 = lVar9;
                                        lVar15 = lVar10;
                                        j2Var2 = j2Var;
                                    }
                                    r10 = qVar.r();
                                    if (r10 == null) {
                                        r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.h(searchState, lVar11, lVar12, lVar13, lVar14, lVar15, aVar2, j2Var2, oVar2, i10, i11);
                                        return;
                                    }
                                    return;
                                }
                                i28 = i27;
                                i30 = i12;
                                if ((i12 & 38347923) == 38347922) {
                                }
                                if (!qVar2.O(i30 & 1, z6)) {
                                }
                                r10 = qVar.r();
                                if (r10 == null) {
                                }
                            }
                            i25 = i24;
                            i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
                            if (i27 != 0) {
                            }
                            i28 = i27;
                            i30 = i12;
                            if ((i12 & 38347923) == 38347922) {
                            }
                            if (!qVar2.O(i30 & 1, z6)) {
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                            }
                        }
                        lVar10 = lVar5;
                        i22 = i11 & 64;
                        if (i22 == 0) {
                        }
                        i24 = i11 & 128;
                        if (i24 == 0) {
                        }
                        i25 = i24;
                        i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
                        if (i27 != 0) {
                        }
                        i28 = i27;
                        i30 = i12;
                        if ((i12 & 38347923) == 38347922) {
                        }
                        if (!qVar2.O(i30 & 1, z6)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    lVar9 = lVar4;
                    i20 = i11 & 32;
                    if (i20 != 0) {
                    }
                    lVar10 = lVar5;
                    i22 = i11 & 64;
                    if (i22 == 0) {
                    }
                    i24 = i11 & 128;
                    if (i24 == 0) {
                    }
                    i25 = i24;
                    i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
                    if (i27 != 0) {
                    }
                    i28 = i27;
                    i30 = i12;
                    if ((i12 & 38347923) == 38347922) {
                    }
                    if (!qVar2.O(i30 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                lVar8 = lVar3;
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                lVar9 = lVar4;
                i20 = i11 & 32;
                if (i20 != 0) {
                }
                lVar10 = lVar5;
                i22 = i11 & 64;
                if (i22 == 0) {
                }
                i24 = i11 & 128;
                if (i24 == 0) {
                }
                i25 = i24;
                i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i27 != 0) {
                }
                i28 = i27;
                i30 = i12;
                if ((i12 & 38347923) == 38347922) {
                }
                if (!qVar2.O(i30 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar7 = lVar2;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            lVar8 = lVar3;
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            lVar9 = lVar4;
            i20 = i11 & 32;
            if (i20 != 0) {
            }
            lVar10 = lVar5;
            i22 = i11 & 64;
            if (i22 == 0) {
            }
            i24 = i11 & 128;
            if (i24 == 0) {
            }
            i25 = i24;
            i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i27 != 0) {
            }
            i28 = i27;
            i30 = i12;
            if ((i12 & 38347923) == 38347922) {
            }
            if (!qVar2.O(i30 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        lVar6 = lVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        lVar7 = lVar2;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        lVar8 = lVar3;
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        lVar9 = lVar4;
        i20 = i11 & 32;
        if (i20 != 0) {
        }
        lVar10 = lVar5;
        i22 = i11 & 64;
        if (i22 == 0) {
        }
        i24 = i11 & 128;
        if (i24 == 0) {
        }
        i25 = i24;
        i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i27 != 0) {
        }
        i28 = i27;
        i30 = i12;
        if ((i12 & 38347923) == 38347922) {
        }
        if (!qVar2.O(i30 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z SearchScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z SearchScreenUI$lambda$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z SearchScreenUI$lambda$10(SearchState searchState, ho.l lVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.l lVar5, ho.a aVar, j2 j2Var, i1.o oVar, int i10, int i11, m mVar, int i12) {
        SearchScreenUI(searchState, lVar, lVar2, lVar3, lVar4, lVar5, aVar, j2Var, oVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final z SearchScreenUI$lambda$2$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z SearchScreenUI$lambda$3$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z SearchScreenUI$lambda$4$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    private static final String SearchScreenUI$lambda$7(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z SearchScreenUI$lambda$9$0(ho.l lVar, j2 j2Var, i1.o oVar, z0 z0Var, ho.a aVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions(r1.d.G(n.h(p2.e(i3.q.f13017a, 1.0f), ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b), t2.u.P, 4, 1), c3.k.d(1197128404, true, new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.e(lVar, j2Var, oVar, z0Var, 1), qVar), c3.k.d(1390952386, true, new g(aVar, 0), qVar), (ho.q) null, (i3.f) null, qVar, 432, 24);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SearchScreenUI$lambda$9$0$0(ho.l lVar, j2 j2Var, i1.o oVar, z0 z0Var, s sVar, m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        boolean O = qVar.O(i10 & 1, z6);
        z zVar = z.f31622a;
        if (O) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new v();
                qVar.h0(L);
            }
            v vVar = (v) L;
            String SearchScreenUI$lambda$7 = SearchScreenUI$lambda$7(z0Var);
            boolean f10 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f10 || L2 == eVar) {
                L2 = new l(lVar, z0Var, 3);
                qVar.h0(L2);
            }
            InputSearchKt.InputSearch(SearchScreenUI$lambda$7, (ho.l) L2, n3.d.j(SearchButtonKt.searchButtonSharedElement(i3.q.f13017a, j2Var, oVar, qVar, 6), vVar), kj.c.R(qVar, R.string.search_placeholder), qVar, 0, 0);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new SearchScreenKt$SearchScreenUI$7$1$1$2$1(vVar, null);
                qVar.h0(L3);
            }
            r.f((ho.p) L3, zVar, qVar);
            return zVar;
        }
        qVar.R();
        return zVar;
    }

    public static final z SearchScreenUI$lambda$9$0$0$1$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(wq.n.J0(40, str));
        lVar.invoke(new k(z0Var, 2));
        return z.f31622a;
    }

    public static final z SearchScreenUI$lambda$9$0$0$1$0$0(z0 z0Var, SearchViewModel searchViewModel) {
        searchViewModel.getClass();
        searchViewModel.onQueryChanged(SearchScreenUI$lambda$7(z0Var));
        return z.f31622a;
    }

    public static final z SearchScreenUI$lambda$9$0$1(ho.a aVar, l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonKt.BackButton(aVar, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SearchScreenUI$lambda$9$1(ho.l lVar, SearchState searchState, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.l lVar5, z1 z1Var, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(z1Var)) {
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
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            t1.z a10 = b0.a(0, qVar, 3);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = r.s(new d(a10, 0));
                qVar.h0(L);
            }
            s2 s2Var = (s2) L;
            Boolean valueOf = Boolean.valueOf(SearchScreenUI$lambda$9$1$1(s2Var));
            boolean f10 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f10 || L2 == eVar) {
                L2 = new SearchScreenKt$SearchScreenUI$7$2$1$1(lVar, s2Var, null);
                qVar.h0(L2);
            }
            r.f((ho.p) L2, valueOf, qVar);
            t d10 = p2.d(i3.q.f13017a, 1.0f);
            boolean h10 = qVar.h(searchState) | qVar.f(lVar) | qVar.f(lVar2) | qVar.f(lVar3) | qVar.f(lVar4) | qVar.f(lVar5);
            Object L3 = qVar.L();
            if (h10 || L3 == eVar) {
                c0 c0Var = new c0(searchState, lVar, lVar2, lVar3, lVar4, lVar5, 1);
                qVar.h0(c0Var);
                L3 = c0Var;
            }
            c1.c(d10, a10, z1Var, false, null, null, null, false, null, (ho.l) L3, qVar, ((i11 << 6) & 896) | 6, 504);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final boolean SearchScreenUI$lambda$9$1$1(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    public static final z SearchScreenUI$lambda$9$1$3$0(final SearchState searchState, final ho.l lVar, final ho.l lVar2, final ho.l lVar3, final ho.l lVar4, final ho.l lVar5, t1.t tVar) {
        boolean z6;
        boolean z10;
        tVar.getClass();
        boolean z11 = false;
        if (searchState.getQuery().length() == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (searchState.getLibraryResults().isEmpty() && searchState.getExploreResults().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        SearchCorpus corpus = searchState.getCorpus();
        SearchCorpus searchCorpus = SearchCorpus.EXPLORE_ONLY;
        if (((corpus != searchCorpus && searchState.isLibraryLoading()) || (searchState.getCorpus() != SearchCorpus.LIBRARY_ONLY && searchState.isExploreLoading())) && !z10) {
            t1.t.c(tVar, null, null, ComposableSingletons$SearchScreenKt.INSTANCE.getLambda$1815012418$app_productionRelease(), 3);
        }
        if (z6 && searchState.getCorpus() != SearchCorpus.LIBRARY_ONLY) {
            if (!searchState.getExploreResults().isEmpty()) {
                final List<SearchSection> exploreResults = searchState.getExploreResults();
                final a aVar = new a(5);
                ((t1.i) tVar).u(exploreResults.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$lambda$9$1$3$0$$inlined$itemsIndexed$default$1
                    public final Object invoke(int i10) {
                        return ho.p.this.invoke(Integer.valueOf(i10), exploreResults.get(i10));
                    }

                    @Override // ho.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }
                }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$lambda$9$1$3$0$$inlined$itemsIndexed$default$2
                    @Override // ho.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i10) {
                        exploreResults.get(i10);
                        return null;
                    }
                }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$lambda$9$1$3$0$$inlined$itemsIndexed$default$3
                    public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                        int i12;
                        boolean z12;
                        boolean z13;
                        int i13;
                        int i14;
                        if ((i11 & 6) == 0) {
                            if (((q) mVar).f(bVar)) {
                                i14 = 4;
                            } else {
                                i14 = 2;
                            }
                            i12 = i11 | i14;
                        } else {
                            i12 = i11;
                        }
                        if ((i11 & 48) == 0) {
                            if (((q) mVar).d(i10)) {
                                i13 = 32;
                            } else {
                                i13 = 16;
                            }
                            i12 |= i13;
                        }
                        if ((i12 & 147) != 146) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        q qVar = (q) mVar;
                        if (qVar.O(i12 & 1, z12)) {
                            final SearchSection searchSection = (SearchSection) exploreResults.get(i10);
                            qVar.X(-1518083990);
                            i3.q qVar2 = i3.q.f13017a;
                            t a10 = t1.b.a(bVar, p2.e(qVar2, 1.0f), null, 7);
                            x a11 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                            int hashCode = Long.hashCode(qVar.T);
                            o l4 = qVar.l();
                            t c5 = i3.a.c(a10, qVar);
                            h4.h.f11920i.getClass();
                            h4.f fVar = h4.g.f11903b;
                            qVar.b0();
                            if (qVar.S) {
                                qVar.k(fVar);
                            } else {
                                qVar.k0();
                            }
                            r.J(h4.g.f11907f, a11, qVar);
                            r.J(h4.g.f11906e, l4, qVar);
                            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                            r.F(h4.g.f11909h, qVar);
                            r.J(h4.g.f11905d, c5, qVar);
                            boolean z14 = searchSection instanceof SearchSection.Collection;
                            Object obj = u2.l.f33918a;
                            if (z14) {
                                qVar.X(-1093467810);
                                String title = ((SearchSection.Collection) searchSection).getCollection().getTitle();
                                boolean f10 = qVar.f(lVar) | qVar.h(searchSection) | qVar.f(lVar2);
                                Object L = qVar.L();
                                if (f10 || L == obj) {
                                    final ho.l lVar6 = lVar;
                                    final ho.l lVar7 = lVar2;
                                    L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$1$1
                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m1721invoke() {
                                            ho.l lVar8 = ho.l.this;
                                            final SearchSection searchSection2 = searchSection;
                                            lVar8.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$1$1.1
                                                public final void invoke(SearchViewModel searchViewModel) {
                                                    searchViewModel.getClass();
                                                    searchViewModel.onExploreCollectionClicked(((SearchSection.Collection) SearchSection.this).getCollection().getId());
                                                }

                                                @Override // ho.l
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SearchViewModel) obj2);
                                                    return z.f31622a;
                                                }
                                            });
                                            lVar7.invoke(((SearchSection.Collection) searchSection).getCollection().getId());
                                            ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$1$1.2
                                                @Override // ho.l
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SearchViewModel) obj2);
                                                    return z.f31622a;
                                                }

                                                public final void invoke(SearchViewModel searchViewModel) {
                                                    searchViewModel.getClass();
                                                    searchViewModel.logSearchResultClickExplore();
                                                }
                                            });
                                        }

                                        @Override // ho.a
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m1721invoke();
                                            return z.f31622a;
                                        }
                                    };
                                    qVar.h0(L);
                                }
                                final SearchState searchState2 = searchState;
                                ButtonContainerKt.m1780ButtonContainer83mGB3Q(title, (ho.a) L, null, 0L, false, 0, null, false, null, c3.k.d(-1664259061, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$2
                                    public final void invoke(s sVar, m mVar2, int i15) {
                                        boolean z15;
                                        sVar.getClass();
                                        if ((i15 & 17) != 16) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        q qVar3 = (q) mVar2;
                                        if (qVar3.O(i15 & 1, z15)) {
                                            CollectionMetaRowKt.CollectionMetaRow(((SearchSection.Collection) SearchSection.this).getCollection(), searchState2.getNow(), qVar3, 0);
                                        } else {
                                            qVar3.R();
                                        }
                                    }

                                    @Override // ho.q
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                        invoke((s) obj2, (m) obj3, ((Number) obj4).intValue());
                                        return z.f31622a;
                                    }
                                }, qVar), qVar, 805306368, 508);
                                qVar = qVar;
                                qVar.p(false);
                            } else if (searchSection instanceof SearchSection.GlobalRead) {
                                qVar.X(463123542);
                                Object L2 = qVar.L();
                                if (L2 == obj) {
                                    L2 = r.A(Boolean.FALSE);
                                    qVar.h0(L2);
                                }
                                final z0 z0Var = (z0) L2;
                                boolean f11 = qVar.f(searchState.getPlayerQueue()) | qVar.f(searchSection);
                                Object L3 = qVar.L();
                                if (f11 || L3 == obj) {
                                    List<MediaItemState> playerQueue = searchState.getPlayerQueue();
                                    if (playerQueue == null || !playerQueue.isEmpty()) {
                                        Iterator<T> it = playerQueue.iterator();
                                        while (it.hasNext()) {
                                            if (kotlin.jvm.internal.m.c(((MediaItemState) it.next()).getReadId(), ((SearchSection.GlobalRead) searchSection).getRead().getReadId())) {
                                                z13 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z13 = false;
                                    L3 = Boolean.valueOf(z13);
                                    qVar.h0(L3);
                                }
                                final boolean booleanValue = ((Boolean) L3).booleanValue();
                                String title2 = ((SearchSection.GlobalRead) searchSection).getRead().getTitle();
                                boolean f12 = qVar.f(lVar) | qVar.h(searchSection) | qVar.f(lVar3);
                                Object L4 = qVar.L();
                                if (f12 || L4 == obj) {
                                    final ho.l lVar8 = lVar;
                                    final ho.l lVar9 = lVar3;
                                    L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$3$1
                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m1722invoke() {
                                            ho.l lVar10 = ho.l.this;
                                            final SearchSection searchSection2 = searchSection;
                                            lVar10.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$3$1.1
                                                public final void invoke(SearchViewModel searchViewModel) {
                                                    searchViewModel.getClass();
                                                    searchViewModel.onExploreReadClicked(((SearchSection.GlobalRead) SearchSection.this).getRead().getReadId());
                                                }

                                                @Override // ho.l
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SearchViewModel) obj2);
                                                    return z.f31622a;
                                                }
                                            });
                                            lVar9.invoke(((SearchSection.GlobalRead) searchSection).getRead().getReadId());
                                            ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$3$1.2
                                                @Override // ho.l
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SearchViewModel) obj2);
                                                    return z.f31622a;
                                                }

                                                public final void invoke(SearchViewModel searchViewModel) {
                                                    searchViewModel.getClass();
                                                    searchViewModel.logSearchResultClickExplore();
                                                }
                                            });
                                        }

                                        @Override // ho.a
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m1722invoke();
                                            return z.f31622a;
                                        }
                                    };
                                    qVar.h0(L4);
                                }
                                ho.a aVar2 = (ho.a) L4;
                                boolean h10 = qVar.h(searchState) | qVar.h(searchSection);
                                Object L5 = qVar.L();
                                if (h10 || L5 == obj) {
                                    final SearchState searchState3 = searchState;
                                    L5 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$4$1
                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m1723invoke() {
                                            if (SearchState.this.getExploreReadsInLibrary().contains(((SearchSection.GlobalRead) searchSection).getRead().getReadId())) {
                                                SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$1$0$3(z0Var, true);
                                            }
                                        }

                                        @Override // ho.a
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m1723invoke();
                                            return z.f31622a;
                                        }
                                    };
                                    qVar.h0(L5);
                                }
                                final ho.l lVar10 = lVar;
                                ButtonContainerKt.m1780ButtonContainer83mGB3Q(title2, aVar2, null, 0L, false, 0, null, false, (ho.a) L5, c3.k.d(-1974299980, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$5
                                    public final void invoke(s sVar, m mVar2, int i15) {
                                        boolean z15;
                                        boolean SearchScreenUI$lambda$9$1$3$0$1$0$2;
                                        sVar.getClass();
                                        if ((i15 & 17) != 16) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        q qVar3 = (q) mVar2;
                                        if (qVar3.O(i15 & 1, z15)) {
                                            ReadMetaRowKt.PublicReadMetaRow(((SearchSection.GlobalRead) SearchSection.this).getRead(), null, null, false, false, qVar3, 0, 30);
                                            boolean z16 = booleanValue;
                                            SearchScreenUI$lambda$9$1$3$0$1$0$2 = SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$1$0$2(z0Var);
                                            final z0 z0Var2 = z0Var;
                                            Object L6 = qVar3.L();
                                            u2.e eVar = u2.l.f33918a;
                                            if (L6 == eVar) {
                                                L6 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$5$1$1
                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m1724invoke() {
                                                        SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$1$0$3(z0.this, false);
                                                    }

                                                    @Override // ho.a
                                                    public /* bridge */ /* synthetic */ Object invoke() {
                                                        m1724invoke();
                                                        return z.f31622a;
                                                    }
                                                };
                                                qVar3.h0(L6);
                                            }
                                            ho.a aVar3 = (ho.a) L6;
                                            boolean f13 = qVar3.f(lVar10) | qVar3.h(SearchSection.this);
                                            final ho.l lVar11 = lVar10;
                                            final z0 z0Var3 = z0Var;
                                            final SearchSection searchSection2 = SearchSection.this;
                                            Object L7 = qVar3.L();
                                            if (f13 || L7 == eVar) {
                                                L7 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$5$2$1
                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m1725invoke() {
                                                        SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$1$0$3(z0Var3, false);
                                                        ho.l lVar12 = ho.l.this;
                                                        final SearchSection searchSection3 = searchSection2;
                                                        lVar12.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$5$2$1.1
                                                            public final void invoke(SearchViewModel searchViewModel) {
                                                                searchViewModel.getClass();
                                                                searchViewModel.onClickAddOrRemoveFromQueue(((SearchSection.GlobalRead) SearchSection.this).getRead());
                                                            }

                                                            @Override // ho.l
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                invoke((SearchViewModel) obj2);
                                                                return z.f31622a;
                                                            }
                                                        });
                                                    }

                                                    @Override // ho.a
                                                    public /* bridge */ /* synthetic */ Object invoke() {
                                                        m1725invoke();
                                                        return z.f31622a;
                                                    }
                                                };
                                                qVar3.h0(L7);
                                            }
                                            SearchScreenKt.ReadPlayerQueueMenu(z16, SearchScreenUI$lambda$9$1$3$0$1$0$2, aVar3, (ho.a) L7, qVar3, 384);
                                            return;
                                        }
                                        qVar3.R();
                                    }

                                    @Override // ho.q
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                        invoke((s) obj2, (m) obj3, ((Number) obj4).intValue());
                                        return z.f31622a;
                                    }
                                }, qVar), qVar, 805306368, 252);
                                qVar = qVar;
                                qVar.p(false);
                            } else if (searchSection instanceof SearchSection.SearchList) {
                                qVar.X(465283653);
                                SearchSection.SearchList searchList = (SearchSection.SearchList) searchSection;
                                Date now = searchState.getNow();
                                List<MediaItemState> playerQueue2 = searchState.getPlayerQueue();
                                Set<String> exploreReadsInLibrary = searchState.getExploreReadsInLibrary();
                                boolean f13 = qVar.f(lVar) | qVar.f(lVar2);
                                Object L6 = qVar.L();
                                if (f13 || L6 == obj) {
                                    final ho.l lVar11 = lVar;
                                    final ho.l lVar12 = lVar2;
                                    L6 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$6$1
                                        public final void invoke(final String str) {
                                            str.getClass();
                                            ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$6$1.1
                                                public final void invoke(SearchViewModel searchViewModel) {
                                                    searchViewModel.getClass();
                                                    searchViewModel.onExploreCollectionClicked(str);
                                                }

                                                @Override // ho.l
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SearchViewModel) obj2);
                                                    return z.f31622a;
                                                }
                                            });
                                            lVar12.invoke(str);
                                            ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$6$1.2
                                                @Override // ho.l
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SearchViewModel) obj2);
                                                    return z.f31622a;
                                                }

                                                public final void invoke(SearchViewModel searchViewModel) {
                                                    searchViewModel.getClass();
                                                    searchViewModel.logSearchResultClickExplore();
                                                }
                                            });
                                        }

                                        @Override // ho.l
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            invoke((String) obj2);
                                            return z.f31622a;
                                        }
                                    };
                                    qVar.h0(L6);
                                }
                                ho.l lVar13 = (ho.l) L6;
                                boolean f14 = qVar.f(lVar) | qVar.f(lVar3);
                                Object L7 = qVar.L();
                                if (f14 || L7 == obj) {
                                    final ho.l lVar14 = lVar;
                                    final ho.l lVar15 = lVar3;
                                    L7 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$7$1
                                        public final void invoke(final String str) {
                                            str.getClass();
                                            ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$7$1.1
                                                public final void invoke(SearchViewModel searchViewModel) {
                                                    searchViewModel.getClass();
                                                    searchViewModel.onExploreReadClicked(str);
                                                }

                                                @Override // ho.l
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SearchViewModel) obj2);
                                                    return z.f31622a;
                                                }
                                            });
                                            lVar15.invoke(str);
                                            ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$7$1.2
                                                @Override // ho.l
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SearchViewModel) obj2);
                                                    return z.f31622a;
                                                }

                                                public final void invoke(SearchViewModel searchViewModel) {
                                                    searchViewModel.getClass();
                                                    searchViewModel.logSearchResultClickExplore();
                                                }
                                            });
                                        }

                                        @Override // ho.l
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            invoke((String) obj2);
                                            return z.f31622a;
                                        }
                                    };
                                    qVar.h0(L7);
                                }
                                SearchScreenKt.SearchListColumn(playerQueue2, searchList, lVar13, (ho.l) L7, now, lVar, exploreReadsInLibrary, qVar, 0, 0);
                                qVar = qVar;
                                qVar.p(false);
                            } else if (searchSection instanceof SearchSection.GenericItem) {
                                qVar.X(-1093332649);
                                SearchSection.GenericItem genericItem = (SearchSection.GenericItem) searchSection;
                                boolean f15 = qVar.f(lVar) | qVar.h(searchSection) | qVar.f(lVar4);
                                Object L8 = qVar.L();
                                if (f15 || L8 == obj) {
                                    final ho.l lVar16 = lVar;
                                    final ho.l lVar17 = lVar4;
                                    L8 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$8$1
                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m1726invoke() {
                                            ho.l lVar18 = ho.l.this;
                                            final SearchSection searchSection2 = searchSection;
                                            lVar18.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$8$1.1
                                                public final void invoke(SearchViewModel searchViewModel) {
                                                    searchViewModel.getClass();
                                                    searchViewModel.onExploreGenericItemClicked(((SearchSection.GenericItem) SearchSection.this).getDeeplink());
                                                }

                                                @Override // ho.l
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SearchViewModel) obj2);
                                                    return z.f31622a;
                                                }
                                            });
                                            lVar17.invoke(((SearchSection.GenericItem) searchSection).getDeeplink());
                                            ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$2$1$8$1.2
                                                @Override // ho.l
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SearchViewModel) obj2);
                                                    return z.f31622a;
                                                }

                                                public final void invoke(SearchViewModel searchViewModel) {
                                                    searchViewModel.getClass();
                                                    searchViewModel.logSearchResultClickExplore();
                                                }
                                            });
                                        }

                                        @Override // ho.a
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m1726invoke();
                                            return z.f31622a;
                                        }
                                    };
                                    qVar.h0(L8);
                                }
                                SearchScreenKt.GenericItemRow(genericItem, (ho.a) L8, qVar, 0);
                                qVar.p(false);
                            } else {
                                throw com.google.android.gms.internal.play_billing.b.h(-1093466380, qVar, false);
                            }
                            DividerKt.m1827DivideriJQMabo(r1.d.G(qVar2, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), t2.u.P, 2), 0L, qVar, 0, 2);
                            qVar.p(true);
                            qVar.p(false);
                            return;
                        }
                        qVar.R();
                    }

                    @Override // ho.r
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                        return z.f31622a;
                    }
                }, true, 2039820996));
            }
            if (searchState.getExploreHasMore() && !searchState.getExploreResults().isEmpty()) {
                t1.t.c(tVar, null, null, ComposableSingletons$SearchScreenKt.INSTANCE.getLambda$1223047961$app_productionRelease(), 3);
            }
        } else {
            if (searchState.getCorpus() != searchCorpus) {
                if (searchState.getCorpus() == SearchCorpus.LIBRARY_ONLY && !searchState.isLibraryLoading() && searchState.getLibraryResults().isEmpty() && searchState.getQuery().length() > 0) {
                    z11 = true;
                }
                if (!searchState.getLibraryResults().isEmpty() || z11) {
                    t1.t.c(tVar, null, null, ComposableSingletons$SearchScreenKt.INSTANCE.m1720getLambda$1546757108$app_productionRelease(), 3);
                }
                if (!searchState.getLibraryResults().isEmpty()) {
                    final List<ReadMeta> libraryResults = searchState.getLibraryResults();
                    final a aVar2 = new a(6);
                    ((t1.i) tVar).u(libraryResults.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$lambda$9$1$3$0$$inlined$itemsIndexed$default$4
                        public final Object invoke(int i10) {
                            return ho.p.this.invoke(Integer.valueOf(i10), libraryResults.get(i10));
                        }

                        @Override // ho.l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Number) obj).intValue());
                        }
                    }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$lambda$9$1$3$0$$inlined$itemsIndexed$default$5
                        @Override // ho.l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Number) obj).intValue());
                        }

                        public final Object invoke(int i10) {
                            libraryResults.get(i10);
                            return null;
                        }
                    }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$lambda$9$1$3$0$$inlined$itemsIndexed$default$6
                        public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                            int i12;
                            boolean z12;
                            boolean z13;
                            int i13;
                            int i14;
                            if ((i11 & 6) == 0) {
                                if (((q) mVar).f(bVar)) {
                                    i14 = 4;
                                } else {
                                    i14 = 2;
                                }
                                i12 = i11 | i14;
                            } else {
                                i12 = i11;
                            }
                            if ((i11 & 48) == 0) {
                                if (((q) mVar).d(i10)) {
                                    i13 = 32;
                                } else {
                                    i13 = 16;
                                }
                                i12 |= i13;
                            }
                            if ((i12 & 147) != 146) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            q qVar = (q) mVar;
                            if (qVar.O(i12 & 1, z12)) {
                                final ReadMeta readMeta = (ReadMeta) libraryResults.get(i10);
                                qVar.X(2015171624);
                                Object L = qVar.L();
                                Object obj = u2.l.f33918a;
                                if (L == obj) {
                                    L = r.A(Boolean.FALSE);
                                    qVar.h0(L);
                                }
                                final z0 z0Var = (z0) L;
                                boolean f10 = qVar.f(searchState.getPlayerQueue()) | qVar.f(readMeta);
                                Object L2 = qVar.L();
                                if (f10 || L2 == obj) {
                                    List<MediaItemState> playerQueue = searchState.getPlayerQueue();
                                    if (playerQueue == null || !playerQueue.isEmpty()) {
                                        Iterator<T> it = playerQueue.iterator();
                                        while (it.hasNext()) {
                                            if (kotlin.jvm.internal.m.c(((MediaItemState) it.next()).getReadId(), readMeta.getReadId())) {
                                                z13 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z13 = false;
                                    L2 = Boolean.valueOf(z13);
                                    qVar.h0(L2);
                                }
                                final boolean booleanValue = ((Boolean) L2).booleanValue();
                                i3.q qVar2 = i3.q.f13017a;
                                t a10 = t1.b.a(bVar, p2.e(qVar2, 1.0f), null, 7);
                                x a11 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                                int hashCode = Long.hashCode(qVar.T);
                                o l4 = qVar.l();
                                t c5 = i3.a.c(a10, qVar);
                                h4.h.f11920i.getClass();
                                ho.a aVar3 = h4.g.f11903b;
                                qVar.b0();
                                if (qVar.S) {
                                    qVar.k(aVar3);
                                } else {
                                    qVar.k0();
                                }
                                r.J(h4.g.f11907f, a11, qVar);
                                r.J(h4.g.f11906e, l4, qVar);
                                r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                                r.F(h4.g.f11909h, qVar);
                                r.J(h4.g.f11905d, c5, qVar);
                                String title = readMeta.getTitle();
                                boolean f11 = qVar.f(lVar5) | qVar.h(readMeta) | qVar.f(lVar);
                                Object L3 = qVar.L();
                                if (f11 || L3 == obj) {
                                    final ho.l lVar6 = lVar5;
                                    final ho.l lVar7 = lVar;
                                    L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$4$1$1$1
                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m1727invoke() {
                                            ho.l.this.invoke(readMeta.getReadId());
                                            lVar7.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$4$1$1$1.1
                                                @Override // ho.l
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SearchViewModel) obj2);
                                                    return z.f31622a;
                                                }

                                                public final void invoke(SearchViewModel searchViewModel) {
                                                    searchViewModel.getClass();
                                                    searchViewModel.logSearchResultClickLibrary();
                                                }
                                            });
                                        }

                                        @Override // ho.a
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m1727invoke();
                                            return z.f31622a;
                                        }
                                    };
                                    qVar.h0(L3);
                                }
                                ho.a aVar4 = (ho.a) L3;
                                Object L4 = qVar.L();
                                if (L4 == obj) {
                                    L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$4$1$2$1
                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m1728invoke() {
                                            SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$3$2(z0.this, true);
                                        }

                                        @Override // ho.a
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m1728invoke();
                                            return z.f31622a;
                                        }
                                    };
                                    qVar.h0(L4);
                                }
                                final ho.l lVar8 = lVar;
                                ButtonContainerKt.m1780ButtonContainer83mGB3Q(title, aVar4, null, 0L, false, 0, null, false, (ho.a) L4, c3.k.d(-1853063020, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$4$1$3
                                    public final void invoke(s sVar, m mVar2, int i15) {
                                        boolean z14;
                                        boolean SearchScreenUI$lambda$9$1$3$0$3$1;
                                        sVar.getClass();
                                        if ((i15 & 17) != 16) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        q qVar3 = (q) mVar2;
                                        if (qVar3.O(i15 & 1, z14)) {
                                            ReadMetaRowKt.ReadMetaRow(ReadMeta.this, null, qVar3, 0, 2);
                                            boolean z15 = booleanValue;
                                            SearchScreenUI$lambda$9$1$3$0$3$1 = SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$3$1(z0Var);
                                            final z0 z0Var2 = z0Var;
                                            Object L5 = qVar3.L();
                                            u2.e eVar = u2.l.f33918a;
                                            if (L5 == eVar) {
                                                L5 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$4$1$3$1$1
                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m1729invoke() {
                                                        SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$3$2(z0.this, false);
                                                    }

                                                    @Override // ho.a
                                                    public /* bridge */ /* synthetic */ Object invoke() {
                                                        m1729invoke();
                                                        return z.f31622a;
                                                    }
                                                };
                                                qVar3.h0(L5);
                                            }
                                            ho.a aVar5 = (ho.a) L5;
                                            boolean f12 = qVar3.f(lVar8) | qVar3.h(ReadMeta.this);
                                            final ho.l lVar9 = lVar8;
                                            final z0 z0Var3 = z0Var;
                                            final ReadMeta readMeta2 = ReadMeta.this;
                                            Object L6 = qVar3.L();
                                            if (f12 || L6 == eVar) {
                                                L6 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$4$1$3$2$1
                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m1730invoke() {
                                                        SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$3$2(z0Var3, false);
                                                        ho.l lVar10 = ho.l.this;
                                                        final ReadMeta readMeta3 = readMeta2;
                                                        lVar10.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$4$1$3$2$1.1
                                                            public final void invoke(SearchViewModel searchViewModel) {
                                                                searchViewModel.getClass();
                                                                searchViewModel.onClickAddOrRemoveFromQueue(ReadMeta.this);
                                                            }

                                                            @Override // ho.l
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                invoke((SearchViewModel) obj2);
                                                                return z.f31622a;
                                                            }
                                                        });
                                                    }

                                                    @Override // ho.a
                                                    public /* bridge */ /* synthetic */ Object invoke() {
                                                        m1730invoke();
                                                        return z.f31622a;
                                                    }
                                                };
                                                qVar3.h0(L6);
                                            }
                                            SearchScreenKt.ReadPlayerQueueMenu(z15, SearchScreenUI$lambda$9$1$3$0$3$1, aVar5, (ho.a) L6, qVar3, 384);
                                            return;
                                        }
                                        qVar3.R();
                                    }

                                    @Override // ho.q
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                        invoke((s) obj2, (m) obj3, ((Number) obj4).intValue());
                                        return z.f31622a;
                                    }
                                }, qVar), qVar, 905969664, 252);
                                DividerKt.m1827DivideriJQMabo(r1.d.G(qVar2, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), t2.u.P, 2), 0L, qVar, 0, 2);
                                qVar.p(true);
                                qVar.p(false);
                                return;
                            }
                            qVar.R();
                        }

                        @Override // ho.r
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                            return z.f31622a;
                        }
                    }, true, 2039820996));
                } else if (z11) {
                    t1.t.c(tVar, null, null, ComposableSingletons$SearchScreenKt.INSTANCE.getLambda$759924780$app_productionRelease(), 3);
                }
                if (searchState.getLibraryHasMore() && !searchState.getLibraryResults().isEmpty()) {
                    t1.t.c(tVar, null, null, ComposableSingletons$SearchScreenKt.INSTANCE.m1719getLambda$1444503916$app_productionRelease(), 3);
                }
            }
            if (searchState.getCorpus() != SearchCorpus.LIBRARY_ONLY && searchState.getQuery().length() > 0) {
                if (!searchState.getExploreResults().isEmpty()) {
                    t1.t.c(tVar, null, null, ComposableSingletons$SearchScreenKt.INSTANCE.getLambda$1083872501$app_productionRelease(), 3);
                }
                if (!searchState.getExploreResults().isEmpty()) {
                    final List<SearchSection> exploreResults2 = searchState.getExploreResults();
                    final a aVar3 = new a(7);
                    ((t1.i) tVar).u(exploreResults2.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$lambda$9$1$3$0$$inlined$itemsIndexed$default$7
                        public final Object invoke(int i10) {
                            return ho.p.this.invoke(Integer.valueOf(i10), exploreResults2.get(i10));
                        }

                        @Override // ho.l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Number) obj).intValue());
                        }
                    }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$lambda$9$1$3$0$$inlined$itemsIndexed$default$8
                        @Override // ho.l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Number) obj).intValue());
                        }

                        public final Object invoke(int i10) {
                            exploreResults2.get(i10);
                            return null;
                        }
                    }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$lambda$9$1$3$0$$inlined$itemsIndexed$default$9
                        public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                            int i12;
                            boolean z12;
                            boolean z13;
                            int i13;
                            int i14;
                            if ((i11 & 6) == 0) {
                                if (((q) mVar).f(bVar)) {
                                    i14 = 4;
                                } else {
                                    i14 = 2;
                                }
                                i12 = i11 | i14;
                            } else {
                                i12 = i11;
                            }
                            if ((i11 & 48) == 0) {
                                if (((q) mVar).d(i10)) {
                                    i13 = 32;
                                } else {
                                    i13 = 16;
                                }
                                i12 |= i13;
                            }
                            if ((i12 & 147) != 146) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            q qVar = (q) mVar;
                            if (qVar.O(i12 & 1, z12)) {
                                final SearchSection searchSection = (SearchSection) exploreResults2.get(i10);
                                qVar.X(1908163076);
                                i3.q qVar2 = i3.q.f13017a;
                                t a10 = t1.b.a(bVar, p2.e(qVar2, 1.0f), null, 7);
                                x a11 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                                int hashCode = Long.hashCode(qVar.T);
                                o l4 = qVar.l();
                                t c5 = i3.a.c(a10, qVar);
                                h4.h.f11920i.getClass();
                                h4.f fVar = h4.g.f11903b;
                                qVar.b0();
                                if (qVar.S) {
                                    qVar.k(fVar);
                                } else {
                                    qVar.k0();
                                }
                                r.J(h4.g.f11907f, a11, qVar);
                                r.J(h4.g.f11906e, l4, qVar);
                                r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                                r.F(h4.g.f11909h, qVar);
                                r.J(h4.g.f11905d, c5, qVar);
                                boolean z14 = searchSection instanceof SearchSection.Collection;
                                Object obj = u2.l.f33918a;
                                if (z14) {
                                    qVar.X(-25885956);
                                    String title = ((SearchSection.Collection) searchSection).getCollection().getTitle();
                                    boolean f10 = qVar.f(lVar) | qVar.h(searchSection) | qVar.f(lVar2);
                                    Object L = qVar.L();
                                    if (f10 || L == obj) {
                                        final ho.l lVar6 = lVar;
                                        final ho.l lVar7 = lVar2;
                                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$1$1
                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m1731invoke() {
                                                ho.l lVar8 = ho.l.this;
                                                final SearchSection searchSection2 = searchSection;
                                                lVar8.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$1$1.1
                                                    public final void invoke(SearchViewModel searchViewModel) {
                                                        searchViewModel.getClass();
                                                        searchViewModel.onExploreCollectionClicked(((SearchSection.Collection) SearchSection.this).getCollection().getId());
                                                    }

                                                    @Override // ho.l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((SearchViewModel) obj2);
                                                        return z.f31622a;
                                                    }
                                                });
                                                lVar7.invoke(((SearchSection.Collection) searchSection).getCollection().getId());
                                                ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$1$1.2
                                                    @Override // ho.l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((SearchViewModel) obj2);
                                                        return z.f31622a;
                                                    }

                                                    public final void invoke(SearchViewModel searchViewModel) {
                                                        searchViewModel.getClass();
                                                        searchViewModel.logSearchResultClickExplore();
                                                    }
                                                });
                                            }

                                            @Override // ho.a
                                            public /* bridge */ /* synthetic */ Object invoke() {
                                                m1731invoke();
                                                return z.f31622a;
                                            }
                                        };
                                        qVar.h0(L);
                                    }
                                    final SearchState searchState2 = searchState;
                                    ButtonContainerKt.m1780ButtonContainer83mGB3Q(title, (ho.a) L, null, 0L, false, 0, null, false, null, c3.k.d(599066105, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$2
                                        public final void invoke(s sVar, m mVar2, int i15) {
                                            boolean z15;
                                            sVar.getClass();
                                            if ((i15 & 17) != 16) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            q qVar3 = (q) mVar2;
                                            if (qVar3.O(i15 & 1, z15)) {
                                                CollectionMetaRowKt.CollectionMetaRow(((SearchSection.Collection) SearchSection.this).getCollection(), searchState2.getNow(), qVar3, 0);
                                            } else {
                                                qVar3.R();
                                            }
                                        }

                                        @Override // ho.q
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                            invoke((s) obj2, (m) obj3, ((Number) obj4).intValue());
                                            return z.f31622a;
                                        }
                                    }, qVar), qVar, 805306368, 508);
                                    qVar = qVar;
                                    qVar.p(false);
                                } else if (searchSection instanceof SearchSection.GlobalRead) {
                                    qVar.X(-801523412);
                                    Object L2 = qVar.L();
                                    if (L2 == obj) {
                                        L2 = r.A(Boolean.FALSE);
                                        qVar.h0(L2);
                                    }
                                    final z0 z0Var = (z0) L2;
                                    boolean f11 = qVar.f(searchState.getPlayerQueue()) | qVar.f(searchSection);
                                    Object L3 = qVar.L();
                                    if (f11 || L3 == obj) {
                                        List<MediaItemState> playerQueue = searchState.getPlayerQueue();
                                        if (playerQueue == null || !playerQueue.isEmpty()) {
                                            Iterator<T> it = playerQueue.iterator();
                                            while (it.hasNext()) {
                                                if (kotlin.jvm.internal.m.c(((MediaItemState) it.next()).getReadId(), ((SearchSection.GlobalRead) searchSection).getRead().getReadId())) {
                                                    z13 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z13 = false;
                                        L3 = Boolean.valueOf(z13);
                                        qVar.h0(L3);
                                    }
                                    final boolean booleanValue = ((Boolean) L3).booleanValue();
                                    String title2 = ((SearchSection.GlobalRead) searchSection).getRead().getTitle();
                                    boolean f12 = qVar.f(lVar) | qVar.h(searchSection) | qVar.f(lVar3);
                                    Object L4 = qVar.L();
                                    if (f12 || L4 == obj) {
                                        final ho.l lVar8 = lVar;
                                        final ho.l lVar9 = lVar3;
                                        L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$3$1
                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m1732invoke() {
                                                ho.l lVar10 = ho.l.this;
                                                final SearchSection searchSection2 = searchSection;
                                                lVar10.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$3$1.1
                                                    public final void invoke(SearchViewModel searchViewModel) {
                                                        searchViewModel.getClass();
                                                        searchViewModel.onExploreReadClicked(((SearchSection.GlobalRead) SearchSection.this).getRead().getReadId());
                                                    }

                                                    @Override // ho.l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((SearchViewModel) obj2);
                                                        return z.f31622a;
                                                    }
                                                });
                                                lVar9.invoke(((SearchSection.GlobalRead) searchSection).getRead().getReadId());
                                                ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$3$1.2
                                                    @Override // ho.l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((SearchViewModel) obj2);
                                                        return z.f31622a;
                                                    }

                                                    public final void invoke(SearchViewModel searchViewModel) {
                                                        searchViewModel.getClass();
                                                        searchViewModel.logSearchResultClickExplore();
                                                    }
                                                });
                                            }

                                            @Override // ho.a
                                            public /* bridge */ /* synthetic */ Object invoke() {
                                                m1732invoke();
                                                return z.f31622a;
                                            }
                                        };
                                        qVar.h0(L4);
                                    }
                                    ho.a aVar4 = (ho.a) L4;
                                    boolean h10 = qVar.h(searchState) | qVar.h(searchSection);
                                    Object L5 = qVar.L();
                                    if (h10 || L5 == obj) {
                                        final SearchState searchState3 = searchState;
                                        L5 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$4$1
                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m1733invoke() {
                                                if (SearchState.this.getExploreReadsInLibrary().contains(((SearchSection.GlobalRead) searchSection).getRead().getReadId())) {
                                                    SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$5$0$3(z0Var, true);
                                                }
                                            }

                                            @Override // ho.a
                                            public /* bridge */ /* synthetic */ Object invoke() {
                                                m1733invoke();
                                                return z.f31622a;
                                            }
                                        };
                                        qVar.h0(L5);
                                    }
                                    final ho.l lVar10 = lVar;
                                    ButtonContainerKt.m1780ButtonContainer83mGB3Q(title2, aVar4, null, 0L, false, 0, null, false, (ho.a) L5, c3.k.d(-651135198, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$5
                                        public final void invoke(s sVar, m mVar2, int i15) {
                                            boolean z15;
                                            boolean SearchScreenUI$lambda$9$1$3$0$5$0$2;
                                            sVar.getClass();
                                            if ((i15 & 17) != 16) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            q qVar3 = (q) mVar2;
                                            if (qVar3.O(i15 & 1, z15)) {
                                                ReadMetaRowKt.PublicReadMetaRow(((SearchSection.GlobalRead) SearchSection.this).getRead(), null, null, false, false, qVar3, 0, 30);
                                                boolean z16 = booleanValue;
                                                SearchScreenUI$lambda$9$1$3$0$5$0$2 = SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$5$0$2(z0Var);
                                                final z0 z0Var2 = z0Var;
                                                Object L6 = qVar3.L();
                                                u2.e eVar = u2.l.f33918a;
                                                if (L6 == eVar) {
                                                    L6 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$5$1$1
                                                        /* renamed from: invoke, reason: collision with other method in class */
                                                        public final void m1734invoke() {
                                                            SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$5$0$3(z0.this, false);
                                                        }

                                                        @Override // ho.a
                                                        public /* bridge */ /* synthetic */ Object invoke() {
                                                            m1734invoke();
                                                            return z.f31622a;
                                                        }
                                                    };
                                                    qVar3.h0(L6);
                                                }
                                                ho.a aVar5 = (ho.a) L6;
                                                boolean f13 = qVar3.f(lVar10) | qVar3.h(SearchSection.this);
                                                final ho.l lVar11 = lVar10;
                                                final z0 z0Var3 = z0Var;
                                                final SearchSection searchSection2 = SearchSection.this;
                                                Object L7 = qVar3.L();
                                                if (f13 || L7 == eVar) {
                                                    L7 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$5$2$1
                                                        /* renamed from: invoke, reason: collision with other method in class */
                                                        public final void m1735invoke() {
                                                            SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$5$0$3(z0Var3, false);
                                                            ho.l lVar12 = ho.l.this;
                                                            final SearchSection searchSection3 = searchSection2;
                                                            lVar12.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$5$2$1.1
                                                                public final void invoke(SearchViewModel searchViewModel) {
                                                                    searchViewModel.getClass();
                                                                    searchViewModel.onClickAddOrRemoveFromQueue(((SearchSection.GlobalRead) SearchSection.this).getRead());
                                                                }

                                                                @Override // ho.l
                                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                    invoke((SearchViewModel) obj2);
                                                                    return z.f31622a;
                                                                }
                                                            });
                                                        }

                                                        @Override // ho.a
                                                        public /* bridge */ /* synthetic */ Object invoke() {
                                                            m1735invoke();
                                                            return z.f31622a;
                                                        }
                                                    };
                                                    qVar3.h0(L7);
                                                }
                                                SearchScreenKt.ReadPlayerQueueMenu(z16, SearchScreenUI$lambda$9$1$3$0$5$0$2, aVar5, (ho.a) L7, qVar3, 384);
                                                return;
                                            }
                                            qVar3.R();
                                        }

                                        @Override // ho.q
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                            invoke((s) obj2, (m) obj3, ((Number) obj4).intValue());
                                            return z.f31622a;
                                        }
                                    }, qVar), qVar, 805306368, 252);
                                    qVar = qVar;
                                    qVar.p(false);
                                } else if (searchSection instanceof SearchSection.SearchList) {
                                    qVar.X(-799238185);
                                    SearchSection.SearchList searchList = (SearchSection.SearchList) searchSection;
                                    Date now = searchState.getNow();
                                    List<MediaItemState> playerQueue2 = searchState.getPlayerQueue();
                                    Set<String> exploreReadsInLibrary = searchState.getExploreReadsInLibrary();
                                    boolean f13 = qVar.f(lVar) | qVar.f(lVar2);
                                    Object L6 = qVar.L();
                                    if (f13 || L6 == obj) {
                                        final ho.l lVar11 = lVar;
                                        final ho.l lVar12 = lVar2;
                                        L6 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$6$1
                                            public final void invoke(final String str) {
                                                str.getClass();
                                                ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$6$1.1
                                                    public final void invoke(SearchViewModel searchViewModel) {
                                                        searchViewModel.getClass();
                                                        searchViewModel.onExploreCollectionClicked(str);
                                                    }

                                                    @Override // ho.l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((SearchViewModel) obj2);
                                                        return z.f31622a;
                                                    }
                                                });
                                                lVar12.invoke(str);
                                                ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$6$1.2
                                                    @Override // ho.l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((SearchViewModel) obj2);
                                                        return z.f31622a;
                                                    }

                                                    public final void invoke(SearchViewModel searchViewModel) {
                                                        searchViewModel.getClass();
                                                        searchViewModel.logSearchResultClickExplore();
                                                    }
                                                });
                                            }

                                            @Override // ho.l
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                invoke((String) obj2);
                                                return z.f31622a;
                                            }
                                        };
                                        qVar.h0(L6);
                                    }
                                    ho.l lVar13 = (ho.l) L6;
                                    boolean f14 = qVar.f(lVar) | qVar.f(lVar3);
                                    Object L7 = qVar.L();
                                    if (f14 || L7 == obj) {
                                        final ho.l lVar14 = lVar;
                                        final ho.l lVar15 = lVar3;
                                        L7 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$7$1
                                            public final void invoke(final String str) {
                                                str.getClass();
                                                ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$7$1.1
                                                    public final void invoke(SearchViewModel searchViewModel) {
                                                        searchViewModel.getClass();
                                                        searchViewModel.onExploreReadClicked(str);
                                                    }

                                                    @Override // ho.l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((SearchViewModel) obj2);
                                                        return z.f31622a;
                                                    }
                                                });
                                                lVar15.invoke(str);
                                                ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$7$1.2
                                                    @Override // ho.l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((SearchViewModel) obj2);
                                                        return z.f31622a;
                                                    }

                                                    public final void invoke(SearchViewModel searchViewModel) {
                                                        searchViewModel.getClass();
                                                        searchViewModel.logSearchResultClickExplore();
                                                    }
                                                });
                                            }

                                            @Override // ho.l
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                invoke((String) obj2);
                                                return z.f31622a;
                                            }
                                        };
                                        qVar.h0(L7);
                                    }
                                    SearchScreenKt.SearchListColumn(playerQueue2, searchList, lVar13, (ho.l) L7, now, lVar, exploreReadsInLibrary, qVar, 0, 0);
                                    qVar = qVar;
                                    qVar.p(false);
                                } else if (searchSection instanceof SearchSection.GenericItem) {
                                    qVar.X(-25742879);
                                    SearchSection.GenericItem genericItem = (SearchSection.GenericItem) searchSection;
                                    boolean f15 = qVar.f(lVar) | qVar.h(searchSection) | qVar.f(lVar4);
                                    Object L8 = qVar.L();
                                    if (f15 || L8 == obj) {
                                        final ho.l lVar16 = lVar;
                                        final ho.l lVar17 = lVar4;
                                        L8 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$8$1
                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m1736invoke() {
                                                ho.l lVar18 = ho.l.this;
                                                final SearchSection searchSection2 = searchSection;
                                                lVar18.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$8$1.1
                                                    public final void invoke(SearchViewModel searchViewModel) {
                                                        searchViewModel.getClass();
                                                        searchViewModel.onExploreGenericItemClicked(((SearchSection.GenericItem) SearchSection.this).getDeeplink());
                                                    }

                                                    @Override // ho.l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((SearchViewModel) obj2);
                                                        return z.f31622a;
                                                    }
                                                });
                                                lVar17.invoke(((SearchSection.GenericItem) searchSection).getDeeplink());
                                                ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$2$1$6$1$8$1.2
                                                    @Override // ho.l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((SearchViewModel) obj2);
                                                        return z.f31622a;
                                                    }

                                                    public final void invoke(SearchViewModel searchViewModel) {
                                                        searchViewModel.getClass();
                                                        searchViewModel.logSearchResultClickExplore();
                                                    }
                                                });
                                            }

                                            @Override // ho.a
                                            public /* bridge */ /* synthetic */ Object invoke() {
                                                m1736invoke();
                                                return z.f31622a;
                                            }
                                        };
                                        qVar.h0(L8);
                                    }
                                    SearchScreenKt.GenericItemRow(genericItem, (ho.a) L8, qVar, 0);
                                    qVar.p(false);
                                } else {
                                    throw com.google.android.gms.internal.play_billing.b.h(-25884418, qVar, false);
                                }
                                DividerKt.m1827DivideriJQMabo(r1.d.G(qVar2, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), t2.u.P, 2), 0L, qVar, 0, 2);
                                qVar.p(true);
                                qVar.p(false);
                                return;
                            }
                            qVar.R();
                        }

                        @Override // ho.r
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                            return z.f31622a;
                        }
                    }, true, 2039820996));
                } else if (!searchState.isExploreLoading() && wq.n.m0(searchState.getExploreError())) {
                    t1.t.c(tVar, null, null, ComposableSingletons$SearchScreenKt.INSTANCE.getLambda$1602042133$app_productionRelease(), 3);
                }
                if (!wq.n.m0(searchState.getExploreError())) {
                    t1.t.c(tVar, null, null, new c3.j(new g(lVar, 1), true, 564942205), 3);
                } else if (searchState.getExploreHasMore() && !searchState.getExploreResults().isEmpty()) {
                    t1.t.c(tVar, null, null, ComposableSingletons$SearchScreenKt.INSTANCE.getLambda$1171695860$app_productionRelease(), 3);
                }
            }
        }
        t1.t.c(tVar, null, null, ComposableSingletons$SearchScreenKt.INSTANCE.getLambda$1757397821$app_productionRelease(), 3);
        return z.f31622a;
    }

    public static final Object SearchScreenUI$lambda$9$1$3$0$0(int i10, SearchSection searchSection) {
        searchSection.getClass();
        return getSearchSectionUniqueKey(searchSection, i10);
    }

    public static final boolean SearchScreenUI$lambda$9$1$3$0$1$0$2(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void SearchScreenUI$lambda$9$1$3$0$1$0$3(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final Object SearchScreenUI$lambda$9$1$3$0$2(int i10, ReadMeta readMeta) {
        readMeta.getClass();
        return defpackage.f.i("lib:", readMeta.getReadId());
    }

    public static final boolean SearchScreenUI$lambda$9$1$3$0$3$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void SearchScreenUI$lambda$9$1$3$0$3$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final Object SearchScreenUI$lambda$9$1$3$0$4(int i10, SearchSection searchSection) {
        searchSection.getClass();
        return getSearchSectionUniqueKey(searchSection, i10);
    }

    public static final boolean SearchScreenUI$lambda$9$1$3$0$5$0$2(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void SearchScreenUI$lambda$9$1$3$0$5$0$3(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z SearchScreenUI$lambda$9$1$3$0$6(ho.l lVar, t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            t x10 = ib.i.x(elevenLabsTheme, qVar, i11, e10);
            x a10 = w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(x10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            ErrorContainerKt.ErrorContainer(kj.c.R(qVar, io.elevenlabs.ui.R.string.error_screen_content), qVar, 0);
            ib.i.A(elevenLabsTheme, qVar, i11, qVar2, qVar);
            String R = kj.c.R(qVar, R.string.common_retry);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new d(lVar, 1);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, p2.e(qVar2, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SearchScreenUI$lambda$9$1$3$0$6$0$0$0(ho.l lVar) {
        lVar.invoke(new i(8));
        return z.f31622a;
    }

    public static final z SearchScreenUI$lambda$9$1$3$0$6$0$0$0$0(SearchViewModel searchViewModel) {
        searchViewModel.getClass();
        searchViewModel.load();
        return z.f31622a;
    }

    public static final void SectionHeader(String str, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        q qVar = (q) mVar;
        qVar.Z(446530432);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
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
            i3.q qVar2 = i3.q.f13017a;
            ib.i.C(elevenLabsTheme, qVar, i13, qVar2, qVar);
            j7.d(str, r1.d.G(p2.e(qVar2, 1.0f), elevenLabsTheme.getSpacings(qVar, i13).m2357getX5D9Ej5fM(), t2.u.P, 2), defpackage.f.A(elevenLabsTheme, qVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBodyMedium500(), qVar, i11 & 14, 0, 131064);
            qVar = qVar;
            ib.i.A(elevenLabsTheme, qVar, i13, qVar2, qVar);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q0(str, i10, 5);
        }
    }

    public static final z SectionHeader$lambda$0(String str, int i10, m mVar, int i11) {
        SectionHeader(str, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final String getSearchSectionUniqueKey(SearchSection searchSection, int i10) {
        if (searchSection instanceof SearchSection.Collection) {
            return p.n.h(i10, "exp:c:", ":", ((SearchSection.Collection) searchSection).getCollection().getId());
        }
        if (searchSection instanceof SearchSection.GlobalRead) {
            return p.n.h(i10, "exp:r:", ":", ((SearchSection.GlobalRead) searchSection).getRead().getReadId());
        }
        if (searchSection instanceof SearchSection.SearchList) {
            return defpackage.f.e(i10, "exp:list:");
        }
        if (searchSection instanceof SearchSection.GenericItem) {
            return p.n.h(i10, "exp:g:", ":", ((SearchSection.GenericItem) searchSection).getDeeplink());
        }
        c6.p();
        return null;
    }
}

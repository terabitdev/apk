package io.elevenlabs.readerapp.paging;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import ho.l;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.domain.services.ReadsExploreService;
import ir.i;
import ir.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import ta.j1;
import ta.k1;
import ta.l1;
import ta.m1;
import ta.n1;
import ta.o1;
import wn.c;
import xn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bk\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR&\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\u001d¨\u0006\""}, d2 = {"Lio/elevenlabs/readerapp/paging/ExploreFilteredContentPagingSource;", "Lta/n1;", "", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "Lio/elevenlabs/domain/services/ReadsExploreService;", "readsExploreService", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, FirebaseAnalytics.Param.CURRENCY, "", "", "filters", "sortBy", "Lio/elevenlabs/domain/Logger;", "logger", "Lkotlin/Function1;", "Lsn/z;", "onPageLoaded", "<init>", "(Lio/elevenlabs/domain/services/ReadsExploreService;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lio/elevenlabs/domain/Logger;Lho/l;)V", "Lta/j1;", "params", "Lta/m1;", "load", "(Lta/j1;Lwn/c;)Ljava/lang/Object;", "Lta/o1;", RemoteConfigConstants.ResponseFieldKey.STATE, "getRefreshKey", "(Lta/o1;)Ljava/lang/String;", "Lio/elevenlabs/domain/services/ReadsExploreService;", "Ljava/lang/String;", "Ljava/util/Map;", "Lio/elevenlabs/domain/Logger;", "Lho/l;", ParameterNames.TAG, "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreFilteredContentPagingSource extends n1 {
    public static final int $stable = 8;
    private final String currency;
    private final Map<String, List<String>> filters;
    private final String languageCode;
    private final Logger logger;
    private final l onPageLoaded;
    private final ReadsExploreService readsExploreService;
    private final String sortBy;
    private final String tag;

    /* JADX WARN: Multi-variable type inference failed */
    public ExploreFilteredContentPagingSource(ReadsExploreService readsExploreService, String str, String str2, Map<String, ? extends List<String>> map, String str3, Logger logger, l lVar) {
        readsExploreService.getClass();
        map.getClass();
        logger.getClass();
        lVar.getClass();
        this.readsExploreService = readsExploreService;
        this.languageCode = str;
        this.currency = str2;
        this.filters = map;
        this.sortBy = str3;
        this.logger = logger;
        this.onPageLoaded = lVar;
        this.tag = "ExploreFilteredContentPagingSource";
    }

    public static final z _init_$lambda$0(List list) {
        list.getClass();
        return z.f31622a;
    }

    public static /* synthetic */ z a(List list) {
        return _init_$lambda$0(list);
    }

    @Override // ta.n1
    public String getRefreshKey(o1 r12) {
        r12.getClass();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0080, code lost:
    
        if (r15 != r12) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // ta.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(j1 j1Var, c<? super m1> cVar) {
        ExploreFilteredContentPagingSource$load$1 exploreFilteredContentPagingSource$load$1;
        int i10;
        try {
            if (cVar instanceof ExploreFilteredContentPagingSource$load$1) {
                exploreFilteredContentPagingSource$load$1 = (ExploreFilteredContentPagingSource$load$1) cVar;
                int i11 = exploreFilteredContentPagingSource$load$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    exploreFilteredContentPagingSource$load$1.label = i11 - Integer.MIN_VALUE;
                    ExploreFilteredContentPagingSource$load$1 exploreFilteredContentPagingSource$load$12 = exploreFilteredContentPagingSource$load$1;
                    Object obj = exploreFilteredContentPagingSource$load$12.result;
                    i10 = exploreFilteredContentPagingSource$load$12.label;
                    a aVar = a.f37986a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                sn.a.g(obj);
                                AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                                if (asyncCallResult instanceof AsyncCallResult.Success) {
                                    ReadsExplorePage readsExplorePage = (ReadsExplorePage) ((AsyncCallResult.Success) asyncCallResult).getData();
                                    List<ReadsExplorePage.Section> sections = readsExplorePage.getSections();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : sections) {
                                        ReadsExplorePage.Section section = (ReadsExplorePage.Section) obj2;
                                        if (section instanceof ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel) {
                                            if (!((ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel) section).getReads().isEmpty()) {
                                                arrayList.add(obj2);
                                            }
                                        } else if (section instanceof ReadsExplorePage.Section.GetReadsExploreSmallGrid) {
                                            if (!((ReadsExplorePage.Section.GetReadsExploreSmallGrid) section).getReads().isEmpty()) {
                                                arrayList.add(obj2);
                                            }
                                        } else if (section instanceof ReadsExplorePage.Section.GetReadsExploreLargeGrid) {
                                            if (!((ReadsExplorePage.Section.GetReadsExploreLargeGrid) section).getReads().isEmpty()) {
                                                arrayList.add(obj2);
                                            }
                                        } else if (section instanceof ReadsExplorePage.Section.GetReadsExploreCardCollection) {
                                            if (!((ReadsExplorePage.Section.GetReadsExploreCardCollection) section).getReads().isEmpty()) {
                                                arrayList.add(obj2);
                                            }
                                        } else if (section instanceof ReadsExplorePage.Section.GetReadsExploreHeroCarousel) {
                                            if (!((ReadsExplorePage.Section.GetReadsExploreHeroCarousel) section).getItems().isEmpty()) {
                                                arrayList.add(obj2);
                                            }
                                        } else if (section instanceof ReadsExplorePage.Section.GetReadsExploreVoiceCollection) {
                                            if (!((ReadsExplorePage.Section.GetReadsExploreVoiceCollection) section).getItems().isEmpty()) {
                                                arrayList.add(obj2);
                                            }
                                        } else if (section instanceof ReadsExplorePage.Section.GetReadsExploreTitleSubtitle) {
                                            if (((ReadsExplorePage.Section.GetReadsExploreTitleSubtitle) section).getTitle() == null && ((ReadsExplorePage.Section.GetReadsExploreTitleSubtitle) section).getSubtitle() == null) {
                                            }
                                            arrayList.add(obj2);
                                        } else {
                                            throw new RuntimeException();
                                        }
                                    }
                                    this.onPageLoaded.invoke(arrayList);
                                    return new l1(arrayList, readsExplorePage.getNextCursor(), Integer.MIN_VALUE, Integer.MIN_VALUE);
                                }
                                if (asyncCallResult instanceof AsyncCallResult.Error) {
                                    this.logger.logError(this.tag, "Error loading explore content: " + ((AsyncCallResult.Error) asyncCallResult).getError(), null);
                                    return new k1(new Exception(((AsyncCallResult.Error) asyncCallResult).getError().toString()));
                                }
                                throw new RuntimeException();
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sn.a.g(obj);
                    } else {
                        sn.a.g(obj);
                        String str = (String) j1Var.a();
                        ReadsExploreService readsExploreService = this.readsExploreService;
                        String str2 = this.languageCode;
                        String str3 = this.currency;
                        Map<String, List<String>> map = this.filters;
                        String str4 = this.sortBy;
                        exploreFilteredContentPagingSource$load$12.L$0 = null;
                        exploreFilteredContentPagingSource$load$12.L$1 = null;
                        exploreFilteredContentPagingSource$load$12.label = 1;
                        obj = readsExploreService.getExploreFilter(str2, str3, map, str, str4, exploreFilteredContentPagingSource$load$12);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    exploreFilteredContentPagingSource$load$12.L$0 = null;
                    exploreFilteredContentPagingSource$load$12.L$1 = null;
                    exploreFilteredContentPagingSource$load$12.label = 2;
                    obj = r.z((i) obj, exploreFilteredContentPagingSource$load$12);
                }
            }
            if (i10 == 0) {
            }
            exploreFilteredContentPagingSource$load$12.L$0 = null;
            exploreFilteredContentPagingSource$load$12.L$1 = null;
            exploreFilteredContentPagingSource$load$12.label = 2;
            obj = r.z((i) obj, exploreFilteredContentPagingSource$load$12);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Exception e11) {
            this.logger.logError(this.tag, "Exception loading explore content", e11);
            return new k1(e11);
        }
        exploreFilteredContentPagingSource$load$1 = new ExploreFilteredContentPagingSource$load$1(this, cVar);
        ExploreFilteredContentPagingSource$load$1 exploreFilteredContentPagingSource$load$122 = exploreFilteredContentPagingSource$load$1;
        Object obj3 = exploreFilteredContentPagingSource$load$122.result;
        i10 = exploreFilteredContentPagingSource$load$122.label;
        a aVar2 = a.f37986a;
    }

    public /* synthetic */ ExploreFilteredContentPagingSource(ReadsExploreService readsExploreService, String str, String str2, Map map, String str3, Logger logger, l lVar, int i10, f fVar) {
        this(readsExploreService, str, str2, map, str3, logger, (i10 & 64) != 0 ? new io.elevenlabs.highlighter.z(15) : lVar);
    }
}

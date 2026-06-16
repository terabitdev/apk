package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import io.elevenlabs.data.api.ReadsAPI;
import io.elevenlabs.data.api.ReadsExploreSearchAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.extensions.DataModelsToDomainModelsKt;
import io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt;
import io.elevenlabs.data.mapping.ReadMappingKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.SearchClickRequest;
import io.elevenlabs.data.model.response.ExploreReadResponseModel;
import io.elevenlabs.data.model.response.GetExploreSearchResponse;
import io.elevenlabs.data.model.response.GetReadsExplorePageResponseModel;
import io.elevenlabs.data.model.response.GetReadsResponseModel;
import io.elevenlabs.data.model.response.KeyLabelResponseModel;
import io.elevenlabs.data.model.response.ReadMetadataResponseModel;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ExploreDeeplinkPosition;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.domain.model.PageFilter;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.domain.model.ReadsExploreSearchResults;
import io.elevenlabs.domain.model.SearchResult;
import io.elevenlabs.domain.model.SearchSection;
import io.elevenlabs.domain.services.ReadsExploreService;
import ir.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q;
import livekit.LivekitInternal$NodeStats;
import oo.u;
import sn.z;
import tn.p;
import tn.t;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\f\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u0010J\u0013\u0010\f\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\f\u0010\u0013J\u0013\u0010\f\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\f\u0010\u0016J\u0013\u0010\f\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\f\u0010\u0019J$\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001f\u0010 Jf\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c0)2\b\u0010!\u001a\u0004\u0018\u00010\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001d0#2\b\u0010%\u001a\u0004\u0018\u00010\u001a2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b*\u0010+J^\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c0)2\b\u0010!\u001a\u0004\u0018\u00010\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001d0#2\b\u0010%\u001a\u0004\u0018\u00010\u001a2\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0004\b,\u0010-J(\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c2\u0006\u0010.\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0004\b/\u00100J(\u00105\u001a\u0002042\u0006\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b5\u00106J\u0011\u00107\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0)H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u0002042\u0006\u0010!\u001a\u00020\u001aH\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R/\u0010E\u001a\u0004\u0018\u00010\u001a2\b\u0010@\u001a\u0004\u0018\u00010\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u00108\"\u0004\bD\u0010<¨\u0006F"}, d2 = {"Lio/elevenlabs/data/services/ReadsExploreServiceImpl;", "Lio/elevenlabs/domain/services/ReadsExploreService;", "Lio/elevenlabs/data/api/ReadsAPI;", "readsAPI", "Lio/elevenlabs/data/api/ReadsExploreSearchAPI;", "exploreSearchApi", "Landroid/content/SharedPreferences;", "userSharedPreferences", "<init>", "(Lio/elevenlabs/data/api/ReadsAPI;Lio/elevenlabs/data/api/ReadsExploreSearchAPI;Landroid/content/SharedPreferences;)V", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel;", "Lio/elevenlabs/domain/model/ReadsExplorePage;", "toDomain", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel;)Lio/elevenlabs/domain/model/ReadsExplorePage;", "Lio/elevenlabs/data/model/response/KeyLabelResponseModel;", "Lio/elevenlabs/domain/model/KeyLabel;", "(Lio/elevenlabs/data/model/response/KeyLabelResponseModel;)Lio/elevenlabs/domain/model/KeyLabel;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse;", "Lio/elevenlabs/domain/model/ReadsExploreSearchResults;", "(Lio/elevenlabs/data/model/response/GetExploreSearchResponse;)Lio/elevenlabs/domain/model/ReadsExploreSearchResults;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section;", "Lio/elevenlabs/domain/model/SearchSection;", "(Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section;)Lio/elevenlabs/domain/model/SearchSection;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result;", "Lio/elevenlabs/domain/model/SearchResult;", "(Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result;)Lio/elevenlabs/domain/model/SearchResult;", "", "category", "Lio/elevenlabs/domain/model/AsyncCallResult;", "", "Lio/elevenlabs/domain/model/ReadMeta;", "getExploreReads", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "language", FirebaseAnalytics.Param.CURRENCY, "", "filters", "cursor", "sortBy", "", "useCache", "Lir/i;", "getExploreIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLwn/c;)Ljava/lang/Object;", "getExploreFilter", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "query", FirebaseAnalytics.Event.SEARCH, "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "searchId", "itemId", "itemType", "Lsn/z;", "postSearchItemClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "getPersistedExploreLanguage", "()Ljava/lang/String;", "observePersistedExploreLanguage", "()Lir/i;", "setPersistedExploreLanguage", "(Ljava/lang/String;)V", "Lio/elevenlabs/data/api/ReadsAPI;", "Lio/elevenlabs/data/api/ReadsExploreSearchAPI;", "Landroid/content/SharedPreferences;", "<set-?>", "exploreLanguagePreference$delegate", "Lko/b;", "getExploreLanguagePreference", "setExploreLanguagePreference", "exploreLanguagePreference", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadsExploreServiceImpl implements ReadsExploreService {
    static final /* synthetic */ u[] $$delegatedProperties = {new q(ReadsExploreServiceImpl.class, "exploreLanguagePreference", "getExploreLanguagePreference()Ljava/lang/String;", 0)};

    /* renamed from: exploreLanguagePreference$delegate, reason: from kotlin metadata */
    private final ko.b exploreLanguagePreference;
    private final ReadsExploreSearchAPI exploreSearchApi;
    private final ReadsAPI readsAPI;
    private final SharedPreferences userSharedPreferences;

    public ReadsExploreServiceImpl(ReadsAPI readsAPI, ReadsExploreSearchAPI readsExploreSearchAPI, @UserSharedPreferences SharedPreferences sharedPreferences) {
        readsAPI.getClass();
        readsExploreSearchAPI.getClass();
        sharedPreferences.getClass();
        this.readsAPI = readsAPI;
        this.exploreSearchApi = readsExploreSearchAPI;
        this.userSharedPreferences = sharedPreferences;
        this.exploreLanguagePreference = SharedPreferencesExtensionsKt.sharedPreferencesProperty(sharedPreferences, "explore_selected_language", (String) null);
    }

    public static /* synthetic */ List a(GetReadsResponseModel getReadsResponseModel) {
        return getExploreReads$lambda$0(getReadsResponseModel);
    }

    public static /* synthetic */ ReadsExploreSearchResults b(ReadsExploreServiceImpl readsExploreServiceImpl, GetExploreSearchResponse getExploreSearchResponse) {
        return search$lambda$0(readsExploreServiceImpl, getExploreSearchResponse);
    }

    private final String getExploreLanguagePreference() {
        return (String) this.exploreLanguagePreference.getValue(this, $$delegatedProperties[0]);
    }

    public static final List getExploreReads$lambda$0(GetReadsResponseModel getReadsResponseModel) {
        getReadsResponseModel.getClass();
        List<ReadMetadataResponseModel> reads = getReadsResponseModel.getReads();
        ArrayList arrayList = new ArrayList(p.a0(reads, 10));
        Iterator<T> it = reads.iterator();
        while (it.hasNext()) {
            arrayList.add(ReadMappingKt.toDomain((ReadMetadataResponseModel) it.next()));
        }
        return arrayList;
    }

    public static final ReadsExploreSearchResults search$lambda$0(ReadsExploreServiceImpl readsExploreServiceImpl, GetExploreSearchResponse getExploreSearchResponse) {
        getExploreSearchResponse.getClass();
        return readsExploreServiceImpl.toDomain(getExploreSearchResponse);
    }

    private final void setExploreLanguagePreference(String str) {
        this.exploreLanguagePreference.setValue(this, $$delegatedProperties[0], str);
    }

    public final ReadsExplorePage toDomain(GetReadsExplorePageResponseModel getReadsExplorePageResponseModel) {
        Object explorePageMultiOptionFilterResponseModel;
        ReadsExplorePage.Section getReadsExploreTitleSubtitle;
        ReadsExplorePage.Section getReadsExploreVoiceCollection;
        ExploreDeeplinkPosition exploreDeeplinkPosition;
        List<GetReadsExplorePageResponseModel.Section> sections = getReadsExplorePageResponseModel.getSections();
        ArrayList arrayList = new ArrayList(p.a0(sections, 10));
        for (GetReadsExplorePageResponseModel.Section section : sections) {
            if (section instanceof GetReadsExplorePageResponseModel.Section.GetReadsExploreHighlightedCarouselResponseModel) {
                GetReadsExplorePageResponseModel.Section.GetReadsExploreHighlightedCarouselResponseModel getReadsExploreHighlightedCarouselResponseModel = (GetReadsExplorePageResponseModel.Section.GetReadsExploreHighlightedCarouselResponseModel) section;
                String title = getReadsExploreHighlightedCarouselResponseModel.getTitle();
                String subtitle = getReadsExploreHighlightedCarouselResponseModel.getSubtitle();
                String deeplink = getReadsExploreHighlightedCarouselResponseModel.getDeeplink();
                List<ExploreReadResponseModel> reads = getReadsExploreHighlightedCarouselResponseModel.getReads();
                ArrayList arrayList2 = new ArrayList(p.a0(reads, 10));
                Iterator<T> it = reads.iterator();
                while (it.hasNext()) {
                    arrayList2.add(DataModelsToDomainModelsKt.toDomain((ExploreReadResponseModel) it.next()));
                }
                getReadsExploreVoiceCollection = new ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel(title, subtitle, deeplink, arrayList2);
            } else {
                if (section instanceof GetReadsExplorePageResponseModel.Section.GetReadsExploreSmallGridResponseModel) {
                    GetReadsExplorePageResponseModel.Section.GetReadsExploreSmallGridResponseModel getReadsExploreSmallGridResponseModel = (GetReadsExplorePageResponseModel.Section.GetReadsExploreSmallGridResponseModel) section;
                    String title2 = getReadsExploreSmallGridResponseModel.getTitle();
                    String subtitle2 = getReadsExploreSmallGridResponseModel.getSubtitle();
                    String deeplink2 = getReadsExploreSmallGridResponseModel.getDeeplink();
                    List<ExploreReadResponseModel> reads2 = getReadsExploreSmallGridResponseModel.getReads();
                    ArrayList arrayList3 = new ArrayList(p.a0(reads2, 10));
                    Iterator<T> it2 = reads2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(DataModelsToDomainModelsKt.toDomain((ExploreReadResponseModel) it2.next()));
                    }
                    Integer rows = getReadsExploreSmallGridResponseModel.getRows();
                    String deeplinkPosition = getReadsExploreSmallGridResponseModel.getDeeplinkPosition();
                    if (m.c(deeplinkPosition, "header")) {
                        exploreDeeplinkPosition = ExploreDeeplinkPosition.Header;
                    } else if (m.c(deeplinkPosition, "button")) {
                        exploreDeeplinkPosition = ExploreDeeplinkPosition.Button;
                    } else {
                        exploreDeeplinkPosition = null;
                    }
                    getReadsExploreTitleSubtitle = new ReadsExplorePage.Section.GetReadsExploreSmallGrid(title2, subtitle2, deeplink2, arrayList3, rows, exploreDeeplinkPosition);
                } else if (section instanceof GetReadsExplorePageResponseModel.Section.GetReadsExploreLargeGridResponseModel) {
                    GetReadsExplorePageResponseModel.Section.GetReadsExploreLargeGridResponseModel getReadsExploreLargeGridResponseModel = (GetReadsExplorePageResponseModel.Section.GetReadsExploreLargeGridResponseModel) section;
                    String title3 = getReadsExploreLargeGridResponseModel.getTitle();
                    String subtitle3 = getReadsExploreLargeGridResponseModel.getSubtitle();
                    String deeplink3 = getReadsExploreLargeGridResponseModel.getDeeplink();
                    List<ExploreReadResponseModel> reads3 = getReadsExploreLargeGridResponseModel.getReads();
                    ArrayList arrayList4 = new ArrayList(p.a0(reads3, 10));
                    Iterator<T> it3 = reads3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(DataModelsToDomainModelsKt.toDomain((ExploreReadResponseModel) it3.next()));
                    }
                    getReadsExploreTitleSubtitle = new ReadsExplorePage.Section.GetReadsExploreLargeGrid(title3, subtitle3, deeplink3, arrayList4, getReadsExploreLargeGridResponseModel.getRows());
                } else if (section instanceof GetReadsExplorePageResponseModel.Section.GetReadsExploreCardCollectionResponseModel) {
                    GetReadsExplorePageResponseModel.Section.GetReadsExploreCardCollectionResponseModel getReadsExploreCardCollectionResponseModel = (GetReadsExplorePageResponseModel.Section.GetReadsExploreCardCollectionResponseModel) section;
                    String title4 = getReadsExploreCardCollectionResponseModel.getTitle();
                    String subtitle4 = getReadsExploreCardCollectionResponseModel.getSubtitle();
                    String deeplink4 = getReadsExploreCardCollectionResponseModel.getDeeplink();
                    List<ExploreReadResponseModel> reads4 = getReadsExploreCardCollectionResponseModel.getReads();
                    ArrayList arrayList5 = new ArrayList(p.a0(reads4, 10));
                    Iterator<T> it4 = reads4.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(DataModelsToDomainModelsKt.toDomain((ExploreReadResponseModel) it4.next()));
                    }
                    getReadsExploreVoiceCollection = new ReadsExplorePage.Section.GetReadsExploreCardCollection(title4, subtitle4, deeplink4, arrayList5);
                } else if (section instanceof GetReadsExplorePageResponseModel.Section.GetReadsExploreHeroCarouselResponseModel) {
                    GetReadsExplorePageResponseModel.Section.GetReadsExploreHeroCarouselResponseModel getReadsExploreHeroCarouselResponseModel = (GetReadsExplorePageResponseModel.Section.GetReadsExploreHeroCarouselResponseModel) section;
                    String title5 = getReadsExploreHeroCarouselResponseModel.getTitle();
                    String subtitle5 = getReadsExploreHeroCarouselResponseModel.getSubtitle();
                    List<GetReadsExplorePageResponseModel.Section.GetReadsExploreHeroCarouselResponseModel.Item> items = getReadsExploreHeroCarouselResponseModel.getItems();
                    ArrayList arrayList6 = new ArrayList(p.a0(items, 10));
                    for (GetReadsExplorePageResponseModel.Section.GetReadsExploreHeroCarouselResponseModel.Item item : items) {
                        arrayList6.add(new ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item(item.getTitle(), item.getSubtitle(), item.getSwap_title_subtitle(), item.getBackground_image_url(), item.getBackground_video_url(), item.getDeeplink()));
                    }
                    getReadsExploreVoiceCollection = new ReadsExplorePage.Section.GetReadsExploreHeroCarousel(title5, subtitle5, arrayList6);
                } else if (section instanceof GetReadsExplorePageResponseModel.Section.GetReadsExploreVoiceCollectionResponseModel) {
                    GetReadsExplorePageResponseModel.Section.GetReadsExploreVoiceCollectionResponseModel getReadsExploreVoiceCollectionResponseModel = (GetReadsExplorePageResponseModel.Section.GetReadsExploreVoiceCollectionResponseModel) section;
                    String title6 = getReadsExploreVoiceCollectionResponseModel.getTitle();
                    String subtitle6 = getReadsExploreVoiceCollectionResponseModel.getSubtitle();
                    List<GetReadsExplorePageResponseModel.Section.GetReadsExploreVoiceCollectionResponseModel.VoiceItem> items2 = getReadsExploreVoiceCollectionResponseModel.getItems();
                    ArrayList arrayList7 = new ArrayList(p.a0(items2, 10));
                    for (GetReadsExplorePageResponseModel.Section.GetReadsExploreVoiceCollectionResponseModel.VoiceItem voiceItem : items2) {
                        String voice_id = voiceItem.getVoice_id();
                        String voice_name = voiceItem.getVoice_name();
                        String voice_subtitle = voiceItem.getVoice_subtitle();
                        String avatar_url = voiceItem.getAvatar_url();
                        List<ExploreReadResponseModel> reads5 = voiceItem.getReads();
                        ArrayList arrayList8 = new ArrayList(p.a0(reads5, 10));
                        Iterator<T> it5 = reads5.iterator();
                        while (it5.hasNext()) {
                            arrayList8.add(DataModelsToDomainModelsKt.toDomain((ExploreReadResponseModel) it5.next()));
                        }
                        arrayList7.add(new ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem(voice_id, voice_name, voice_subtitle, avatar_url, arrayList8, voiceItem.getDeeplink()));
                    }
                    getReadsExploreVoiceCollection = new ReadsExplorePage.Section.GetReadsExploreVoiceCollection(title6, subtitle6, arrayList7);
                } else if (section instanceof GetReadsExplorePageResponseModel.Section.GetReadsExploreTitleSubtitleResponseModel) {
                    GetReadsExplorePageResponseModel.Section.GetReadsExploreTitleSubtitleResponseModel getReadsExploreTitleSubtitleResponseModel = (GetReadsExplorePageResponseModel.Section.GetReadsExploreTitleSubtitleResponseModel) section;
                    getReadsExploreTitleSubtitle = new ReadsExplorePage.Section.GetReadsExploreTitleSubtitle(getReadsExploreTitleSubtitleResponseModel.getTitle(), getReadsExploreTitleSubtitleResponseModel.getSubtitle());
                } else {
                    c6.p();
                    return null;
                }
                getReadsExploreVoiceCollection = getReadsExploreTitleSubtitle;
            }
            arrayList.add(getReadsExploreVoiceCollection);
        }
        String language = getReadsExplorePageResponseModel.getLanguage();
        List<GetReadsExplorePageResponseModel.PageFilter> pageFilters = getReadsExplorePageResponseModel.getPageFilters();
        if (pageFilters == null) {
            pageFilters = t.f33547a;
        }
        ArrayList arrayList9 = new ArrayList(p.a0(pageFilters, 10));
        for (GetReadsExplorePageResponseModel.PageFilter pageFilter : pageFilters) {
            if (pageFilter instanceof GetReadsExplorePageResponseModel.PageFilter.ExplorePageOneOptionFilterResponseModel) {
                GetReadsExplorePageResponseModel.PageFilter.ExplorePageOneOptionFilterResponseModel explorePageOneOptionFilterResponseModel = (GetReadsExplorePageResponseModel.PageFilter.ExplorePageOneOptionFilterResponseModel) pageFilter;
                String title7 = explorePageOneOptionFilterResponseModel.getTitle();
                String key = explorePageOneOptionFilterResponseModel.getKey();
                List<KeyLabelResponseModel> options = explorePageOneOptionFilterResponseModel.getOptions();
                ArrayList arrayList10 = new ArrayList(p.a0(options, 10));
                Iterator<T> it6 = options.iterator();
                while (it6.hasNext()) {
                    arrayList10.add(toDomain((KeyLabelResponseModel) it6.next()));
                }
                explorePageMultiOptionFilterResponseModel = new PageFilter.ExplorePageOneOptionFilterResponseModel(title7, key, arrayList10, null, 8, null);
            } else if (pageFilter instanceof GetReadsExplorePageResponseModel.PageFilter.ExplorePageMultiOptionFilterResponseModel) {
                GetReadsExplorePageResponseModel.PageFilter.ExplorePageMultiOptionFilterResponseModel explorePageMultiOptionFilterResponseModel2 = (GetReadsExplorePageResponseModel.PageFilter.ExplorePageMultiOptionFilterResponseModel) pageFilter;
                String title8 = explorePageMultiOptionFilterResponseModel2.getTitle();
                String key2 = explorePageMultiOptionFilterResponseModel2.getKey();
                List<KeyLabelResponseModel> options2 = explorePageMultiOptionFilterResponseModel2.getOptions();
                ArrayList arrayList11 = new ArrayList(p.a0(options2, 10));
                Iterator<T> it7 = options2.iterator();
                while (it7.hasNext()) {
                    arrayList11.add(toDomain((KeyLabelResponseModel) it7.next()));
                }
                explorePageMultiOptionFilterResponseModel = new PageFilter.ExplorePageMultiOptionFilterResponseModel(title8, key2, arrayList11);
            } else {
                c6.p();
                return null;
            }
            arrayList9.add(explorePageMultiOptionFilterResponseModel);
        }
        return new ReadsExplorePage(arrayList, language, arrayList9, getReadsExplorePageResponseModel.getFilterOptions(), getReadsExplorePageResponseModel.getNextCursor());
    }

    @Override // io.elevenlabs.domain.services.ReadsExploreService
    public Object getExploreFilter(String str, String str2, Map<String, ? extends List<String>> map, String str3, String str4, wn.c<? super ir.i> cVar) {
        final m1 m1Var = new m1(new ReadsExploreServiceImpl$getExploreFilter$2(map, this, str, str2, str3, str4, null));
        return new ir.i() { // from class: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;
                final /* synthetic */ ReadsExploreServiceImpl this$0;

                @yn.e(c = "io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1$2", f = "ReadsExploreServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar, ReadsExploreServiceImpl readsExploreServiceImpl) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = readsExploreServiceImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                AsyncCallResult domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                                final ReadsExploreServiceImpl readsExploreServiceImpl = this.this$0;
                                AsyncCallResult map = ApiResultExtensionKt.map(domain, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: INVOKE (r5v3 'map' io.elevenlabs.domain.model.AsyncCallResult) = 
                                      (r5v2 'domain' io.elevenlabs.domain.model.AsyncCallResult)
                                      (wrap:ho.l:0x0043: CONSTRUCTOR (r3v0 'readsExploreServiceImpl' io.elevenlabs.data.services.ReadsExploreServiceImpl A[DONT_INLINE]) A[MD:(io.elevenlabs.data.services.ReadsExploreServiceImpl):void (m), WRAPPED] (LINE:68) call: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$3$1.<init>(io.elevenlabs.data.services.ReadsExploreServiceImpl):void type: CONSTRUCTOR)
                                     STATIC call: io.elevenlabs.data.extensions.ApiResultExtensionKt.map(io.elevenlabs.domain.model.AsyncCallResult, ho.l):io.elevenlabs.domain.model.AsyncCallResult A[DECLARE_VAR, MD:<T, R>:(io.elevenlabs.domain.model.AsyncCallResult<T>, ho.l):io.elevenlabs.domain.model.AsyncCallResult<R> (m)] (LINE:71) in method: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1.2.emit(java.lang.Object, wn.c):java.lang.Object, file: classes3.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$3$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 33 more
                                    */
                                /*
                                    this = this;
                                    boolean r0 = r6 instanceof io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L13
                                    r0 = r6
                                    io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1$2$1 r0 = (io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1$2$1 r0 = new io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1$2$1
                                    r0.<init>(r6)
                                L18:
                                    java.lang.Object r6 = r0.result
                                    int r1 = r0.label
                                    r2 = 1
                                    if (r1 == 0) goto L34
                                    if (r1 != r2) goto L2d
                                    java.lang.Object r5 = r0.L$3
                                    ir.j r5 = (ir.j) r5
                                    java.lang.Object r5 = r0.L$1
                                    io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1$2$1 r5 = (io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1.AnonymousClass2.AnonymousClass1) r5
                                    sn.a.g(r6)
                                    goto L61
                                L2d:
                                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                    com.google.protobuf.c6.x(r5)
                                    r5 = 0
                                    return r5
                                L34:
                                    sn.a.g(r6)
                                    ir.j r6 = r4.$this_unsafeFlow
                                    io.elevenlabs.data.model.ApiResult r5 = (io.elevenlabs.data.model.ApiResult) r5
                                    io.elevenlabs.domain.model.AsyncCallResult r5 = io.elevenlabs.data.extensions.ApiResultExtensionKt.toDomain(r5)
                                    io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$3$1 r1 = new io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$3$1
                                    io.elevenlabs.data.services.ReadsExploreServiceImpl r3 = r4.this$0
                                    r1.<init>(r3)
                                    io.elevenlabs.domain.model.AsyncCallResult r5 = io.elevenlabs.data.extensions.ApiResultExtensionKt.map(r5, r1)
                                    r1 = 0
                                    r0.L$0 = r1
                                    r0.L$1 = r1
                                    r0.L$2 = r1
                                    r0.L$3 = r1
                                    r1 = 0
                                    r0.I$0 = r1
                                    r0.label = r2
                                    java.lang.Object r5 = r6.emit(r5, r0)
                                    xn.a r6 = xn.a.f37986a
                                    if (r5 != r6) goto L61
                                    return r6
                                L61:
                                    sn.z r5 = sn.z.f31622a
                                    return r5
                                */
                                throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, wn.c):java.lang.Object");
                            }
                        }

                        @Override // ir.i
                        public Object collect(ir.j jVar, wn.c cVar2) {
                            Object collect = ir.i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                            if (collect == xn.a.f37986a) {
                                return collect;
                            }
                            return z.f31622a;
                        }
                    };
                }

                @Override // io.elevenlabs.domain.services.ReadsExploreService
                public Object getExploreIndex(String str, String str2, Map<String, ? extends List<String>> map, String str3, String str4, boolean z6, wn.c<? super ir.i> cVar) {
                    final m1 m1Var = new m1(new ReadsExploreServiceImpl$getExploreIndex$2(map, z6, this, str, str2, str3, str4, null));
                    return new ir.i() { // from class: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1

                        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1$2, reason: invalid class name */
                        /* loaded from: classes3.dex */
                        public static final class AnonymousClass2<T> implements ir.j {
                            final /* synthetic */ ir.j $this_unsafeFlow;
                            final /* synthetic */ ReadsExploreServiceImpl this$0;

                            @yn.e(c = "io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1$2", f = "ReadsExploreServiceImpl.kt", l = {50}, m = "emit", v = 2)
                            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                            /* renamed from: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1$2$1, reason: invalid class name */
                            /* loaded from: classes3.dex */
                            public static final class AnonymousClass1 extends yn.c {
                                int I$0;
                                Object L$0;
                                Object L$1;
                                Object L$2;
                                Object L$3;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(wn.c cVar) {
                                    super(cVar);
                                }

                                @Override // yn.a
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(ir.j jVar, ReadsExploreServiceImpl readsExploreServiceImpl) {
                                this.$this_unsafeFlow = jVar;
                                this.this$0 = readsExploreServiceImpl;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                            @Override // ir.j
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, wn.c cVar) {
                                AnonymousClass1 anonymousClass1;
                                int i10;
                                if (cVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) cVar;
                                    int i11 = anonymousClass1.label;
                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        i10 = anonymousClass1.label;
                                        if (i10 == 0) {
                                            if (i10 == 1) {
                                                sn.a.g(obj2);
                                            } else {
                                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                        } else {
                                            sn.a.g(obj2);
                                            ir.j jVar = this.$this_unsafeFlow;
                                            AsyncCallResult domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                                            final ReadsExploreServiceImpl readsExploreServiceImpl = this.this$0;
                                            AsyncCallResult map = ApiResultExtensionKt.map(domain, 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: INVOKE (r5v3 'map' io.elevenlabs.domain.model.AsyncCallResult) = 
                                                  (r5v2 'domain' io.elevenlabs.domain.model.AsyncCallResult)
                                                  (wrap:ho.l:0x0043: CONSTRUCTOR (r3v0 'readsExploreServiceImpl' io.elevenlabs.data.services.ReadsExploreServiceImpl A[DONT_INLINE]) A[MD:(io.elevenlabs.data.services.ReadsExploreServiceImpl):void (m), WRAPPED] (LINE:68) call: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$3$1.<init>(io.elevenlabs.data.services.ReadsExploreServiceImpl):void type: CONSTRUCTOR)
                                                 STATIC call: io.elevenlabs.data.extensions.ApiResultExtensionKt.map(io.elevenlabs.domain.model.AsyncCallResult, ho.l):io.elevenlabs.domain.model.AsyncCallResult A[DECLARE_VAR, MD:<T, R>:(io.elevenlabs.domain.model.AsyncCallResult<T>, ho.l):io.elevenlabs.domain.model.AsyncCallResult<R> (m)] (LINE:71) in method: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1.2.emit(java.lang.Object, wn.c):java.lang.Object, file: classes3.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$3$1, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 33 more
                                                */
                                            /*
                                                this = this;
                                                boolean r0 = r6 instanceof io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                                if (r0 == 0) goto L13
                                                r0 = r6
                                                io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1$2$1 r0 = (io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                                int r1 = r0.label
                                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                                r3 = r1 & r2
                                                if (r3 == 0) goto L13
                                                int r1 = r1 - r2
                                                r0.label = r1
                                                goto L18
                                            L13:
                                                io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1$2$1 r0 = new io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1$2$1
                                                r0.<init>(r6)
                                            L18:
                                                java.lang.Object r6 = r0.result
                                                int r1 = r0.label
                                                r2 = 1
                                                if (r1 == 0) goto L34
                                                if (r1 != r2) goto L2d
                                                java.lang.Object r5 = r0.L$3
                                                ir.j r5 = (ir.j) r5
                                                java.lang.Object r5 = r0.L$1
                                                io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1$2$1 r5 = (io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1.AnonymousClass2.AnonymousClass1) r5
                                                sn.a.g(r6)
                                                goto L61
                                            L2d:
                                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                                com.google.protobuf.c6.x(r5)
                                                r5 = 0
                                                return r5
                                            L34:
                                                sn.a.g(r6)
                                                ir.j r6 = r4.$this_unsafeFlow
                                                io.elevenlabs.data.model.ApiResult r5 = (io.elevenlabs.data.model.ApiResult) r5
                                                io.elevenlabs.domain.model.AsyncCallResult r5 = io.elevenlabs.data.extensions.ApiResultExtensionKt.toDomain(r5)
                                                io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$3$1 r1 = new io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$3$1
                                                io.elevenlabs.data.services.ReadsExploreServiceImpl r3 = r4.this$0
                                                r1.<init>(r3)
                                                io.elevenlabs.domain.model.AsyncCallResult r5 = io.elevenlabs.data.extensions.ApiResultExtensionKt.map(r5, r1)
                                                r1 = 0
                                                r0.L$0 = r1
                                                r0.L$1 = r1
                                                r0.L$2 = r1
                                                r0.L$3 = r1
                                                r1 = 0
                                                r0.I$0 = r1
                                                r0.label = r2
                                                java.lang.Object r5 = r6.emit(r5, r0)
                                                xn.a r6 = xn.a.f37986a
                                                if (r5 != r6) goto L61
                                                return r6
                                            L61:
                                                sn.z r5 = sn.z.f31622a
                                                return r5
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, wn.c):java.lang.Object");
                                        }
                                    }

                                    @Override // ir.i
                                    public Object collect(ir.j jVar, wn.c cVar2) {
                                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                                        if (collect == xn.a.f37986a) {
                                            return collect;
                                        }
                                        return z.f31622a;
                                    }
                                };
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                            @Override // io.elevenlabs.domain.services.ReadsExploreService
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object getExploreReads(String str, wn.c<? super AsyncCallResult<List<ReadMeta>>> cVar) {
                                ReadsExploreServiceImpl$getExploreReads$1 readsExploreServiceImpl$getExploreReads$1;
                                int i10;
                                if (cVar instanceof ReadsExploreServiceImpl$getExploreReads$1) {
                                    readsExploreServiceImpl$getExploreReads$1 = (ReadsExploreServiceImpl$getExploreReads$1) cVar;
                                    int i11 = readsExploreServiceImpl$getExploreReads$1.label;
                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                        readsExploreServiceImpl$getExploreReads$1.label = i11 - Integer.MIN_VALUE;
                                        Object obj = readsExploreServiceImpl$getExploreReads$1.result;
                                        i10 = readsExploreServiceImpl$getExploreReads$1.label;
                                        if (i10 == 0) {
                                            if (i10 == 1) {
                                                sn.a.g(obj);
                                            } else {
                                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                        } else {
                                            sn.a.g(obj);
                                            ReadsAPI readsAPI = this.readsAPI;
                                            readsExploreServiceImpl$getExploreReads$1.L$0 = null;
                                            readsExploreServiceImpl$getExploreReads$1.label = 1;
                                            obj = readsAPI.getExploreReads(str, readsExploreServiceImpl$getExploreReads$1);
                                            xn.a aVar = xn.a.f37986a;
                                            if (obj == aVar) {
                                                return aVar;
                                            }
                                        }
                                        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(22));
                                    }
                                }
                                readsExploreServiceImpl$getExploreReads$1 = new ReadsExploreServiceImpl$getExploreReads$1(this, cVar);
                                Object obj2 = readsExploreServiceImpl$getExploreReads$1.result;
                                i10 = readsExploreServiceImpl$getExploreReads$1.label;
                                if (i10 == 0) {
                                }
                                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(22));
                            }

                            @Override // io.elevenlabs.domain.services.ReadsExploreService
                            public String getPersistedExploreLanguage() {
                                return getExploreLanguagePreference();
                            }

                            @Override // io.elevenlabs.domain.services.ReadsExploreService
                            public ir.i observePersistedExploreLanguage() {
                                return SharedPreferencesExtensionsKt.observe(this.userSharedPreferences, "explore_selected_language", new ReadsExploreServiceImpl$observePersistedExploreLanguage$1(null));
                            }

                            @Override // io.elevenlabs.domain.services.ReadsExploreService
                            public Object postSearchItemClick(String str, String str2, String str3, wn.c<? super z> cVar) {
                                Object reportClick = this.exploreSearchApi.reportClick(str, new SearchClickRequest(str2, str3), cVar);
                                if (reportClick == xn.a.f37986a) {
                                    return reportClick;
                                }
                                return z.f31622a;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
                            
                                if (r12 == r8) goto L54;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
                            
                                if (r12 == r8) goto L54;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
                            /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
                            @Override // io.elevenlabs.domain.services.ReadsExploreService
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object search(String str, String str2, wn.c<? super AsyncCallResult<ReadsExploreSearchResults>> cVar) {
                                ReadsExploreServiceImpl$search$1 readsExploreServiceImpl$search$1;
                                int i10;
                                ApiResult apiResult;
                                if (cVar instanceof ReadsExploreServiceImpl$search$1) {
                                    readsExploreServiceImpl$search$1 = (ReadsExploreServiceImpl$search$1) cVar;
                                    int i11 = readsExploreServiceImpl$search$1.label;
                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                        readsExploreServiceImpl$search$1.label = i11 - Integer.MIN_VALUE;
                                        ReadsExploreServiceImpl$search$1 readsExploreServiceImpl$search$12 = readsExploreServiceImpl$search$1;
                                        Object obj = readsExploreServiceImpl$search$12.result;
                                        i10 = readsExploreServiceImpl$search$12.label;
                                        if (i10 == 0) {
                                            if (i10 != 1) {
                                                if (i10 == 2) {
                                                    sn.a.g(obj);
                                                    apiResult = (ApiResult) obj;
                                                } else {
                                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                                    return null;
                                                }
                                            } else {
                                                sn.a.g(obj);
                                                apiResult = (ApiResult) obj;
                                            }
                                        } else {
                                            sn.a.g(obj);
                                            boolean m02 = n.m0(str);
                                            ReadsExploreSearchAPI readsExploreSearchAPI = this.exploreSearchApi;
                                            xn.a aVar = xn.a.f37986a;
                                            if (m02) {
                                                readsExploreServiceImpl$search$12.L$0 = null;
                                                readsExploreServiceImpl$search$12.L$1 = null;
                                                readsExploreServiceImpl$search$12.label = 1;
                                                obj = readsExploreSearchAPI.discovery(readsExploreServiceImpl$search$12);
                                            } else {
                                                readsExploreServiceImpl$search$12.L$0 = null;
                                                readsExploreServiceImpl$search$12.L$1 = null;
                                                readsExploreServiceImpl$search$12.label = 2;
                                                obj = ReadsExploreSearchAPI.search$default(readsExploreSearchAPI, str, null, str2, readsExploreServiceImpl$search$12, 2, null);
                                            }
                                            return aVar;
                                        }
                                        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new a(this, 3));
                                    }
                                }
                                readsExploreServiceImpl$search$1 = new ReadsExploreServiceImpl$search$1(this, cVar);
                                ReadsExploreServiceImpl$search$1 readsExploreServiceImpl$search$122 = readsExploreServiceImpl$search$1;
                                Object obj2 = readsExploreServiceImpl$search$122.result;
                                i10 = readsExploreServiceImpl$search$122.label;
                                if (i10 == 0) {
                                }
                                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new a(this, 3));
                            }

                            @Override // io.elevenlabs.domain.services.ReadsExploreService
                            public void setPersistedExploreLanguage(String language) {
                                language.getClass();
                                setExploreLanguagePreference(language);
                            }

                            private final KeyLabel toDomain(KeyLabelResponseModel keyLabelResponseModel) {
                                return new KeyLabel(keyLabelResponseModel.getKey(), keyLabelResponseModel.getLabel());
                            }

                            private final ReadsExploreSearchResults toDomain(GetExploreSearchResponse getExploreSearchResponse) {
                                String nextCursor = getExploreSearchResponse.getNextCursor();
                                boolean hasMore = getExploreSearchResponse.getHasMore();
                                List<GetExploreSearchResponse.Section> items = getExploreSearchResponse.getItems();
                                ArrayList arrayList = new ArrayList(p.a0(items, 10));
                                Iterator<T> it = items.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(toDomain((GetExploreSearchResponse.Section) it.next()));
                                }
                                return new ReadsExploreSearchResults(arrayList, hasMore, nextCursor, getExploreSearchResponse.getSearchId());
                            }

                            private final SearchSection toDomain(GetExploreSearchResponse.Section section) {
                                if (section instanceof GetExploreSearchResponse.Section.Collection) {
                                    return new SearchSection.Collection(CollectionsServiceImplKt.toDomain(((GetExploreSearchResponse.Section.Collection) section).getCollection()));
                                }
                                if (section instanceof GetExploreSearchResponse.Section.GlobalRead) {
                                    return new SearchSection.GlobalRead(ReadMappingKt.toDomain(((GetExploreSearchResponse.Section.GlobalRead) section).getRead()));
                                }
                                if (section instanceof GetExploreSearchResponse.Section.SearchList) {
                                    GetExploreSearchResponse.Section.SearchList searchList = (GetExploreSearchResponse.Section.SearchList) section;
                                    String title = searchList.getTitle();
                                    List<GetExploreSearchResponse.Result> searches = searchList.getSearches();
                                    ArrayList arrayList = new ArrayList(p.a0(searches, 10));
                                    Iterator<T> it = searches.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(toDomain((GetExploreSearchResponse.Result) it.next()));
                                    }
                                    return new SearchSection.SearchList(title, arrayList);
                                }
                                if (section instanceof GetExploreSearchResponse.Section.GenericItem) {
                                    GetExploreSearchResponse.Section.GenericItem genericItem = (GetExploreSearchResponse.Section.GenericItem) section;
                                    return new SearchSection.GenericItem(genericItem.getImage(), genericItem.getTitle(), genericItem.getSubtitle(), genericItem.getText(), genericItem.getDeeplink());
                                }
                                c6.p();
                                return null;
                            }

                            private final SearchResult toDomain(GetExploreSearchResponse.Result result) {
                                if (result instanceof GetExploreSearchResponse.Result.Collection) {
                                    return new SearchResult.Collection(CollectionsServiceImplKt.toDomain(((GetExploreSearchResponse.Result.Collection) result).getCollection()));
                                }
                                if (result instanceof GetExploreSearchResponse.Result.GlobalRead) {
                                    return new SearchResult.GlobalRead(ReadMappingKt.toDomain(((GetExploreSearchResponse.Result.GlobalRead) result).getRead()));
                                }
                                c6.p();
                                return null;
                            }
                        }

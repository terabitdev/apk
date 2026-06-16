package io.elevenlabs.readerapp.ui.previews;

import ae.l;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.ExplorePricingType;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.domain.model.PageFilter;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.domain.model.SearchResult;
import io.elevenlabs.domain.model.SearchSection;
import io.elevenlabs.readerapp.ui.components.MetaStatKeys;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import no.e;
import no.g;
import tn.p;
import tn.y;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005\u001a\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005\u001a\u0006\u0010\u000b\u001a\u00020\f\u001a\u0006\u0010\r\u001a\u00020\u000e\u001a\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u0006\u0010\u0013\u001a\u00020\u0014\u001a\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u0006\u0010\u0017\u001a\u00020\u0016\u001a\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0006\u0010\u001a\u001a\u00020\u001b\u001a\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"SAMPLE_BLUR_PLACEHOLDER", "", "stubExploreRead", "Lio/elevenlabs/domain/model/ExploreRead;", FirebaseAnalytics.Param.INDEX, "", "stubExploreReadList", "", "count", "stubSquarishReadList", "stubMixedAspectReadList", "stubReadsExplorePage", "Lio/elevenlabs/domain/model/ReadsExplorePage;", "stubReadsExploreHighlightedCarousel", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreHighlightedCarousel;", "stubReadsExploreSmallGrid", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreSmallGrid;", "stubReadsExploreLargeGrid", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreLargeGrid;", "stubReadsExploreCardCollection", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreCardCollection;", "stubReadsExploreHeroCarousel", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreHeroCarousel;", "stubReadsExploreHeroCarouselNoSubtitles", "stubReadsExploreVoiceCollection", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreVoiceCollection;", "stubReadsExploreTitleSubtitle", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreTitleSubtitle;", "stubReadsExploreSearch", "Lio/elevenlabs/domain/model/SearchSection;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreFactoryKt {
    public static final String SAMPLE_BLUR_PLACEHOLDER = "UklGRkQAAABXRUJQVlA4IDgAAACwAQCdASoIAAgABUB8JbACdADZgoAAAP4/XmAws4d03lIrKEJO5JWckTtDHvLavGDMIAmS4BZAAA==";

    public static final ExploreRead stubExploreRead(int i10) {
        ExplorePricingType explorePricingType;
        Float f10;
        String e10 = f.e(i10, "readId-");
        String e11 = f.e(i10, "Title ");
        String e12 = f.e(i10, "Author ");
        Float valueOf = Float.valueOf((i10 * 600.0f) + 3600.0f);
        Float valueOf2 = Float.valueOf(4.2f);
        Integer valueOf3 = Integer.valueOf(i10 + 42);
        int i11 = i10 % 2;
        if (i11 == 0) {
            explorePricingType = ExplorePricingType.Free;
        } else {
            explorePricingType = ExplorePricingType.Paid;
        }
        String str = null;
        if (i11 != 0) {
            f10 = Float.valueOf(9.99f);
        } else {
            f10 = null;
        }
        Integer valueOf4 = Integer.valueOf((i10 * 100) + 1200);
        if (i11 != 0) {
            str = f.e(i10, "com.elevenlabs.book_");
        }
        return new ExploreRead(e10, e11, e12, null, valueOf, valueOf2, valueOf3, explorePricingType, f10, "USD", valueOf4, str, b.j(i10, "https://storage.googleapis.com/xi-labs-audio/preview_", ".mp3"), null, null, SAMPLE_BLUR_PLACEHOLDER, 24576, null);
    }

    public static /* synthetic */ ExploreRead stubExploreRead$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return stubExploreRead(i10);
    }

    public static final List<ExploreRead> stubExploreReadList(int i10) {
        g f02 = l.f0(0, i10);
        ArrayList arrayList = new ArrayList(p.a0(f02, 10));
        Iterator it = f02.iterator();
        while (it.hasNext()) {
            arrayList.add(stubExploreRead(((y) it).nextInt()));
        }
        return arrayList;
    }

    public static /* synthetic */ List stubExploreReadList$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return stubExploreReadList(i10);
    }

    public static final List<ExploreRead> stubMixedAspectReadList(int i10) {
        double d10;
        List<ExploreRead> stubExploreReadList = stubExploreReadList(i10);
        ArrayList arrayList = new ArrayList(p.a0(stubExploreReadList, 10));
        int i11 = 0;
        for (Object obj : stubExploreReadList) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                ExploreRead exploreRead = (ExploreRead) obj;
                if (i11 % 2 == 0) {
                    d10 = 1.0d;
                } else {
                    d10 = 0.6666666666666666d;
                }
                arrayList.add(ExploreRead.copy$default(exploreRead, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(d10), null, 49151, null));
                i11 = i12;
            } else {
                ig.f.U();
                throw null;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List stubMixedAspectReadList$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return stubMixedAspectReadList(i10);
    }

    public static final ReadsExplorePage.Section.GetReadsExploreCardCollection stubReadsExploreCardCollection() {
        return new ReadsExplorePage.Section.GetReadsExploreCardCollection("Card Collection", "Curated picks", "elevenlabs://explore/card-collection", stubExploreReadList(6));
    }

    public static final ReadsExplorePage.Section.GetReadsExploreHeroCarousel stubReadsExploreHeroCarousel() {
        return new ReadsExplorePage.Section.GetReadsExploreHeroCarousel("Hero Carousel", null, ig.f.I(new ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item("THE ULTIMATE STARTERS", "ElevenLabs team favorites", false, "https://firebasestorage.googleapis.com/v0/b/xi-labs-dev.appspot.com/o/carousel-cover.png?alt=media&token=73cc3de7-023f-47ac-b319-4013a697e629", null, "elevenlabs://collection/collection-id"), new ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item("GREAT FOR COMMUTES", "Bite-sized wisdom", true, "https://firebasestorage.googleapis.com/v0/b/xi-labs-dev.appspot.com/o/carousel-cover-2.png?alt=media&token=8f171d9b-8dc1-4ace-8def-9a345914ce8c", null, "elevenlabs://collection/collection-id")));
    }

    public static final ReadsExplorePage.Section.GetReadsExploreHeroCarousel stubReadsExploreHeroCarouselNoSubtitles() {
        return new ReadsExplorePage.Section.GetReadsExploreHeroCarousel("What's Trending", null, ig.f.I(new ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item("Summer Beach Reads", null, false, "https://storage.googleapis.com/eleven-public-cdn/database/reads/read_collection/dynamic_en_darkacademia/card.webp?v=1764872869", null, "elevenlabs://collection/dynamic_en_darkacademia"), new ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item("Essential Classics", null, false, "https://storage.googleapis.com/eleven-public-cdn/database/reads/read_collection/dynamic_en_rainydayreads/card.webp?v=1764872471", null, "elevenlabs://collection/dynamic_en_rainydayreads")));
    }

    public static final ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel stubReadsExploreHighlightedCarousel() {
        return new ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel("Highlighted Carousel", "Featured reads picked for you", "elevenlabs://explore/highlighted", stubExploreReadList(6));
    }

    public static final ReadsExplorePage.Section.GetReadsExploreLargeGrid stubReadsExploreLargeGrid() {
        return new ReadsExplorePage.Section.GetReadsExploreLargeGrid("Large Grid", "Top titles", "elevenlabs://explore/large-grid", stubExploreReadList(6), null, 16, null);
    }

    public static final ReadsExplorePage stubReadsExplorePage() {
        List I = ig.f.I(stubReadsExploreHighlightedCarousel(), stubReadsExploreSmallGrid(), stubReadsExploreLargeGrid(), stubReadsExploreCardCollection(), stubReadsExploreHeroCarousel(), stubReadsExploreVoiceCollection(), stubReadsExploreTitleSubtitle());
        PageFilter.ExplorePageOneOptionFilterResponseModel explorePageOneOptionFilterResponseModel = new PageFilter.ExplorePageOneOptionFilterResponseModel("Price", FirebaseAnalytics.Param.PRICE, ig.f.I(new KeyLabel("free", "Free"), new KeyLabel("paid", "Paid")), null, 8, null);
        PageFilter.ExplorePageOneOptionFilterResponseModel explorePageOneOptionFilterResponseModel2 = new PageFilter.ExplorePageOneOptionFilterResponseModel("Language", "language", ig.f.I(new KeyLabel("en", "English"), new KeyLabel("pl", "Polish")), null, 8, null);
        PageFilter.ExplorePageMultiOptionFilterResponseModel explorePageMultiOptionFilterResponseModel = new PageFilter.ExplorePageMultiOptionFilterResponseModel("Genre", "genre", ig.f.I(new KeyLabel("Romance", "Romance"), new KeyLabel("History", "History")));
        e eVar = new e(1, 4, 1);
        ArrayList arrayList = new ArrayList(p.a0(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            int nextInt = ((y) it).nextInt();
            arrayList.add(new KeyLabel(String.valueOf(nextInt), nextInt + "+"));
        }
        return new ReadsExplorePage(I, "en", ig.f.I(explorePageOneOptionFilterResponseModel, explorePageOneOptionFilterResponseModel2, explorePageMultiOptionFilterResponseModel, new PageFilter.ExplorePageOneOptionFilterResponseModel("Rating", MetaStatKeys.KEY_RATING, arrayList, null, 8, null), new PageFilter.ExplorePageOneOptionFilterResponseModel("Sort by", "sort_by", ig.f.I(new KeyLabel("relevance", "Relevance"), new KeyLabel("newest", "Newest"), new KeyLabel("popularity", "Popularity")), null, 8, null)), null, null, 24, null);
    }

    public static final List<SearchSection> stubReadsExploreSearch() {
        return ig.f.I(new SearchSection.SearchList("Trending searches", ig.f.I(new SearchResult.GlobalRead(ReadsFactoryKt.stubReadMeta$default(null, 1, null)), new SearchResult.Collection(CollectionFactoryKt.stubCollectionMeta()))), new SearchSection.GlobalRead(ReadsFactoryKt.stubReadMeta$default(null, 1, null)), new SearchSection.Collection(CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, null, "Travel", null, false, null, new Date(1729581650L), "feed", null, false, null, 3703, null)), new SearchSection.GenericItem("https://picsum.photos/200", "Title", "Subtitle", "Text", "elevenlabs://account"), new SearchSection.GenericItem("https://picsum.photos/200", "Title but no subtitle", null, "Text", "elevenlabs://account", 4, null), new SearchSection.GenericItem("https://picsum.photos/200", "Just a title", null, null, "elevenlabs://account", 12, null));
    }

    public static final ReadsExplorePage.Section.GetReadsExploreSmallGrid stubReadsExploreSmallGrid() {
        return new ReadsExplorePage.Section.GetReadsExploreSmallGrid("Small Grid", "Quick reads", "elevenlabs://explore/small-grid", stubExploreReadList(6), null, null, 48, null);
    }

    public static final ReadsExplorePage.Section.GetReadsExploreTitleSubtitle stubReadsExploreTitleSubtitle() {
        return new ReadsExplorePage.Section.GetReadsExploreTitleSubtitle("New Arrivals", "Fresh content added this week");
    }

    public static final ReadsExplorePage.Section.GetReadsExploreVoiceCollection stubReadsExploreVoiceCollection() {
        return new ReadsExplorePage.Section.GetReadsExploreVoiceCollection("Voice Collection", "Top voices", ig.f.I(new ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem("voice-1", "Alice", "Calm & clear", null, stubExploreReadList(3), "elevenlabs://collection/voice-1"), new ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem("voice-2", "Bob", null, "https://i.imgur.com/D4p4Xhz.jpeg", stubExploreReadList(3), null)));
    }

    public static final List<ExploreRead> stubSquarishReadList(int i10) {
        List<ExploreRead> stubExploreReadList = stubExploreReadList(i10);
        ArrayList arrayList = new ArrayList(p.a0(stubExploreReadList, 10));
        Iterator<T> it = stubExploreReadList.iterator();
        while (it.hasNext()) {
            arrayList.add(ExploreRead.copy$default((ExploreRead) it.next(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(1.0d), null, 49151, null));
        }
        return arrayList;
    }

    public static /* synthetic */ List stubSquarishReadList$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return stubSquarishReadList(i10);
    }
}

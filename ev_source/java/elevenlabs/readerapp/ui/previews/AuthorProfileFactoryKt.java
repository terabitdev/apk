package io.elevenlabs.readerapp.ui.previews;

import ig.f;
import io.elevenlabs.domain.model.AuthorActionsSection;
import io.elevenlabs.domain.model.AuthorProfile;
import io.elevenlabs.domain.model.AuthorProfileHeaderSection;
import io.elevenlabs.domain.model.AuthorProfilePage;
import io.elevenlabs.domain.model.AuthorProfileResourceTag;
import io.elevenlabs.domain.model.AuthorProfileSection;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadSection;
import io.elevenlabs.domain.model.SeriesSection;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.o;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u0006\u0010\b\u001a\u00020\t\u001a\u0010\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0006\u0010\u0011\u001a\u00020\u000f¨\u0006\u0012"}, d2 = {"stubAuthorResourceTags", "", "Lio/elevenlabs/domain/model/AuthorProfileResourceTag;", "stubAuthorHeader", "Lio/elevenlabs/domain/model/AuthorProfileSection$Header;", "stubSeriesSection", "Lio/elevenlabs/domain/model/AuthorProfileSection$Series;", "stubFantasySeriesSection", "stubReadSection", "Lio/elevenlabs/domain/model/AuthorProfileSection$Read;", "stubAuthorActions", "Lio/elevenlabs/domain/model/AuthorProfileSection$Actions;", "isFollowing", "", "stubAuthorWithBooks", "Lio/elevenlabs/domain/model/AuthorProfile;", "stubAuthorWithSubpages", "stubAuthorMinimal", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AuthorProfileFactoryKt {
    public static final AuthorProfileSection.Actions stubAuthorActions(boolean z6) {
        return new AuthorProfileSection.Actions(new AuthorActionsSection("jane-austen", "Jane Austen", "https://example.com", z6));
    }

    public static /* synthetic */ AuthorProfileSection.Actions stubAuthorActions$default(boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        return stubAuthorActions(z6);
    }

    public static final AuthorProfileSection.Header stubAuthorHeader() {
        return new AuthorProfileSection.Header(new AuthorProfileHeaderSection("Jane Austen", "Jane Austen was an English novelist known primarily for her six major novels, which interpret, critique and comment upon the British landed gentry at the end of the 18th century.", "https://example.com/jane-austen.jpg", "A Lady", stubAuthorResourceTags(), 6, 2, 1250));
    }

    public static final AuthorProfile stubAuthorMinimal() {
        return new AuthorProfile(f.I(new AuthorProfileSection.Header(new AuthorProfileHeaderSection("Charles Dickens", null, null, null, null, 15, 0, 42)), new AuthorProfileSection.Actions(new AuthorActionsSection("charles-dickens", "Charles Dickens", "https://example.com", true))), t.f33547a, true);
    }

    public static final List<AuthorProfileResourceTag> stubAuthorResourceTags() {
        return f.I(new AuthorProfileResourceTag("https://example.com/twitter.png", "Twitter", "https://twitter.com/author"), new AuthorProfileResourceTag("https://example.com/website.png", "Website", "https://author-website.com"));
    }

    public static final AuthorProfile stubAuthorWithBooks() {
        return new AuthorProfile(f.I(stubAuthorHeader(), stubAuthorActions$default(false, 1, null), stubReadSection()), t.f33547a, true);
    }

    public static final AuthorProfile stubAuthorWithSubpages() {
        List I = f.I(stubAuthorHeader(), stubAuthorActions$default(false, 1, null));
        t tVar = t.f33547a;
        return new AuthorProfile(I, f.I(new AuthorProfilePage("books", "Books", tVar, null, null, null, 56, null), new AuthorProfilePage("series", "Series", tVar, null, null, null, 56, null)), true);
    }

    public static final AuthorProfileSection.Series stubFantasySeriesSection() {
        return new AuthorProfileSection.Series(new SeriesSection("elevenlabs://series/narnia", "The Chronicles of Narnia", "7 book series", "https://example.com/narnia-showcase.jpg"));
    }

    public static final AuthorProfileSection.Read stubReadSection() {
        return new AuthorProfileSection.Read(new ReadSection((ReadMeta) o.w0(ReadsFactoryKt.stubReadMetaList$default(1, null, 2, null)), "Book 1"));
    }

    public static final AuthorProfileSection.Series stubSeriesSection() {
        return new AuthorProfileSection.Series(new SeriesSection("elevenlabs://series/lord-of-the-rings", "The Lord of The Rings", "3 book series", "https://example.com/lotr-showcase.jpg"));
    }
}

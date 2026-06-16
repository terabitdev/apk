package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.extensions.DataModelsToDomainModelsKt;
import io.elevenlabs.data.model.ResourceTag;
import io.elevenlabs.data.model.XiBackendRoutesReaderAuthorProfilesSubpageOverview;
import io.elevenlabs.data.model.response.AuthorActionsSection;
import io.elevenlabs.data.model.response.AuthorHeaderSection;
import io.elevenlabs.data.model.response.AuthorProfileResponse;
import io.elevenlabs.data.model.response.AuthorProfileSection;
import io.elevenlabs.data.model.response.ReadSection;
import io.elevenlabs.data.model.response.SeriesSection;
import io.elevenlabs.domain.model.AuthorProfile;
import io.elevenlabs.domain.model.AuthorProfileHeaderSection;
import io.elevenlabs.domain.model.AuthorProfilePage;
import io.elevenlabs.domain.model.AuthorProfileResourceTag;
import io.elevenlabs.domain.model.AuthorProfileSection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.p;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0002¨\u0006\t"}, d2 = {"toDomain", "Lio/elevenlabs/domain/model/AuthorProfile;", "Lio/elevenlabs/data/model/response/AuthorProfileResponse;", "Lio/elevenlabs/domain/model/AuthorProfileSection;", "Lio/elevenlabs/data/model/response/AuthorProfileSection;", "Lio/elevenlabs/domain/model/AuthorProfileHeaderSection;", "Lio/elevenlabs/data/model/response/AuthorHeaderSection;", "Lio/elevenlabs/domain/model/AuthorActionsSection;", "Lio/elevenlabs/data/model/response/AuthorActionsSection;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AuthorServiceImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthorProfile toDomain(AuthorProfileResponse authorProfileResponse) {
        List<AuthorProfileSection> sections = authorProfileResponse.getSections();
        ArrayList arrayList = new ArrayList(p.a0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain((AuthorProfileSection) it.next()));
        }
        List<XiBackendRoutesReaderAuthorProfilesSubpageOverview> subpages = authorProfileResponse.getSubpages();
        ArrayList arrayList2 = new ArrayList(p.a0(subpages, 10));
        for (XiBackendRoutesReaderAuthorProfilesSubpageOverview xiBackendRoutesReaderAuthorProfilesSubpageOverview : subpages) {
            arrayList2.add(new AuthorProfilePage(xiBackendRoutesReaderAuthorProfilesSubpageOverview.getId(), xiBackendRoutesReaderAuthorProfilesSubpageOverview.getTitle(), t.f33547a, xiBackendRoutesReaderAuthorProfilesSubpageOverview.getAvailableSorts(), xiBackendRoutesReaderAuthorProfilesSubpageOverview.getDefaultSort().getValue(), xiBackendRoutesReaderAuthorProfilesSubpageOverview.getItemCountLabel()));
        }
        return new AuthorProfile(arrayList, arrayList2, authorProfileResponse.isFollowing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.elevenlabs.domain.model.AuthorProfileSection toDomain(AuthorProfileSection authorProfileSection) {
        if (authorProfileSection instanceof AuthorHeaderSection) {
            return new AuthorProfileSection.Header(toDomain((AuthorHeaderSection) authorProfileSection));
        }
        if (authorProfileSection instanceof SeriesSection) {
            return new AuthorProfileSection.Series(DataModelsToDomainModelsKt.toDomain((SeriesSection) authorProfileSection));
        }
        if (authorProfileSection instanceof ReadSection) {
            return new AuthorProfileSection.Read(DataModelsToDomainModelsKt.toDomain((ReadSection) authorProfileSection));
        }
        if (authorProfileSection instanceof AuthorActionsSection) {
            return new AuthorProfileSection.Actions(toDomain((AuthorActionsSection) authorProfileSection));
        }
        c6.p();
        return null;
    }

    private static final AuthorProfileHeaderSection toDomain(AuthorHeaderSection authorHeaderSection) {
        ArrayList arrayList;
        String name = authorHeaderSection.getName();
        String bio = authorHeaderSection.getBio();
        String avatarUrl = authorHeaderSection.getAvatarUrl();
        String penName = authorHeaderSection.getPenName();
        List<ResourceTag> resourceTags = authorHeaderSection.getResourceTags();
        if (resourceTags != null) {
            arrayList = new ArrayList(p.a0(resourceTags, 10));
            for (ResourceTag resourceTag : resourceTags) {
                arrayList.add(new AuthorProfileResourceTag(resourceTag.getIcon(), resourceTag.getTitle(), resourceTag.getUrl()));
            }
        } else {
            arrayList = null;
        }
        return new AuthorProfileHeaderSection(name, bio, avatarUrl, penName, arrayList, authorHeaderSection.getBookCount(), authorHeaderSection.getSeriesCount(), authorHeaderSection.getFollowersCount());
    }

    private static final io.elevenlabs.domain.model.AuthorActionsSection toDomain(AuthorActionsSection authorActionsSection) {
        return new io.elevenlabs.domain.model.AuthorActionsSection(authorActionsSection.getAuthorId(), authorActionsSection.getAuthorName(), authorActionsSection.getShareLink(), authorActionsSection.isFollowing());
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.AuthorProfile;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003Jc\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rHÆ\u0001J\u0014\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/author/AuthorProfileState;", "", "authorId", "", "author", "Lio/elevenlabs/domain/model/AuthorProfile;", "isLoadingProfile", "", "isFollowOperationInFlight", "errorMessage", "selectedSubpage", "Lio/elevenlabs/readerapp/ui/screens/authenticated/author/SelectedSubpage;", "currentSubpageSortKeys", "", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/AuthorProfile;ZZLjava/lang/String;Lio/elevenlabs/readerapp/ui/screens/authenticated/author/SelectedSubpage;Ljava/util/Map;)V", "getAuthorId", "()Ljava/lang/String;", "getAuthor", "()Lio/elevenlabs/domain/model/AuthorProfile;", "()Z", "getErrorMessage", "getSelectedSubpage", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/author/SelectedSubpage;", "getCurrentSubpageSortKeys", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class AuthorProfileState {
    public static final int $stable = 8;
    private final AuthorProfile author;
    private final String authorId;
    private final Map<String, String> currentSubpageSortKeys;
    private final String errorMessage;
    private final boolean isFollowOperationInFlight;
    private final boolean isLoadingProfile;
    private final SelectedSubpage selectedSubpage;

    public /* synthetic */ AuthorProfileState(String str, AuthorProfile authorProfile, boolean z6, boolean z10, String str2, SelectedSubpage selectedSubpage, Map map, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : authorProfile, (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : selectedSubpage, (i10 & 64) != 0 ? u.f33548a : map);
    }

    public static /* synthetic */ AuthorProfileState copy$default(AuthorProfileState authorProfileState, String str, AuthorProfile authorProfile, boolean z6, boolean z10, String str2, SelectedSubpage selectedSubpage, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authorProfileState.authorId;
        }
        if ((i10 & 2) != 0) {
            authorProfile = authorProfileState.author;
        }
        if ((i10 & 4) != 0) {
            z6 = authorProfileState.isLoadingProfile;
        }
        if ((i10 & 8) != 0) {
            z10 = authorProfileState.isFollowOperationInFlight;
        }
        if ((i10 & 16) != 0) {
            str2 = authorProfileState.errorMessage;
        }
        if ((i10 & 32) != 0) {
            selectedSubpage = authorProfileState.selectedSubpage;
        }
        if ((i10 & 64) != 0) {
            map = authorProfileState.currentSubpageSortKeys;
        }
        SelectedSubpage selectedSubpage2 = selectedSubpage;
        Map map2 = map;
        String str3 = str2;
        boolean z11 = z6;
        return authorProfileState.copy(str, authorProfile, z11, z10, str3, selectedSubpage2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* renamed from: component2, reason: from getter */
    public final AuthorProfile getAuthor() {
        return this.author;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoadingProfile() {
        return this.isLoadingProfile;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFollowOperationInFlight() {
        return this.isFollowOperationInFlight;
    }

    /* renamed from: component5, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component6, reason: from getter */
    public final SelectedSubpage getSelectedSubpage() {
        return this.selectedSubpage;
    }

    public final Map<String, String> component7() {
        return this.currentSubpageSortKeys;
    }

    public final AuthorProfileState copy(String authorId, AuthorProfile author, boolean isLoadingProfile, boolean isFollowOperationInFlight, String errorMessage, SelectedSubpage selectedSubpage, Map<String, String> currentSubpageSortKeys) {
        currentSubpageSortKeys.getClass();
        return new AuthorProfileState(authorId, author, isLoadingProfile, isFollowOperationInFlight, errorMessage, selectedSubpage, currentSubpageSortKeys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorProfileState)) {
            return false;
        }
        AuthorProfileState authorProfileState = (AuthorProfileState) other;
        if (kotlin.jvm.internal.m.c(this.authorId, authorProfileState.authorId) && kotlin.jvm.internal.m.c(this.author, authorProfileState.author) && this.isLoadingProfile == authorProfileState.isLoadingProfile && this.isFollowOperationInFlight == authorProfileState.isFollowOperationInFlight && kotlin.jvm.internal.m.c(this.errorMessage, authorProfileState.errorMessage) && kotlin.jvm.internal.m.c(this.selectedSubpage, authorProfileState.selectedSubpage) && kotlin.jvm.internal.m.c(this.currentSubpageSortKeys, authorProfileState.currentSubpageSortKeys)) {
            return true;
        }
        return false;
    }

    public final AuthorProfile getAuthor() {
        return this.author;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final Map<String, String> getCurrentSubpageSortKeys() {
        return this.currentSubpageSortKeys;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final SelectedSubpage getSelectedSubpage() {
        return this.selectedSubpage;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.authorId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        AuthorProfile authorProfile = this.author;
        if (authorProfile == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = authorProfile.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((i11 + hashCode2) * 31, 31, this.isLoadingProfile), 31, this.isFollowOperationInFlight);
        String str2 = this.errorMessage;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (f10 + hashCode3) * 31;
        SelectedSubpage selectedSubpage = this.selectedSubpage;
        if (selectedSubpage != null) {
            i10 = selectedSubpage.hashCode();
        }
        return this.currentSubpageSortKeys.hashCode() + ((i12 + i10) * 31);
    }

    public final boolean isFollowOperationInFlight() {
        return this.isFollowOperationInFlight;
    }

    public final boolean isLoadingProfile() {
        return this.isLoadingProfile;
    }

    public String toString() {
        String str = this.authorId;
        AuthorProfile authorProfile = this.author;
        boolean z6 = this.isLoadingProfile;
        boolean z10 = this.isFollowOperationInFlight;
        String str2 = this.errorMessage;
        SelectedSubpage selectedSubpage = this.selectedSubpage;
        Map<String, String> map = this.currentSubpageSortKeys;
        StringBuilder sb = new StringBuilder("AuthorProfileState(authorId=");
        sb.append(str);
        sb.append(", author=");
        sb.append(authorProfile);
        sb.append(", isLoadingProfile=");
        ib.i.t(sb, z6, ", isFollowOperationInFlight=", z10, ", errorMessage=");
        sb.append(str2);
        sb.append(", selectedSubpage=");
        sb.append(selectedSubpage);
        sb.append(", currentSubpageSortKeys=");
        sb.append(map);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public AuthorProfileState(String str, AuthorProfile authorProfile, boolean z6, boolean z10, String str2, SelectedSubpage selectedSubpage, Map<String, String> map) {
        map.getClass();
        this.authorId = str;
        this.author = authorProfile;
        this.isLoadingProfile = z6;
        this.isFollowOperationInFlight = z10;
        this.errorMessage = str2;
        this.selectedSubpage = selectedSubpage;
        this.currentSubpageSortKeys = map;
    }

    public AuthorProfileState() {
        this(null, null, false, false, null, null, null, 127, null);
    }
}

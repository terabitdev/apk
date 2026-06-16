package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.domain.model.Voice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract;", "", "State", "CommunityVoicesState", "UiState", SIPHeaderNames.EVENT, "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface VoicePickerSearchListContract {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$Event;", "", "LoadMore", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$Event$LoadMore;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Event {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$Event$LoadMore;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class LoadMore implements Event {
            public static final int $stable = 0;
            public static final LoadMore INSTANCE = new LoadMore();

            private LoadMore() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof LoadMore)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2027943201;
            }

            public String toString() {
                return "LoadMore";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState;", "", "Data", "Loading", "Empty", "Initial", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState$Data;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState$Empty;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState$Initial;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState$Loading;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface UiState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState$Data;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState;", "sections", "", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section;", "isLoadingMore", "", "<init>", "(Ljava/util/List;Z)V", "getSections", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Data implements UiState {
            public static final int $stable = 8;
            private final boolean isLoadingMore;
            private final List<ExploreVoiceSections.Section> sections;

            /* JADX WARN: Multi-variable type inference failed */
            public Data(List<? extends ExploreVoiceSections.Section> list, boolean z6) {
                list.getClass();
                this.sections = list;
                this.isLoadingMore = z6;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Data copy$default(Data data, List list, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = data.sections;
                }
                if ((i10 & 2) != 0) {
                    z6 = data.isLoadingMore;
                }
                return data.copy(list, z6);
            }

            public final List<ExploreVoiceSections.Section> component1() {
                return this.sections;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsLoadingMore() {
                return this.isLoadingMore;
            }

            public final Data copy(List<? extends ExploreVoiceSections.Section> sections, boolean isLoadingMore) {
                sections.getClass();
                return new Data(sections, isLoadingMore);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                if (m.c(this.sections, data.sections) && this.isLoadingMore == data.isLoadingMore) {
                    return true;
                }
                return false;
            }

            public final List<ExploreVoiceSections.Section> getSections() {
                return this.sections;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isLoadingMore) + (this.sections.hashCode() * 31);
            }

            public final boolean isLoadingMore() {
                return this.isLoadingMore;
            }

            public String toString() {
                return "Data(sections=" + this.sections + ", isLoadingMore=" + this.isLoadingMore + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState$Empty;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Empty implements UiState {
            public static final int $stable = 0;
            public static final Empty INSTANCE = new Empty();

            private Empty() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Empty)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 327710026;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState$Initial;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Initial implements UiState {
            public static final int $stable = 0;
            public static final Initial INSTANCE = new Initial();

            private Initial() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Initial)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 673922049;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState$Loading;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Loading implements UiState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Loading)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -937769479;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$CommunityVoicesState;", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/Voice;", "page", "", "hasMore", "", "<init>", "(Ljava/util/List;IZ)V", "getItems", "()Ljava/util/List;", "getPage", "()I", "getHasMore", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class CommunityVoicesState {
        public static final int $stable = 8;
        private final boolean hasMore;
        private final List<Voice> items;
        private final int page;

        public /* synthetic */ CommunityVoicesState(List list, int i10, boolean z6, int i11, f fVar) {
            this((i11 & 1) != 0 ? t.f33547a : list, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? true : z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CommunityVoicesState copy$default(CommunityVoicesState communityVoicesState, List list, int i10, boolean z6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = communityVoicesState.items;
            }
            if ((i11 & 2) != 0) {
                i10 = communityVoicesState.page;
            }
            if ((i11 & 4) != 0) {
                z6 = communityVoicesState.hasMore;
            }
            return communityVoicesState.copy(list, i10, z6);
        }

        public final List<Voice> component1() {
            return this.items;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPage() {
            return this.page;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final CommunityVoicesState copy(List<Voice> r22, int page, boolean hasMore) {
            r22.getClass();
            return new CommunityVoicesState(r22, page, hasMore);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommunityVoicesState)) {
                return false;
            }
            CommunityVoicesState communityVoicesState = (CommunityVoicesState) other;
            if (m.c(this.items, communityVoicesState.items) && this.page == communityVoicesState.page && this.hasMore == communityVoicesState.hasMore) {
                return true;
            }
            return false;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final List<Voice> getItems() {
            return this.items;
        }

        public final int getPage() {
            return this.page;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasMore) + j0.c.b(this.page, this.items.hashCode() * 31, 31);
        }

        public String toString() {
            List<Voice> list = this.items;
            int i10 = this.page;
            boolean z6 = this.hasMore;
            StringBuilder sb = new StringBuilder("CommunityVoicesState(items=");
            sb.append(list);
            sb.append(", page=");
            sb.append(i10);
            sb.append(", hasMore=");
            return n.j(Separators.RPAREN, sb, z6);
        }

        public CommunityVoicesState(List<Voice> list, int i10, boolean z6) {
            list.getClass();
            this.items = list;
            this.page = i10;
            this.hasMore = z6;
        }

        public CommunityVoicesState() {
            this(null, 0, false, 7, null);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\tHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015¨\u0006!"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$State;", "", "favoriteVoices", "", "Lio/elevenlabs/domain/model/Voice;", "defaultVoices", "communityVoices", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$CommunityVoicesState;", "searchQuery", "", "isLoading", "", "<init>", "(Ljava/util/List;Ljava/util/List;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$CommunityVoicesState;Ljava/lang/String;Z)V", "getFavoriteVoices", "()Ljava/util/List;", "getDefaultVoices", "getCommunityVoices", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$CommunityVoicesState;", "getSearchQuery", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final CommunityVoicesState communityVoices;
        private final List<Voice> defaultVoices;
        private final List<Voice> favoriteVoices;
        private final boolean isLoading;
        private final String searchQuery;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ State(List list, List list2, CommunityVoicesState communityVoicesState, String str, boolean z6, int i10, f fVar) {
            this(r13 != 0 ? r0 : list, (i10 & 2) != 0 ? r0 : list2, (i10 & 4) != 0 ? new CommunityVoicesState(null, 0, false, 7, null) : communityVoicesState, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? false : z6);
            int i11 = i10 & 1;
            t tVar = t.f33547a;
        }

        public static /* synthetic */ State copy$default(State state, List list, List list2, CommunityVoicesState communityVoicesState, String str, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = state.favoriteVoices;
            }
            if ((i10 & 2) != 0) {
                list2 = state.defaultVoices;
            }
            if ((i10 & 4) != 0) {
                communityVoicesState = state.communityVoices;
            }
            if ((i10 & 8) != 0) {
                str = state.searchQuery;
            }
            if ((i10 & 16) != 0) {
                z6 = state.isLoading;
            }
            boolean z10 = z6;
            CommunityVoicesState communityVoicesState2 = communityVoicesState;
            return state.copy(list, list2, communityVoicesState2, str, z10);
        }

        public final List<Voice> component1() {
            return this.favoriteVoices;
        }

        public final List<Voice> component2() {
            return this.defaultVoices;
        }

        /* renamed from: component3, reason: from getter */
        public final CommunityVoicesState getCommunityVoices() {
            return this.communityVoices;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSearchQuery() {
            return this.searchQuery;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final State copy(List<Voice> favoriteVoices, List<Voice> defaultVoices, CommunityVoicesState communityVoices, String searchQuery, boolean isLoading) {
            favoriteVoices.getClass();
            defaultVoices.getClass();
            communityVoices.getClass();
            return new State(favoriteVoices, defaultVoices, communityVoices, searchQuery, isLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            if (m.c(this.favoriteVoices, state.favoriteVoices) && m.c(this.defaultVoices, state.defaultVoices) && m.c(this.communityVoices, state.communityVoices) && m.c(this.searchQuery, state.searchQuery) && this.isLoading == state.isLoading) {
                return true;
            }
            return false;
        }

        public final CommunityVoicesState getCommunityVoices() {
            return this.communityVoices;
        }

        public final List<Voice> getDefaultVoices() {
            return this.defaultVoices;
        }

        public final List<Voice> getFavoriteVoices() {
            return this.favoriteVoices;
        }

        public final String getSearchQuery() {
            return this.searchQuery;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (this.communityVoices.hashCode() + n.d(this.favoriteVoices.hashCode() * 31, 31, this.defaultVoices)) * 31;
            String str = this.searchQuery;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return Boolean.hashCode(this.isLoading) + ((hashCode2 + hashCode) * 31);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            List<Voice> list = this.favoriteVoices;
            List<Voice> list2 = this.defaultVoices;
            CommunityVoicesState communityVoicesState = this.communityVoices;
            String str = this.searchQuery;
            boolean z6 = this.isLoading;
            StringBuilder sb = new StringBuilder("State(favoriteVoices=");
            sb.append(list);
            sb.append(", defaultVoices=");
            sb.append(list2);
            sb.append(", communityVoices=");
            sb.append(communityVoicesState);
            sb.append(", searchQuery=");
            sb.append(str);
            sb.append(", isLoading=");
            return n.j(Separators.RPAREN, sb, z6);
        }

        public State(List<Voice> list, List<Voice> list2, CommunityVoicesState communityVoicesState, String str, boolean z6) {
            list.getClass();
            list2.getClass();
            communityVoicesState.getClass();
            this.favoriteVoices = list;
            this.defaultVoices = list2;
            this.communityVoices = communityVoicesState;
            this.searchQuery = str;
            this.isLoading = z6;
        }

        public State() {
            this(null, null, null, null, false, 31, null);
        }
    }
}

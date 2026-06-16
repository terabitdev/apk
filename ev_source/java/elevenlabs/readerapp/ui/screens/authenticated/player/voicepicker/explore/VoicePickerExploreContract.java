package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.domain.model.Voice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract;", "", "State", "CommunityVoicesState", "RecommendedVoicesState", "UiState", SIPHeaderNames.EVENT, "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface VoicePickerExploreContract {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$Event;", "", "LoadMore", "ErrorRetry", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$Event$ErrorRetry;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$Event$LoadMore;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Event {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$Event$ErrorRetry;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ErrorRetry implements Event {
            public static final int $stable = 0;
            public static final ErrorRetry INSTANCE = new ErrorRetry();

            private ErrorRetry() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ErrorRetry)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 550442648;
            }

            public String toString() {
                return "ErrorRetry";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$Event$LoadMore;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
                return 1504618611;
            }

            public String toString() {
                return "LoadMore";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState;", "", "Data", "Loading", "Error", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState$Data;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState$Error;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState$Loading;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface UiState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState$Data;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState;", "sections", "", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section;", "isLoadingMore", "", "<init>", "(Ljava/util/List;Z)V", "getSections", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState$Error;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Error implements UiState {
            public static final int $stable = 0;
            private final String error;

            public Error(String str) {
                str.getClass();
                this.error = str;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = error.error;
                }
                return error.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getError() {
                return this.error;
            }

            public final Error copy(String error) {
                error.getClass();
                return new Error(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Error) && m.c(this.error, ((Error) other).error)) {
                    return true;
                }
                return false;
            }

            public final String getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return defpackage.f.C("Error(error=", this.error, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState$Loading;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
                return 19037415;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState;", "", "Initial", "Loading", "Loaded", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState$Initial;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState$Loaded;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState$Loading;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface RecommendedVoicesState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState$Initial;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Initial implements RecommendedVoicesState {
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
                return -988757361;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState$Loading;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Loading implements RecommendedVoicesState {
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
                return 1694518407;
            }

            public String toString() {
                return "Loading";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState$Loaded;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState;", "result", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/ExploreVoiceSections;", "<init>", "(Lio/elevenlabs/domain/model/AsyncCallResult;)V", "getResult", "()Lio/elevenlabs/domain/model/AsyncCallResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Loaded implements RecommendedVoicesState {
            public static final int $stable = 8;
            private final AsyncCallResult<ExploreVoiceSections> result;

            public /* synthetic */ Loaded(AsyncCallResult asyncCallResult, int i10, kotlin.jvm.internal.f fVar) {
                this((i10 & 1) != 0 ? new AsyncCallResult.Success(new ExploreVoiceSections(t.f33547a)) : asyncCallResult);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Loaded copy$default(Loaded loaded, AsyncCallResult asyncCallResult, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    asyncCallResult = loaded.result;
                }
                return loaded.copy(asyncCallResult);
            }

            public final AsyncCallResult<ExploreVoiceSections> component1() {
                return this.result;
            }

            public final Loaded copy(AsyncCallResult<ExploreVoiceSections> result) {
                result.getClass();
                return new Loaded(result);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Loaded) && m.c(this.result, ((Loaded) other).result)) {
                    return true;
                }
                return false;
            }

            public final AsyncCallResult<ExploreVoiceSections> getResult() {
                return this.result;
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "Loaded(result=" + this.result + Separators.RPAREN;
            }

            public Loaded(AsyncCallResult<ExploreVoiceSections> asyncCallResult) {
                asyncCallResult.getClass();
                this.result = asyncCallResult;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Loaded() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$CommunityVoicesState;", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/Voice;", "page", "", "isLoading", "", "hasMore", "<init>", "(Ljava/util/List;IZZ)V", "getItems", "()Ljava/util/List;", "getPage", "()I", "()Z", "getHasMore", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class CommunityVoicesState {
        public static final int $stable = 8;
        private final boolean hasMore;
        private final boolean isLoading;
        private final List<Voice> items;
        private final int page;

        public /* synthetic */ CommunityVoicesState(List list, int i10, boolean z6, boolean z10, int i11, kotlin.jvm.internal.f fVar) {
            this((i11 & 1) != 0 ? t.f33547a : list, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z6, (i11 & 8) != 0 ? true : z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CommunityVoicesState copy$default(CommunityVoicesState communityVoicesState, List list, int i10, boolean z6, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = communityVoicesState.items;
            }
            if ((i11 & 2) != 0) {
                i10 = communityVoicesState.page;
            }
            if ((i11 & 4) != 0) {
                z6 = communityVoicesState.isLoading;
            }
            if ((i11 & 8) != 0) {
                z10 = communityVoicesState.hasMore;
            }
            return communityVoicesState.copy(list, i10, z6, z10);
        }

        public final List<Voice> component1() {
            return this.items;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPage() {
            return this.page;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final CommunityVoicesState copy(List<Voice> items, int page, boolean isLoading, boolean hasMore) {
            items.getClass();
            return new CommunityVoicesState(items, page, isLoading, hasMore);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommunityVoicesState)) {
                return false;
            }
            CommunityVoicesState communityVoicesState = (CommunityVoicesState) other;
            if (m.c(this.items, communityVoicesState.items) && this.page == communityVoicesState.page && this.isLoading == communityVoicesState.isLoading && this.hasMore == communityVoicesState.hasMore) {
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
            return Boolean.hashCode(this.hasMore) + com.google.android.gms.internal.play_billing.b.f(j0.c.b(this.page, this.items.hashCode() * 31, 31), 31, this.isLoading);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            return "CommunityVoicesState(items=" + this.items + ", page=" + this.page + ", isLoading=" + this.isLoading + ", hasMore=" + this.hasMore + Separators.RPAREN;
        }

        public CommunityVoicesState(List<Voice> list, int i10, boolean z6, boolean z10) {
            list.getClass();
            this.items = list;
            this.page = i10;
            this.isLoading = z6;
            this.hasMore = z10;
        }

        public CommunityVoicesState() {
            this(null, 0, false, false, 15, null);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$State;", "", "recommendedVoices", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState;", "communityVoices", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$CommunityVoicesState;", "allVoices", "", "Lio/elevenlabs/domain/model/Voice;", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$CommunityVoicesState;Ljava/util/List;)V", "getRecommendedVoices", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$RecommendedVoicesState;", "getCommunityVoices", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$CommunityVoicesState;", "getAllVoices", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final List<Voice> allVoices;
        private final CommunityVoicesState communityVoices;
        private final RecommendedVoicesState recommendedVoices;

        public /* synthetic */ State(RecommendedVoicesState recommendedVoicesState, CommunityVoicesState communityVoicesState, List list, int i10, kotlin.jvm.internal.f fVar) {
            this((i10 & 1) != 0 ? RecommendedVoicesState.Initial.INSTANCE : recommendedVoicesState, (i10 & 2) != 0 ? new CommunityVoicesState(null, 0, false, false, 15, null) : communityVoicesState, (i10 & 4) != 0 ? t.f33547a : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, RecommendedVoicesState recommendedVoicesState, CommunityVoicesState communityVoicesState, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                recommendedVoicesState = state.recommendedVoices;
            }
            if ((i10 & 2) != 0) {
                communityVoicesState = state.communityVoices;
            }
            if ((i10 & 4) != 0) {
                list = state.allVoices;
            }
            return state.copy(recommendedVoicesState, communityVoicesState, list);
        }

        /* renamed from: component1, reason: from getter */
        public final RecommendedVoicesState getRecommendedVoices() {
            return this.recommendedVoices;
        }

        /* renamed from: component2, reason: from getter */
        public final CommunityVoicesState getCommunityVoices() {
            return this.communityVoices;
        }

        public final List<Voice> component3() {
            return this.allVoices;
        }

        public final State copy(RecommendedVoicesState recommendedVoices, CommunityVoicesState communityVoices, List<Voice> allVoices) {
            recommendedVoices.getClass();
            communityVoices.getClass();
            allVoices.getClass();
            return new State(recommendedVoices, communityVoices, allVoices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            if (m.c(this.recommendedVoices, state.recommendedVoices) && m.c(this.communityVoices, state.communityVoices) && m.c(this.allVoices, state.allVoices)) {
                return true;
            }
            return false;
        }

        public final List<Voice> getAllVoices() {
            return this.allVoices;
        }

        public final CommunityVoicesState getCommunityVoices() {
            return this.communityVoices;
        }

        public final RecommendedVoicesState getRecommendedVoices() {
            return this.recommendedVoices;
        }

        public int hashCode() {
            return this.allVoices.hashCode() + ((this.communityVoices.hashCode() + (this.recommendedVoices.hashCode() * 31)) * 31);
        }

        public String toString() {
            RecommendedVoicesState recommendedVoicesState = this.recommendedVoices;
            CommunityVoicesState communityVoicesState = this.communityVoices;
            List<Voice> list = this.allVoices;
            StringBuilder sb = new StringBuilder("State(recommendedVoices=");
            sb.append(recommendedVoicesState);
            sb.append(", communityVoices=");
            sb.append(communityVoicesState);
            sb.append(", allVoices=");
            return z.h.e(sb, list, Separators.RPAREN);
        }

        public State(RecommendedVoicesState recommendedVoicesState, CommunityVoicesState communityVoicesState, List<Voice> list) {
            recommendedVoicesState.getClass();
            communityVoicesState.getClass();
            list.getClass();
            this.recommendedVoices = recommendedVoicesState;
            this.communityVoices = communityVoicesState;
            this.allVoices = list;
        }

        public State() {
            this(null, null, null, 7, null);
        }
    }
}

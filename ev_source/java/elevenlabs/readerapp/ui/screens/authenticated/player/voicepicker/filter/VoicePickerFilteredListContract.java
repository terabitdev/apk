package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.Voice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract;", "", "State", "UiState", SIPHeaderNames.EVENT, "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface VoicePickerFilteredListContract {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$Event;", "", "ErrorRetry", "LoadMore", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$Event$ErrorRetry;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$Event$LoadMore;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Event {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$Event$ErrorRetry;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
                return 1538712295;
            }

            public String toString() {
                return "ErrorRetry";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$Event$LoadMore;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
                return -1855243134;
            }

            public String toString() {
                return "LoadMore";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState;", "", "Data", "Error", "Loading", "Empty", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState$Data;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState$Empty;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState$Error;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState$Loading;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface UiState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState$Data;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState;", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/Voice;", "isLoadingMore", "", "<init>", "(Ljava/util/List;Z)V", "getItems", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Data implements UiState {
            public static final int $stable = 8;
            private final boolean isLoadingMore;
            private final List<Voice> items;

            public Data(List<Voice> list, boolean z6) {
                list.getClass();
                this.items = list;
                this.isLoadingMore = z6;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Data copy$default(Data data, List list, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = data.items;
                }
                if ((i10 & 2) != 0) {
                    z6 = data.isLoadingMore;
                }
                return data.copy(list, z6);
            }

            public final List<Voice> component1() {
                return this.items;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsLoadingMore() {
                return this.isLoadingMore;
            }

            public final Data copy(List<Voice> items, boolean isLoadingMore) {
                items.getClass();
                return new Data(items, isLoadingMore);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                if (m.c(this.items, data.items) && this.isLoadingMore == data.isLoadingMore) {
                    return true;
                }
                return false;
            }

            public final List<Voice> getItems() {
                return this.items;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isLoadingMore) + (this.items.hashCode() * 31);
            }

            public final boolean isLoadingMore() {
                return this.isLoadingMore;
            }

            public String toString() {
                return "Data(items=" + this.items + ", isLoadingMore=" + this.isLoadingMore + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState$Empty;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
                return -1598669367;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState$Error;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState$Loading;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
                return -1057461576;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\nHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006 "}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$State;", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/Voice;", "page", "", "isLoading", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "hasMore", "<init>", "(Ljava/util/List;IZLjava/lang/String;Z)V", "getItems", "()Ljava/util/List;", "getPage", "()I", "()Z", "getError", "()Ljava/lang/String;", "getHasMore", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final String error;
        private final boolean hasMore;
        private final boolean isLoading;
        private final List<Voice> items;
        private final int page;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ State(java.util.List r2, int r3, boolean r4, java.lang.String r5, boolean r6, int r7, kotlin.jvm.internal.f r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                tn.t r2 = tn.t.f33547a
            L6:
                r8 = r7 & 2
                if (r8 == 0) goto Lb
                r3 = 0
            Lb:
                r8 = r7 & 4
                r0 = 1
                if (r8 == 0) goto L11
                r4 = r0
            L11:
                r8 = r7 & 8
                if (r8 == 0) goto L16
                r5 = 0
            L16:
                r7 = r7 & 16
                if (r7 == 0) goto L21
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L27
            L21:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L27:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListContract.State.<init>(java.util.List, int, boolean, java.lang.String, boolean, int, kotlin.jvm.internal.f):void");
        }

        public static /* synthetic */ State copy$default(State state, List list, int i10, boolean z6, String str, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = state.items;
            }
            if ((i11 & 2) != 0) {
                i10 = state.page;
            }
            if ((i11 & 4) != 0) {
                z6 = state.isLoading;
            }
            if ((i11 & 8) != 0) {
                str = state.error;
            }
            if ((i11 & 16) != 0) {
                z10 = state.hasMore;
            }
            boolean z11 = z10;
            boolean z12 = z6;
            return state.copy(list, i10, z12, str, z11);
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
        public final String getError() {
            return this.error;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final State copy(List<Voice> items, int page, boolean isLoading, String error, boolean hasMore) {
            items.getClass();
            return new State(items, page, isLoading, error, hasMore);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            if (m.c(this.items, state.items) && this.page == state.page && this.isLoading == state.isLoading && m.c(this.error, state.error) && this.hasMore == state.hasMore) {
                return true;
            }
            return false;
        }

        public final String getError() {
            return this.error;
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
            int hashCode;
            int f10 = com.google.android.gms.internal.play_billing.b.f(j0.c.b(this.page, this.items.hashCode() * 31, 31), 31, this.isLoading);
            String str = this.error;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return Boolean.hashCode(this.hasMore) + ((f10 + hashCode) * 31);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            List<Voice> list = this.items;
            int i10 = this.page;
            boolean z6 = this.isLoading;
            String str = this.error;
            boolean z10 = this.hasMore;
            StringBuilder sb = new StringBuilder("State(items=");
            sb.append(list);
            sb.append(", page=");
            sb.append(i10);
            sb.append(", isLoading=");
            defpackage.f.z(sb, z6, ", error=", str, ", hasMore=");
            return n.j(Separators.RPAREN, sb, z10);
        }

        public State(List<Voice> list, int i10, boolean z6, String str, boolean z10) {
            list.getClass();
            this.items = list;
            this.page = i10;
            this.isLoading = z6;
            this.error = str;
            this.hasMore = z10;
        }

        public State() {
            this(null, 0, false, null, false, 31, null);
        }
    }
}

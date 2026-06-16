package io.elevenlabs.domain.services;

import a9.a;
import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.RawOneTimeProduct;
import io.elevenlabs.domain.model.RawSubscriptionProduct;
import ir.n1;
import ir.z1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003&'(J*\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\n\u0010\bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\u0003H¦@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0001H¦@¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005H¦@¢\u0006\u0004\b\u0019\u0010\u0018J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00052\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0001H¦@¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006)À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService;", "", "", "", "productIds", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/RawOneTimeProduct;", "getProducts", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/RawSubscriptionProduct;", "getSubscriptionProducts", "productId", "getGooglePlayProduct", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "activity", "Lio/elevenlabs/domain/services/PurchasesService$PurchaseResult;", FirebaseAnalytics.Event.PURCHASE, "(Ljava/lang/String;Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "", "withFreeTrial", "subscribe", "(Ljava/lang/String;Ljava/lang/Object;ZLwn/c;)Ljava/lang/Object;", "Lsn/z;", "ensureAuthenticated", "(Lwn/c;)Ljava/lang/Object;", "restorePurchases", "readId", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult;", "purchaseRead", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "Lir/z1;", "isEligibleForTrial", "()Lir/z1;", "Lir/n1;", "Lio/elevenlabs/domain/services/PurchasesService$CustomerCenterEvent;", "getCustomerCenterEvents", "()Lir/n1;", "customerCenterEvents", "PurchaseResult", "CustomerCenterEvent", "ReadPurchaseResult", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface PurchasesService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$CustomerCenterEvent;", "", "CustomAction", "Lio/elevenlabs/domain/services/PurchasesService$CustomerCenterEvent$CustomAction;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface CustomerCenterEvent {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$CustomerCenterEvent$CustomAction;", "Lio/elevenlabs/domain/services/PurchasesService$CustomerCenterEvent;", "actionId", "", "purchaseId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getActionId", "()Ljava/lang/String;", "getPurchaseId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CustomAction implements CustomerCenterEvent {
            private final String actionId;
            private final String purchaseId;

            public CustomAction(String str, String str2) {
                str.getClass();
                this.actionId = str;
                this.purchaseId = str2;
            }

            public static /* synthetic */ CustomAction copy$default(CustomAction customAction, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = customAction.actionId;
                }
                if ((i10 & 2) != 0) {
                    str2 = customAction.purchaseId;
                }
                return customAction.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getActionId() {
                return this.actionId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getPurchaseId() {
                return this.purchaseId;
            }

            public final CustomAction copy(String actionId, String purchaseId) {
                actionId.getClass();
                return new CustomAction(actionId, purchaseId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CustomAction)) {
                    return false;
                }
                CustomAction customAction = (CustomAction) other;
                if (m.c(this.actionId, customAction.actionId) && m.c(this.purchaseId, customAction.purchaseId)) {
                    return true;
                }
                return false;
            }

            public final String getActionId() {
                return this.actionId;
            }

            public final String getPurchaseId() {
                return this.purchaseId;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.actionId.hashCode() * 31;
                String str = this.purchaseId;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                return h.c("CustomAction(actionId=", this.actionId, ", purchaseId=", this.purchaseId, Separators.RPAREN);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$PurchaseResult;", "", "Cancelled", "Purchased", "Lio/elevenlabs/domain/services/PurchasesService$PurchaseResult$Cancelled;", "Lio/elevenlabs/domain/services/PurchasesService$PurchaseResult$Purchased;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface PurchaseResult {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$PurchaseResult$Cancelled;", "Lio/elevenlabs/domain/services/PurchasesService$PurchaseResult;", "<init>", "()V", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Cancelled implements PurchaseResult {
            public static final Cancelled INSTANCE = new Cancelled();

            private Cancelled() {
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$PurchaseResult$Purchased;", "Lio/elevenlabs/domain/services/PurchasesService$PurchaseResult;", "transactionId", "", "<init>", "(Ljava/lang/String;)V", "getTransactionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Purchased implements PurchaseResult {
            private final String transactionId;

            public Purchased(String str) {
                this.transactionId = str;
            }

            public static /* synthetic */ Purchased copy$default(Purchased purchased, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = purchased.transactionId;
                }
                return purchased.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTransactionId() {
                return this.transactionId;
            }

            public final Purchased copy(String transactionId) {
                return new Purchased(transactionId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Purchased) && m.c(this.transactionId, ((Purchased) other).transactionId)) {
                    return true;
                }
                return false;
            }

            public final String getTransactionId() {
                return this.transactionId;
            }

            public int hashCode() {
                String str = this.transactionId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return f.C("Purchased(transactionId=", this.transactionId, Separators.RPAREN);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult;", "", "Error", "Cancelled", "PurchaseSuccess", "PurchasePending", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Cancelled;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$PurchasePending;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$PurchaseSuccess;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface ReadPurchaseResult {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Cancelled;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult;", "<init>", "()V", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Cancelled implements ReadPurchaseResult {
            public static final Cancelled INSTANCE = new Cancelled();

            private Cancelled() {
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult;", "ItemNotAvailable", "ConnectionError", "UnknownError", "BillingUnavailable", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error$BillingUnavailable;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error$ConnectionError;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error$ItemNotAvailable;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error$UnknownError;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public interface Error extends ReadPurchaseResult {

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error$BillingUnavailable;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error;", "<init>", "()V", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class BillingUnavailable implements Error {
                public static final BillingUnavailable INSTANCE = new BillingUnavailable();

                private BillingUnavailable() {
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error$ConnectionError;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error;", "<init>", "()V", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class ConnectionError implements Error {
                public static final ConnectionError INSTANCE = new ConnectionError();

                private ConnectionError() {
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error$ItemNotAvailable;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error;", "<init>", "()V", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class ItemNotAvailable implements Error {
                public static final ItemNotAvailable INSTANCE = new ItemNotAvailable();

                private ItemNotAvailable() {
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error$UnknownError;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$Error;", "<init>", "()V", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class UnknownError implements Error {
                public static final UnknownError INSTANCE = new UnknownError();

                private UnknownError() {
                }
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$PurchasePending;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult;", "<init>", "()V", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class PurchasePending implements ReadPurchaseResult {
            public static final PurchasePending INSTANCE = new PurchasePending();

            private PurchasePending() {
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult$PurchaseSuccess;", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult;", "<init>", "()V", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class PurchaseSuccess implements ReadPurchaseResult {
            public static final PurchaseSuccess INSTANCE = new PurchaseSuccess();

            private PurchaseSuccess() {
            }
        }
    }

    static /* synthetic */ Object subscribe$default(PurchasesService purchasesService, String str, Object obj, boolean z6, c cVar, int i10, Object obj2) {
        if (obj2 == null) {
            if ((i10 & 4) != 0) {
                z6 = true;
            }
            return purchasesService.subscribe(str, obj, z6, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: subscribe");
        return null;
    }

    Object ensureAuthenticated(c<? super z> cVar);

    n1 getCustomerCenterEvents();

    Object getGooglePlayProduct(String str, c<? super AsyncCallResult<RawOneTimeProduct>> cVar);

    Object getProducts(List<String> list, c<? super AsyncCallResult<List<RawOneTimeProduct>>> cVar);

    Object getSubscriptionProducts(List<String> list, c<? super AsyncCallResult<List<RawSubscriptionProduct>>> cVar);

    /* renamed from: isEligibleForTrial */
    z1 getIsEligibleForTrial();

    Object purchase(String str, Object obj, c<? super AsyncCallResult<PurchaseResult>> cVar);

    Object purchaseRead(String str, String str2, Object obj, c<? super AsyncCallResult<ReadPurchaseResult>> cVar);

    Object restorePurchases(c<? super AsyncCallResult<z>> cVar);

    Object subscribe(String str, Object obj, boolean z6, c<? super AsyncCallResult<PurchaseResult>> cVar);
}

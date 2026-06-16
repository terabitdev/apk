package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`_B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015B±\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001cJ\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010'JÀ\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001cJ\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010>\u0012\u0004\bC\u0010A\u001a\u0004\bB\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010>\u0012\u0004\bE\u0010A\u001a\u0004\bD\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010>\u0012\u0004\bG\u0010A\u001a\u0004\bF\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\bI\u0010A\u001a\u0004\bH\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010>\u0012\u0004\bK\u0010A\u001a\u0004\bJ\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\bM\u0010A\u001a\u0004\bL\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010N\u0012\u0004\bP\u0010A\u001a\u0004\bO\u0010$R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010N\u0012\u0004\bR\u0010A\u001a\u0004\bQ\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010S\u0012\u0004\bU\u0010A\u001a\u0004\bT\u0010'R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010>\u0012\u0004\bW\u0010A\u001a\u0004\bV\u0010\u001cR\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010N\u0012\u0004\bY\u0010A\u001a\u0004\bX\u0010$R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010>\u0012\u0004\b[\u0010A\u001a\u0004\bZ\u0010\u001cR\"\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010S\u0012\u0004\b\\\u0010A\u001a\u0004\b\u0012\u0010'R\"\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010S\u0012\u0004\b^\u0010A\u001a\u0004\b]\u0010'¨\u0006a"}, d2 = {"Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "", "", "id", "title", "subtitle", "description", "url", "language", "imageUrl", "", "lastOpenedAtUnix", "updatedAtUnix", "", "hasUnread", "category", "itemCount", ParameterNames.ICON, "isOwner", "inUserLibrary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Long;", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/CollectionMetaResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "getDescription", "getDescription$annotations", "getUrl", "getUrl$annotations", "getLanguage", "getLanguage$annotations", "getImageUrl", "getImageUrl$annotations", "Ljava/lang/Long;", "getLastOpenedAtUnix", "getLastOpenedAtUnix$annotations", "getUpdatedAtUnix", "getUpdatedAtUnix$annotations", "Ljava/lang/Boolean;", "getHasUnread", "getHasUnread$annotations", "getCategory", "getCategory$annotations", "getItemCount", "getItemCount$annotations", "getIcon", "getIcon$annotations", "isOwner$annotations", "getInUserLibrary", "getInUserLibrary$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class CollectionMetaResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String category;
    private final String description;
    private final Boolean hasUnread;
    private final String icon;
    private final String id;
    private final String imageUrl;
    private final Boolean inUserLibrary;
    private final Boolean isOwner;
    private final Long itemCount;
    private final String language;
    private final Long lastOpenedAtUnix;
    private final String subtitle;
    private final String title;
    private final Long updatedAtUnix;
    private final String url;

    public /* synthetic */ CollectionMetaResponse(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l4, Long l7, Boolean bool, String str8, Long l10, String str9, Boolean bool2, Boolean bool3, c1 c1Var) {
        Long l11;
        Boolean bool4;
        Boolean bool5;
        if (3 == (i10 & 3)) {
            this.id = str;
            this.title = str2;
            if ((i10 & 4) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str3;
            }
            if ((i10 & 8) == 0) {
                this.description = null;
            } else {
                this.description = str4;
            }
            if ((i10 & 16) == 0) {
                this.url = null;
            } else {
                this.url = str5;
            }
            if ((i10 & 32) == 0) {
                this.language = null;
            } else {
                this.language = str6;
            }
            if ((i10 & 64) == 0) {
                this.imageUrl = null;
            } else {
                this.imageUrl = str7;
            }
            if ((i10 & 128) == 0) {
                this.lastOpenedAtUnix = null;
            } else {
                this.lastOpenedAtUnix = l4;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                this.updatedAtUnix = null;
            } else {
                this.updatedAtUnix = l7;
            }
            if ((i10 & 512) == 0) {
                this.hasUnread = Boolean.FALSE;
            } else {
                this.hasUnread = bool;
            }
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                this.category = null;
            } else {
                this.category = str8;
            }
            if ((i10 & 2048) == 0) {
                l11 = 0L;
            } else {
                l11 = l10;
            }
            this.itemCount = l11;
            if ((i10 & 4096) == 0) {
                this.icon = null;
            } else {
                this.icon = str9;
            }
            if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
                bool4 = Boolean.FALSE;
            } else {
                bool4 = bool2;
            }
            this.isOwner = bool4;
            if ((i10 & 16384) == 0) {
                bool5 = Boolean.FALSE;
            } else {
                bool5 = bool3;
            }
            this.inUserLibrary = bool5;
            return;
        }
        t0.j(i10, 3, CollectionMetaResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ CollectionMetaResponse copy$default(CollectionMetaResponse collectionMetaResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l4, Long l7, Boolean bool, String str8, Long l10, String str9, Boolean bool2, Boolean bool3, int i10, Object obj) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Long l11;
        Long l12;
        Boolean bool4;
        String str17;
        Long l13;
        String str18;
        Boolean bool5;
        Boolean bool6;
        if ((i10 & 1) != 0) {
            str10 = collectionMetaResponse.id;
        } else {
            str10 = str;
        }
        if ((i10 & 2) != 0) {
            str11 = collectionMetaResponse.title;
        } else {
            str11 = str2;
        }
        if ((i10 & 4) != 0) {
            str12 = collectionMetaResponse.subtitle;
        } else {
            str12 = str3;
        }
        if ((i10 & 8) != 0) {
            str13 = collectionMetaResponse.description;
        } else {
            str13 = str4;
        }
        if ((i10 & 16) != 0) {
            str14 = collectionMetaResponse.url;
        } else {
            str14 = str5;
        }
        if ((i10 & 32) != 0) {
            str15 = collectionMetaResponse.language;
        } else {
            str15 = str6;
        }
        if ((i10 & 64) != 0) {
            str16 = collectionMetaResponse.imageUrl;
        } else {
            str16 = str7;
        }
        if ((i10 & 128) != 0) {
            l11 = collectionMetaResponse.lastOpenedAtUnix;
        } else {
            l11 = l4;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            l12 = collectionMetaResponse.updatedAtUnix;
        } else {
            l12 = l7;
        }
        if ((i10 & 512) != 0) {
            bool4 = collectionMetaResponse.hasUnread;
        } else {
            bool4 = bool;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str17 = collectionMetaResponse.category;
        } else {
            str17 = str8;
        }
        if ((i10 & 2048) != 0) {
            l13 = collectionMetaResponse.itemCount;
        } else {
            l13 = l10;
        }
        if ((i10 & 4096) != 0) {
            str18 = collectionMetaResponse.icon;
        } else {
            str18 = str9;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            bool5 = collectionMetaResponse.isOwner;
        } else {
            bool5 = bool2;
        }
        if ((i10 & 16384) != 0) {
            bool6 = collectionMetaResponse.inUserLibrary;
        } else {
            bool6 = bool3;
        }
        return collectionMetaResponse.copy(str10, str11, str12, str13, str14, str15, str16, l11, l12, bool4, str17, l13, str18, bool5, bool6);
    }

    public static final /* synthetic */ void write$Self$data_release(CollectionMetaResponse self, tr.b output, SerialDescriptor serialDesc) {
        Long l4;
        output.V(serialDesc, 0, self.id);
        output.V(serialDesc, 1, self.title);
        if (output.C(serialDesc) || self.subtitle != null) {
            output.o(serialDesc, 2, g1.f34588a, self.subtitle);
        }
        if (output.C(serialDesc) || self.description != null) {
            output.o(serialDesc, 3, g1.f34588a, self.description);
        }
        if (output.C(serialDesc) || self.url != null) {
            output.o(serialDesc, 4, g1.f34588a, self.url);
        }
        if (output.C(serialDesc) || self.language != null) {
            output.o(serialDesc, 5, g1.f34588a, self.language);
        }
        if (output.C(serialDesc) || self.imageUrl != null) {
            output.o(serialDesc, 6, g1.f34588a, self.imageUrl);
        }
        if (output.C(serialDesc) || self.lastOpenedAtUnix != null) {
            output.o(serialDesc, 7, l0.f34611a, self.lastOpenedAtUnix);
        }
        if (output.C(serialDesc) || self.updatedAtUnix != null) {
            output.o(serialDesc, 8, l0.f34611a, self.updatedAtUnix);
        }
        if (output.C(serialDesc) || !m.c(self.hasUnread, Boolean.FALSE)) {
            output.o(serialDesc, 9, ur.g.f34583a, self.hasUnread);
        }
        if (output.C(serialDesc) || self.category != null) {
            output.o(serialDesc, 10, g1.f34588a, self.category);
        }
        if (output.C(serialDesc) || (l4 = self.itemCount) == null || l4.longValue() != 0) {
            output.o(serialDesc, 11, l0.f34611a, self.itemCount);
        }
        if (output.C(serialDesc) || self.icon != null) {
            output.o(serialDesc, 12, g1.f34588a, self.icon);
        }
        if (output.C(serialDesc) || !m.c(self.isOwner, Boolean.FALSE)) {
            output.o(serialDesc, 13, ur.g.f34583a, self.isOwner);
        }
        if (output.C(serialDesc) || !m.c(self.inUserLibrary, Boolean.FALSE)) {
            output.o(serialDesc, 14, ur.g.f34583a, self.inUserLibrary);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getHasUnread() {
        return this.hasUnread;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component12, reason: from getter */
    public final Long getItemCount() {
        return this.itemCount;
    }

    /* renamed from: component13, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getIsOwner() {
        return this.isOwner;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getInUserLibrary() {
        return this.inUserLibrary;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component7, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getLastOpenedAtUnix() {
        return this.lastOpenedAtUnix;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    public final CollectionMetaResponse copy(String id2, String title, String subtitle, String description, String url, String language, String imageUrl, Long lastOpenedAtUnix, Long updatedAtUnix, Boolean hasUnread, String category, Long itemCount, String icon, Boolean isOwner, Boolean inUserLibrary) {
        id2.getClass();
        title.getClass();
        return new CollectionMetaResponse(id2, title, subtitle, description, url, language, imageUrl, lastOpenedAtUnix, updatedAtUnix, hasUnread, category, itemCount, icon, isOwner, inUserLibrary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionMetaResponse)) {
            return false;
        }
        CollectionMetaResponse collectionMetaResponse = (CollectionMetaResponse) other;
        if (m.c(this.id, collectionMetaResponse.id) && m.c(this.title, collectionMetaResponse.title) && m.c(this.subtitle, collectionMetaResponse.subtitle) && m.c(this.description, collectionMetaResponse.description) && m.c(this.url, collectionMetaResponse.url) && m.c(this.language, collectionMetaResponse.language) && m.c(this.imageUrl, collectionMetaResponse.imageUrl) && m.c(this.lastOpenedAtUnix, collectionMetaResponse.lastOpenedAtUnix) && m.c(this.updatedAtUnix, collectionMetaResponse.updatedAtUnix) && m.c(this.hasUnread, collectionMetaResponse.hasUnread) && m.c(this.category, collectionMetaResponse.category) && m.c(this.itemCount, collectionMetaResponse.itemCount) && m.c(this.icon, collectionMetaResponse.icon) && m.c(this.isOwner, collectionMetaResponse.isOwner) && m.c(this.inUserLibrary, collectionMetaResponse.inUserLibrary)) {
            return true;
        }
        return false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getHasUnread() {
        return this.hasUnread;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Boolean getInUserLibrary() {
        return this.inUserLibrary;
    }

    public final Long getItemCount() {
        return this.itemCount;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Long getLastOpenedAtUnix() {
        return this.lastOpenedAtUnix;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int c5 = j0.c.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        String str2 = this.description;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.url;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.language;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str5 = this.imageUrl;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Long l4 = this.lastOpenedAtUnix;
        if (l4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l4.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Long l7 = this.updatedAtUnix;
        if (l7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l7.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        Boolean bool = this.hasUnread;
        if (bool == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str6 = this.category;
        if (str6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str6.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        Long l10 = this.itemCount;
        if (l10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = l10.hashCode();
        }
        int i20 = (i19 + hashCode10) * 31;
        String str7 = this.icon;
        if (str7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str7.hashCode();
        }
        int i21 = (i20 + hashCode11) * 31;
        Boolean bool2 = this.isOwner;
        if (bool2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = bool2.hashCode();
        }
        int i22 = (i21 + hashCode12) * 31;
        Boolean bool3 = this.inUserLibrary;
        if (bool3 != null) {
            i10 = bool3.hashCode();
        }
        return i22 + i10;
    }

    public final Boolean isOwner() {
        return this.isOwner;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.description;
        String str5 = this.url;
        String str6 = this.language;
        String str7 = this.imageUrl;
        Long l4 = this.lastOpenedAtUnix;
        Long l7 = this.updatedAtUnix;
        Boolean bool = this.hasUnread;
        String str8 = this.category;
        Long l10 = this.itemCount;
        String str9 = this.icon;
        Boolean bool2 = this.isOwner;
        Boolean bool3 = this.inUserLibrary;
        StringBuilder s10 = f.s("CollectionMetaResponse(id=", str, ", title=", str2, ", subtitle=");
        f.x(s10, str3, ", description=", str4, ", url=");
        f.x(s10, str5, ", language=", str6, ", imageUrl=");
        s10.append(str7);
        s10.append(", lastOpenedAtUnix=");
        s10.append(l4);
        s10.append(", updatedAtUnix=");
        s10.append(l7);
        s10.append(", hasUnread=");
        s10.append(bool);
        s10.append(", category=");
        s10.append(str8);
        s10.append(", itemCount=");
        s10.append(l10);
        s10.append(", icon=");
        s10.append(str9);
        s10.append(", isOwner=");
        s10.append(bool2);
        s10.append(", inUserLibrary=");
        s10.append(bool3);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/CollectionMetaResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return CollectionMetaResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getHasUnread$annotations() {
    }

    public static /* synthetic */ void getIcon$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getImageUrl$annotations() {
    }

    public static /* synthetic */ void getInUserLibrary$annotations() {
    }

    public static /* synthetic */ void getItemCount$annotations() {
    }

    public static /* synthetic */ void getLanguage$annotations() {
    }

    public static /* synthetic */ void getLastOpenedAtUnix$annotations() {
    }

    public static /* synthetic */ void getSubtitle$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getUpdatedAtUnix$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public static /* synthetic */ void isOwner$annotations() {
    }

    public CollectionMetaResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l4, Long l7, Boolean bool, String str8, Long l10, String str9, Boolean bool2, Boolean bool3) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.description = str4;
        this.url = str5;
        this.language = str6;
        this.imageUrl = str7;
        this.lastOpenedAtUnix = l4;
        this.updatedAtUnix = l7;
        this.hasUnread = bool;
        this.category = str8;
        this.itemCount = l10;
        this.icon = str9;
        this.isOwner = bool2;
        this.inUserLibrary = bool3;
    }

    public /* synthetic */ CollectionMetaResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l4, Long l7, Boolean bool, String str8, Long l10, String str9, Boolean bool2, Boolean bool3, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : l4, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : l7, (i10 & 512) != 0 ? Boolean.FALSE : bool, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : str8, (i10 & 2048) != 0 ? 0L : l10, (i10 & 4096) != 0 ? null : str9, (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? Boolean.FALSE : bool2, (i10 & 16384) != 0 ? Boolean.FALSE : bool3);
    }
}

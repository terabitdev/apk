package io.elevenlabs.data.services;

import io.elevenlabs.data.model.response.CollectionMetaResponse;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.player.BackgroundPlayerAction;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.a0;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u000b\u001a\u0004\u0018\u00010\u0006*\u00020\u0005\u001a\f\u0010\f\u001a\u0004\u0018\u00010\u0005*\u00020\u0006\"\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"toDomain", "Lio/elevenlabs/domain/model/CollectionMeta;", "Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "stringToIconMap", "", "", "Lio/elevenlabs/domain/model/CollectionMeta$Icon;", "getStringToIconMap", "()Ljava/util/Map;", "iconToStringMap", "getIconToStringMap", "toCollectionIcon", "toStringValue", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CollectionsServiceImplKt {
    private static final Map<CollectionMeta.Icon, String> iconToStringMap;
    private static final Map<String, CollectionMeta.Icon> stringToIconMap;

    static {
        Map<String, CollectionMeta.Icon> J = a0.J(new sn.k("folder-1", CollectionMeta.Icon.Folder), new sn.k(BackgroundPlayerAction.Bookmark.ACTION_ID, CollectionMeta.Icon.Bookmark), new sn.k("book", CollectionMeta.Icon.Book), new sn.k("book-open", CollectionMeta.Icon.BookOpen), new sn.k("pencil", CollectionMeta.Icon.Pencil), new sn.k("newspaper", CollectionMeta.Icon.Newspaper), new sn.k("microphone", CollectionMeta.Icon.Microphone), new sn.k("robot", CollectionMeta.Icon.Robot), new sn.k("star", CollectionMeta.Icon.Star), new sn.k("pencil-sparkle", CollectionMeta.Icon.PencilSparkle), new sn.k("audio", CollectionMeta.Icon.Audio), new sn.k("fork-knife", CollectionMeta.Icon.ForkKnife));
        stringToIconMap = J;
        Set<Map.Entry<String, CollectionMeta.Icon>> entrySet = J.entrySet();
        int H = a0.H(p.a0(entrySet, 10));
        if (H < 16) {
            H = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put((CollectionMeta.Icon) entry.getValue(), (String) entry.getKey());
        }
        iconToStringMap = linkedHashMap;
    }

    public static final Map<CollectionMeta.Icon, String> getIconToStringMap() {
        return iconToStringMap;
    }

    public static final Map<String, CollectionMeta.Icon> getStringToIconMap() {
        return stringToIconMap;
    }

    public static final CollectionMeta.Icon toCollectionIcon(String str) {
        str.getClass();
        return stringToIconMap.get(str);
    }

    public static final CollectionMeta toDomain(CollectionMetaResponse collectionMetaResponse) {
        Date date;
        Date date2;
        CollectionMeta.Icon icon;
        collectionMetaResponse.getClass();
        String id2 = collectionMetaResponse.getId();
        String title = collectionMetaResponse.getTitle();
        String subtitle = collectionMetaResponse.getSubtitle();
        String description = collectionMetaResponse.getDescription();
        String imageUrl = collectionMetaResponse.getImageUrl();
        Boolean hasUnread = collectionMetaResponse.getHasUnread();
        Boolean bool = Boolean.TRUE;
        boolean c5 = m.c(hasUnread, bool);
        Long lastOpenedAtUnix = collectionMetaResponse.getLastOpenedAtUnix();
        xq.d dVar = xq.d.SECONDS;
        if (lastOpenedAtUnix != null) {
            long longValue = lastOpenedAtUnix.longValue();
            xq.a aVar = xq.b.f38124b;
            date = new Date(xq.b.d(xq.g.o(longValue, dVar)));
        } else {
            date = null;
        }
        Long updatedAtUnix = collectionMetaResponse.getUpdatedAtUnix();
        if (updatedAtUnix != null) {
            long longValue2 = updatedAtUnix.longValue();
            xq.a aVar2 = xq.b.f38124b;
            date2 = new Date(xq.b.d(xq.g.o(longValue2, dVar)));
        } else {
            date2 = null;
        }
        Long itemCount = collectionMetaResponse.getItemCount();
        boolean c10 = m.c(collectionMetaResponse.isOwner(), bool);
        String category = collectionMetaResponse.getCategory();
        String icon2 = collectionMetaResponse.getIcon();
        if (icon2 != null) {
            icon = toCollectionIcon(icon2);
        } else {
            icon = null;
        }
        return new CollectionMeta(id2, title, subtitle, description, imageUrl, c5, date, date2, category, itemCount, c10, icon);
    }

    public static final String toStringValue(CollectionMeta.Icon icon) {
        icon.getClass();
        return iconToStringMap.get(icon);
    }
}

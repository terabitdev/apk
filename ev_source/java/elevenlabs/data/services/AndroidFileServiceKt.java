package io.elevenlabs.data.services;

import android.content.Context;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¨\u0006\u0006"}, d2 = {"getGrantedPermissionsForQuery", "", "context", "Landroid/content/Context;", "fileUri", "Landroid/net/Uri;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AndroidFileServiceKt {
    public static final /* synthetic */ String access$getGrantedPermissionsForQuery(Context context, Uri uri) {
        return getGrantedPermissionsForQuery(context, uri);
    }

    public static final String getGrantedPermissionsForQuery(Context context, Uri uri) {
        boolean isExternalStorageManager;
        ArrayList arrayList = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (y5.c.a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                arrayList.add("READ_EXTERNAL_STORAGE");
            }
        } else {
            if (y5.c.a(context, "android.permission.READ_MEDIA_IMAGES") == 0) {
                arrayList.add("READ_MEDIA_IMAGES");
            }
            if (y5.c.a(context, "android.permission.READ_MEDIA_VIDEO") == 0) {
                arrayList.add("READ_MEDIA_VIDEO");
            }
            if (y5.c.a(context, "android.permission.READ_MEDIA_AUDIO") == 0) {
                arrayList.add("READ_MEDIA_AUDIO");
            }
        }
        if (i10 >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (isExternalStorageManager) {
                arrayList.add("MANAGE_EXTERNAL_STORAGE");
            }
        }
        List<UriPermission> persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
        persistedUriPermissions.getClass();
        if (!persistedUriPermissions.isEmpty()) {
            Iterator<T> it = persistedUriPermissions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UriPermission uriPermission = (UriPermission) it.next();
                if (m.c(uriPermission.getUri(), uri) && uriPermission.isReadPermission()) {
                    arrayList.add("URI_READ_PERMISSION");
                    break;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return "No required permissions granted.";
        }
        return "Granted permissions: ".concat(o.E0(arrayList, ", ", null, null, null, 62));
    }
}

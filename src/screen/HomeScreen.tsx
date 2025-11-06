import { StyleSheet, Text, View } from "react-native";

export default function HomeScreen(){
    return (
        <View style={styles.container}>
            <Text style={styles.text } >Hola Mundo aa</Text>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        padding: 10,
    }, 
    text: {
        color: '#fff',
    }
})